package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex120 {
	public static void main(String[] args) {
		//맵(Map) : 키와 값으로 된 데이타 구조
		//        : JS Key-Value객체, JSON,XML-KeyValue

		Map<String,String> data = new HashMap<String, String>();
		data.put("id", "hong");
		data.put("pw", "1234");
		
		System.out.println(data);
		
		System.out.println(data.size());
		
		System.out.println(data.get("id"));
		System.out.println(data.get("pw"));
		//키 집합 데이터를 얻어와서, 이터레이터로 순환시킨다.
		Set<String> keys = data.keySet(); //중복허용않는 집합 데이터
		System.out.println(keys);
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = data.get(key);
			
			System.out.println("key:" + key + ", Value:"+value);
		}
		//향상된 for문 이용
		for(String key:keys) {
			System.out.println(key);
			String value = data.get(key);
			System.out.println("key:" + key + ", Value:"+value);
		}
	}
	
}