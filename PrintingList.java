package com.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class PrintingList {
	
	public static void print(int[] arr, List<Integer> list) {
		int i = 0;
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]); //list.add(arr[i]);
		 * } System.out.println();
		 */
	/*
	 * for(int j=0;j<list.size();j++) { System.out.println(list.get(j)); }
	 *//*
		 * for(Integer l : list) { System.out.println(l); }
		 */
	 
	    list.stream().forEach(System.out::println);
		Arrays.stream(arr).forEach(System.out::println);
		i = Arrays.stream(arr).sum();
		System.out.println(i);
	
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 3,4, 5, 6, 7,8};
		//List<Integer> list = new ArrayList<Integer>();
		//List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		List<Integer> list1 = List.of(2,3,4,9, 10, 11, 12, 13, 14, 15);
		//List<Integer> list1 = 
		print(arr, list1);
	}

}
