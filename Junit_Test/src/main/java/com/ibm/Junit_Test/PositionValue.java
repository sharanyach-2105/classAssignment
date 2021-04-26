package com.ibm.Junit_Test;

public class PositionValue {
	
	//AAABDFHS--------ABDFHS
	public String removeA_InFirst2Position(String str) {
		if(str.length() <=2 )
			return str.replaceAll("A","");
		String first2Chars = str.substring(0,2);
		String stringMinusFirst2Chars = str.substring(2);
		
		return first2Chars.replaceAll("A","")+ stringMinusFirst2Chars;
	}

}


