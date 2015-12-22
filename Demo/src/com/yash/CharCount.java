package com.yash;

public class CharCount {
	
		static int vowel=0;
		static int consonant=0;
		public static void main(String []args){
		String input="ABCDEFGH";
		 
		for(int i=0;i<input.length();i++){
		if(input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U' )
		vowel++;
		else
		consonant++;
		}
		System.out.println("Vowels : " +vowel);
		System.out.println("CONSONENT : " +consonant);
		}
		}

