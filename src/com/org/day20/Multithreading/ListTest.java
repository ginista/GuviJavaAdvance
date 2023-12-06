package com.org.day20.Multithreading;
import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			list.add("four");//print and adding so concurrentModification Exception
		}

	}

}
