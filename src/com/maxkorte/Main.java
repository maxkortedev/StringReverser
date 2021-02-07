package com.maxkorte;

public class Main {

    public static void main(String[] args) {
    	System.out.println(reverseString(arrayToString(args)));
    }

    public static String reverseString(String s){
		char[] userStringArray = s.toCharArray();
		String reversedString = "";
		for(int i = (userStringArray.length - 1); i >= 0; i--){
			reversedString = reversedString + userStringArray[i];
		}
		return reversedString;
	}

	public static String arrayToString(String[] arr){
		String userString = "";
		for(String string : arr) {
			userString = userString + " " + string;
		}
		return userString;
	}
}
