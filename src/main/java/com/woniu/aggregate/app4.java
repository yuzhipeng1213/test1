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
		 map.put("aaa", "����");
		 map.put("bbb", "������");
		 map.put("ccc", "�׿���˹");
		 map.put("ddd", "����");
		 map.put("eee", "����");
		 Set set = map.entrySet();
		 Iterator it = set.iterator();
		 while(it.hasNext()) {
			 Entry e = (Entry) it.next();
			 System.out.println(e.getKey()+" �� "+e.getValue());
		 }
	}
}
