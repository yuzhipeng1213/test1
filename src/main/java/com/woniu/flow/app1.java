package com.woniu.flow;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class app1 {
	public static void main(String[] args) throws Exception {
		Reader in = new FileReader("E:\\1.txt");
		Reader in2 = new FileReader("E:\\2.txt");
		Writer out = new FileWriter("E:\\3.txt");
		
		int n1;
		int n2;
		
		while((n1=in.read())!=-1&&(n2=in2.read())!=-1) {
			out.write(n1);
			out.write(n2);
		}
		if(n1!=-1) {
			out.write(n1);
		}
		while((n1=in.read())!=-1) {
			out.write(n1);
		}
		while((n2=in2.read())!=-1) {
			out.write(n2);
		}
		in.close();
		in2.close();
		out.close();
	}
}
