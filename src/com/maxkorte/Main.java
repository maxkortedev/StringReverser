package com.maxkorte;

public class Main {

    public static void main(String[] args) {
    	String userString = "";
	    for(String string : args) {
	        userString = userString + " " + string;
        }

	    char[] userStringArray = userString.toCharArray();
	    String reversedString = "";
	    for(int i = (userStringArray.length - 1); i >= 0; i--){
	        reversedString = reversedString + userStringArray[i];
        }
        System.out.println(reversedString);
    }
}
