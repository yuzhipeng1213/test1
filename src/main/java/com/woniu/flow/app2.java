package com.woniu.flow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class app2 {
	//一个文件的句子分割，把里面的方法进行分割再封装，再传另一个文件
	public static void main(String[] args) throws Exception {
		Reader in = new FileReader("E://1.txt");
		BufferedReader br = new BufferedReader(in);
		
		String line = null;
		StringBuilder sb = new StringBuilder();
		
		while((line = br.readLine())!=null) {
			sb.append(line);
			sb.append("\n");
		}
		
		br.close();
		
		String[] strs = sb.toString().split("[!?\\.]+");
		//str.trim()去除左右空格
		for(String str:strs) {
			
			System.out.println(str.trim());
		}
	}
}
