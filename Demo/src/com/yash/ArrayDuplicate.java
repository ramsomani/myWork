package com.yash;
import java.util.*;
public class ArrayDuplicate {
 public static void main(String args[])
	{
		String[] words =  "Java Is Programing language".split(" ");

		String rev = "";
			for(int i = words.length - 1; i >= 0 ; i--)
			{
				rev= rev + words[i] + " ";
			}

		System.out.println(rev);

	}
	}


