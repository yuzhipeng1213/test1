package com.woniu.aggregate;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
@SuppressWarnings("all")
public class app4 {
	public static void main(String[] args) {
		 Map map = new HashMap();
		 map.put("aaa", "奔驰");
		 map.put("bbb", "法拉利");
		 map.put("ccc", "雷克萨斯");
		 map.put("ddd", "丰田");
		 map.put("eee", "宝马");
		 Set set = map.entrySet();
		 Iterator it = set.iterator();
		 while(it.hasNext()) {
			 Entry e = (Entry) it.next();
			 System.out.println(e.getKey()+" ： "+e.getValue());
		 }
	}
}
