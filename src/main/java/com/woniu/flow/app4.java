package com.woniu.flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class app4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i= 0;i<100;i++) {
			int n = new Random().nextInt(1000)+1;
			list.add(n);
		}
	}
	
}
