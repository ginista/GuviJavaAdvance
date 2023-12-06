package com.org.day19.filehandling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class countOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * a[] = {1,1,2,2,2,3,3}
		 * a - 2
		 * 2 - 3
		 * 3 - 2
		 * Print the frequencies in an array
		 */
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		for(int i=0;i<size;i++) {
			list.add(scan.nextInt());
		}
		for(int arr:list) {
			int count =1;
			if(map.containsKey(arr)) {
				 count = map.get(arr);
				 count++;
			}
			map.put(arr, count);
			
		}
		System.out.println(map);

	}

}
