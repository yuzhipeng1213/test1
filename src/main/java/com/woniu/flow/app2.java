package com.woniu.flow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class app2 {
	//һ���ļ��ľ��ӷָ������ķ������зָ��ٷ�װ���ٴ���һ���ļ�
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
		//str.trim()ȥ�����ҿո�
		for(String str:strs) {
			
			System.out.println(str.trim());
		}
	}
}
