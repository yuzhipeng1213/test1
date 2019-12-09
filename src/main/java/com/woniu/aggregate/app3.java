package com.woniu.aggregate;


import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//@SuppressWarnings("all")
//public class app3 {
//	public static void main(String[] args) {
//		Set set = new TreeSet(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return new Integer(o1.length()).compareTo(o2.length());
//			}
//		});
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			String str = sc.next();
//			set.add(str);
//		}
//		System.out.println(set);
//	}
//}
@SuppressWarnings("all")
public class app3 {
	public static void main(String[] args) {
		Set set = new TreeSet(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
//				return new Integer(o1.length()).compareTo(o2.length());
				return 1;
			}
		});
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=1;i<=str.length();i++) {
			set.add(str.substring((i-1),i));
		}
		System.out.println(set);
	}
}
