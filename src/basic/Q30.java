package itsa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat ("MM dd");
			Date Capricorn = sdf.parse("01 20");
			Date Aquarius 	= sdf.parse("02 18");
			Date Pisces  	= sdf.parse("03 20");
			Date Aries  	= sdf.parse("04 20");
			Date Taurus  	= sdf.parse("05 21");
			Date Gemini  	= sdf.parse("06 21");
			Date Cancer 	= sdf.parse("07 22");
			Date Leo  		= sdf.parse("08 23");
			Date Virgo  	= sdf.parse("09 23");
			Date Libra 		= sdf.parse("10 23");
			Date Scorpio  	= sdf.parse("11 22");
			Date Sagittarius= sdf.parse("12 21");
	
			Date input =  sdf.parse(sc.nextLine());
			
			String starSign = "Capricorn";
			if(Capricorn.compareTo(input) >=0 )
				starSign = "Capricorn";
			else if(Aquarius.compareTo(input) >=0 )
				starSign = "Aquarius";
			else if(Pisces.compareTo(input) >=0 )
				starSign = "Pisces";
			else if(Aries.compareTo(input) >=0 )
				starSign = "Aries";
			else if(Taurus.compareTo(input) >=0 )
				starSign = "Taurus";
			else if(Gemini.compareTo(input) >=0 )
				starSign = "Gemini";
			else if(Cancer.compareTo(input) >=0 )
				starSign = "Cancer";
			else if(Leo.compareTo(input) >=0 )
				starSign = "Leo";
			else if(Virgo.compareTo(input) >=0 )
				starSign = "Virgo";
			else if(Libra.compareTo(input) >=0 )
				starSign = "Libra";
			else if(Scorpio.compareTo(input) >=0 )
				starSign = "Scorpio";
			else if(Sagittarius.compareTo(input) >=0 )
				starSign = "Sagittarius";
			
			System.out.println(starSign);
				
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
