package com.woniu.aggregate;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
//测试
class Stu {
	private String sname;
	private Integer cresult;
	private Integer mresult;
	private Integer eresult;
	private Double gpa;
	public Stu(String sname, Integer cresult, Integer mresult, Integer eresult) {
		this.sname = sname;
		this.cresult = cresult;
		this.mresult = mresult;
		this.eresult = eresult;
		this.gpa = (double) ((cresult+mresult+eresult)/3);
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Stu [sname=" + sname + ", cresult=" + cresult + ", mresult=" + mresult + ", eresult=" + eresult
				+ ", gpa=" + gpa + "]";
	}
}
@SuppressWarnings("all")
public class app1 {
	public static void main(String[] args) {
		Stu stu1 = new Stu("b", 80, 60, 70);
		Stu stu2 = new Stu("c", 55, 65, 75);
		Stu stu3 = new Stu("d", 55, 66, 77);
		Stu stu4 = new Stu("a", 50, 60, 70);
		Stu stu5 = new Stu("e", 50, 60, 70);
		Set set = new TreeSet(new Comparator<Stu>() {
			public int compare(Stu s1,Stu s2) {
				int r =  - s1.getGpa().compareTo(s2.getGpa());
				if(r==0) {
					return s1.getSname().compareTo(s2.getSname());
				}
				return r;
			}
		});
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		System.out.println(set);
	}
}
