package com.woniu.aggregate;

import java.util.Set;
import java.util.TreeSet;

class Stu1 implements Comparable<Stu1> {
		private String sname;
		private Integer cresult;
		private Integer mresult;
		private Integer eresult;
		private Integer gpa;
		public Stu1(String sname, Integer cresult, Integer mresult, Integer eresult) {
			this.sname = sname;
			this.cresult = cresult;
			this.mresult = mresult;
			this.eresult = eresult;
			this.gpa = (cresult+mresult+eresult)/3;
		}
		
		@Override
		public String toString() {
			return "Stu1 [sname=" + sname + ", cresult=" + cresult + ", mresult=" + mresult + ", eresult=" + eresult
					+ ", gpa=" + gpa + "]";
		}

		

		@Override
		public int compareTo(Stu1 o) {
			// TODO Auto-generated method stub
			int r = - this.gpa.compareTo(o.gpa);//主要条件，成绩
			if(r==0) {
				return this.sname.compareTo(o.sname);//次要条件，名字
			}
			return r;
		}
	}
	public class app2 {
		public static void main(String[] args) {
			Set set = new TreeSet();
			Stu1 stu1 = new Stu1("b", 80, 60, 70);
			Stu1 stu2 = new Stu1("c", 55, 65, 75);
			Stu1 stu3 = new Stu1("d", 55, 66, 77);
			Stu1 stu4 = new Stu1("a", 50, 60, 70);
			set.add(stu1);
			set.add(stu2);
			set.add(stu3);
			set.add(stu4);
			System.out.println(set);
		}
	}

