package math_1;

import java.util.*;
import java.util.stream.Collectors;

public class C_MM22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //總線段 個數
        int totalLine = sc.nextInt();
        //目標總 子線段 數量
        int targetTotalLine = sc.nextInt();

        //吃掉第一行的換行
        sc.nextLine();
        //吃掉第二行的換行(不用管每個線段有多少的子線段，直接用split分割)
        sc.nextLine();

        //宣告 一個二維arraylist
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        //存入每一個子線段的資料
        for (int i = 0; i < totalLine; i++) {
            //每個線段要先新增
            lines.add(new ArrayList<Integer>());

            //每一行用 空白 分割，取得每個子線段
            String[] tmp = sc.nextLine().split(" ");

            //將每個子線段存入(第一個先存，後面累加)
            int subLineLen = Integer.valueOf(tmp[0]);
            lines.get(i).add(subLineLen);
            for (int j = 1; j < tmp.length; j++) {
                //該子線段長度
                subLineLen = Integer.valueOf(tmp[j]);

                //累積總長度
                int tmpTotalLen = lines.get(i).get(j - 1) + subLineLen;
                lines.get(i).add(tmpTotalLen);
            }
        }


        //檢測用 印出轉換後的資料
        /*for (ArrayList<Integer> line : lines) {
            for (int subLineLen : line) {
                System.out.print("總長度:" + subLineLen + "\t\t");
            }
            System.out.println();
        }*/


        //最後分別找出 各長度的最佳解相加後 找最大的
        //如: 目標長度5 分別找
        //(1) 0,5 一段線段有5個子線段的最佳長度 (長度0不用找)(第一個不用遞迴)
        //(2) 1,4 1個子線段總數的最佳長度 + 4個子線段總數的最佳長度
        //(3) 2,3
        //(4) 3,2
        //(5) 2,1
        //最後 往下遞迴

        //儲存有用過的線段，不能再使用
        ArrayList<Integer> usedLines = new ArrayList<>();

        Result result = findMax(lines, targetTotalLine, usedLines);

        System.out.println(result.maxLen);
        //先排序，讓線段由小到大輸出
        Collections.sort(result.outputList);
        //list的元素輸出，中間用空白分割(java 1.8才有)
        System.out.println( result.outputList.stream().collect(Collectors.joining(" ")) );
    }

    public static Result findMax(ArrayList<ArrayList<Integer>> lines, int targetTotalLine, ArrayList<Integer> usedLines) {

        //直接找 一條線段中，擁有該子線段個數者 的 最大總長度定為初始最大長度(否則遞迴會無法結束)
        //遞迴重點 要有終止情不遞迴情況
        Result result = findCertainMax(lines, targetTotalLine, usedLines);

        //找一半就可以了，因為排列組合另一半會重複
        double half = targetTotalLine/2.0;
        for (int leftSubLen = 1; leftSubLen <=half; leftSubLen++) {
            int rightSubLen = targetTotalLine - leftSubLen;

            //左邊 直接找最大
            Result leftResult = findMax(lines, leftSubLen, usedLines);

            //右邊 遞迴搜尋 找最大
            Result rightResult = findMax(lines, rightSubLen, leftResult.usedLineList);

            int tmpMax = leftResult.maxLen + rightResult.maxLen;

            //有比較大就更新
            if (tmpMax > result.maxLen) {
                result.maxLen = tmpMax;
                leftResult.outputList.addAll(rightResult.outputList);
                result.outputList = leftResult.outputList;
                //置換max使用過的線段
                result.usedLineList = rightResult.usedLineList;
            }
        }

        return result;
    }

    public static Result findCertainMax(ArrayList<ArrayList<Integer>> lines, int targetTotalLine, ArrayList<Integer> usedLines) {

        int max = 0;
        String outputStr = "";
        int parentIndexOfMax=-1;

        //直接找每個線段中，的第 (targetTotalLine-1) index 的數值，
        //就是該條線段 從左到右有targetTotalLine個數 的總長度
        //在比較哪個線段的 總長度 比較長，存起來回傳
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).size() < targetTotalLine)
                continue;
            if (usedLines.contains(i))
                continue;

            //index從0開始，所以要扣1 targetTotalLine-1
            int subLineLen = lines.get(i).get(targetTotalLine - 1);
            //如果發現有更大的總長度 則置換，並記錄輸出文字
            if (subLineLen > max) {
                max = subLineLen;
                //index從0開始，所以第幾條線段要加1， i+1
                outputStr = "(" + (i + 1) + "," + targetTotalLine + ")";
                //記下max所在的線段index，之後放到usedLines，避免再次被選取
                parentIndexOfMax = i;
            }
        }

        Result result = new Result(max, outputStr);
        //複製一個 暫存的tmpUsedLines 來用，不可以直接使用 引入參數usedLines，
        //因為傳入的是記憶體位址，會直接改道原本findMax()中的usedLines
        ArrayList<Integer> tmpUsedLines = new ArrayList<>(usedLines);
        if (parentIndexOfMax != -1)
            tmpUsedLines.add(parentIndexOfMax);
        result.usedLineList = tmpUsedLines;

        return result;
    }

    public static class Result {
        ArrayList<String> outputList = new ArrayList<>();
        int maxLen = 0;
        ArrayList<Integer> usedLineList = new ArrayList<>();

        public Result(int maxLen,  String outputStr) {
            this.maxLen = maxLen;
            this.outputList.add(outputStr);
        }
    }

}
