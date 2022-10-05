package h.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapClass {

	/*
	 * List : index => value
	 * Map : key => value
	 * 
	 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
	 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
	 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
	 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
	 * */
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>(); 
		map.put("이름","홍길동");
		map.put("국어",100);
		map.put("영어",20);
		map.put("수학",100);
		map.put("생일",new Date());
		System.out.println(map);
		// [] : 배열이나 List => 순서 있음
		// {} : Map => 순서 없음 
		
		map.put("영어", 90);
		System.out.println(map);
		
		map.remove("생일");
		System.out.println(map);
		
		Object o = map.get("국어");
		System.out.println(o);
		System.out.println(map.size());
		
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		//Set
		//1. 중복없음 2. 순서없음 
		//List => 중복가능 순서 있음 
		// Map => 중복가능 순서없음 
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		Map<String, Object> user1 = new HashMap<>();
		user1.put("id", "admin");
		user1.put("pw", "1234");
		user1.put("name", "홍길동");
		user1.put("phone", "010-0000-0000");
		
		for (String key : user1.keySet()) {
			System.out.println(key + ":" + user1.get(key));
		}
		
		Map<String, Object> user2 = new HashMap<>();
		user2.put("id", "tester");
		user2.put("pw", "1234");
		user2.put("name", "이순신");
		user2.put("phone", "010-1111-1111");
		
		
//		Map<String, Object>[] userArray = new HashMap<>[3];
	    List<Map<String, Object>> userList = new ArrayList<>();
	    userList.add(user1);
	    userList.add(user2);
	    System.out.println(userList);
	    
	    Map<String, Object> classMap = new HashMap<>();
	    classMap.put("405", userList);
	    System.out.println(classMap);
	}
}
