package array_1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_AR06 {
    public static void main(String args[]) throws IOException {

        //這題沒有講搜尋陣列的大小 無法使用scanner，否則會一直卡在輸入無法停止
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //目標字串
        char target[] = br.readLine().toCharArray();
        if (target.length>10) {
            System.out.println("Target Overflow");
            return;
        }

        //先設定可能的array最大大小 20*20 + 20(20行的換行字元'\n')
        char c[] = new char[20*20+20];
        br.read(c);

        //碰到換行 字元 就知道一行有幾個字元，以及總共有幾行
        int colCount=0, rowCount=0;
        for(; colCount<c.length; colCount++) {
            if (c[colCount]=='\n') {
                rowCount++;
            }
            //char的預設值為'\u0000'，因為最後一行沒有換行所以不能用換行判斷
            else if (c[colCount] == '\u0000') {
                rowCount++;
                break;
            }
        }
        //實際上colCount多算了'\n'換行字元，但是index從0開始計算 所以實際上colCount為
        //一行字元數*行數 + 行數(幾個換行字元) -1，整數相除剛好可無條件捨去，也會得到正確一行字元數
        colCount /= rowCount;

        //超過限制直接停止
        if (colCount>20 || rowCount>20) {
            System.out.println("Array Overflow");
        }

        //轉成二維char array
        char array[][] = new char[rowCount][colCount];
        for(int i=0, row=0, col=0; i<c.length; i++, col++) {
            if(c[i] == '\n') {
                //換行從 下一行第一個字元開始寫入
                col=-1;
                row++;
                continue;
            }
            //沒有東西就停止
            else if(c[i] == '\u0000') {
                break;
            }
            array[row][col] = c[i];
        }

        //用來記錄start和end的座標
        String startAndEnd[] = new String[2];

        for(int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                //從targer字串第一個開始地回搜尋
                search(i, j, array, 0, target, startAndEnd, 1);
                search(i, j, array, 0, target, startAndEnd, 2);
                search(i, j, array, 0, target, startAndEnd, 3);
                search(i, j, array, 0, target, startAndEnd, 4);
                search(i, j, array, 0, target, startAndEnd, 5);
                search(i, j, array, 0, target, startAndEnd, 6);
                search(i, j, array, 0, target, startAndEnd, 7);
                search(i, j, array, 0, target, startAndEnd, 8);
            }
        }
    }

    public static void search(int row, int col, char[][] array, int index, char[] target, String[] startAndEnd, int direction) {
        //超出array範圍就停止
        if (!(row>=0 && col>=0 && row<array.length && col<array[0].length) )
            return;

        //比對
        if (target[index] == array[row][col]) {
            //比對到最後一個字都正確，輸出
            if (index == target.length-1) {
                startAndEnd[1] = row + ", " + col;
                System.out.println(startAndEnd[0]+" To "+startAndEnd[1]);
                return;
            }

            //紀錄起點
            if(index == 0)
                startAndEnd[0] = row+", "+col;

            //遞回
            switch (direction) {
                case 1: //左 row, col-1
                    search(row, col-1, array, index+1, target, startAndEnd, 1);
                    break;
                case 2://左上 row-1, col-1
                    search(row-1, col-1, array, index+1, target, startAndEnd, 2);
                    break;
                case 3://上 row-1, col
                    search(row-1, col, array, index+1, target, startAndEnd, 3);
                    break;
                case 4://右上 row-1, col+1
                    search(row-1, col+1, array, index+1, target, startAndEnd, 4);
                    break;
                case 5://右 row, col+1
                    search(row, col+1, array, index+1, target, startAndEnd, 5);
                    break;
                case 6:
                    //右下 row+1, col+1
                    search(row+1, col+1, array, index+1, target, startAndEnd, 6);
                    break;
                case 7:
                    //下 row+1, col
                    search(row+1, col, array, index+1, target, startAndEnd, 7);
                    break;
                case 8:
                    //左下 row+1, col-1
                    search(row+1, col-1, array, index+1, target, startAndEnd, 8);
                    break;
            }
        }
    }
}
