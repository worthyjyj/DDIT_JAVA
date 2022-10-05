package h.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListClass {

	/*
	 * boolean add(Object o)    : 마지막 위치에 객체를 추가 후 성공여부를 반환한다. 
	 * void add(int i, Object o) : 지정된 위치에 객체를 추가한다. 
	 * Object set(int i , Object o) : 지정된 위치에 객체를 저장한 후 기존 객체를 반환한다. 
	                                   arr[0]= 1 -> list.set(0, 1) 
	 * Object get(int i) : 지정된 위치의 객체를 반환한다. arr[0] -> list.get(0) 
	 * int size() : 저장된 객체의 수를 반환한다. arr.length -> list.size()
	 * boolean remove(int i) :지정된 위치의 객체를 제거한다. 
	 */
	
	public static void main(String[] args) {
		List list = new ArrayList<>();
//		List list = new LinkedList();
		
		list.add("abc");
		list.add(100);
		list.add(new Scanner(System.in)); 

	//제네릭을 지정하지 않으면 넣을 때는 편하나 꺼낼때는 타입을 예측하기 어렵다. 
		//따라서 제네릭의 사용이 권장된다. 
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		
		System.out.println(list2.add(20));
		System.out.println(list2.add(20));
		System.out.println(list2);
		
		list2.add(1,40);
		System.out.println(list2);
	
//		list2.add(10,40); //순서대로만 저장할 수 있다. 
		
		int before = list2.set(2, 50);
		System.out.println("before : " +before);
		System.out.println("after : " + list2.get(2));
		
		//값을 제거할 때는 반드시 뒤에서 부터 제거해야한다. 
		System.out.println(list2);
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(i+ ":" + list2.get(i));
			list2.remove(i);
		}
		System.out.println(list2);

		// 뒤에서 부터 지우기 
		for(int i = list2.size() -1 ; i >=0; i--) {
			System.out.println(i + ":" + list.get(i));
			list2.remove(i);
		}
	System.out.println(list2);
	
	//예제) list3에 1부터 100까지 랜덤값을 10개 저장해주세요. 
	
	List<Integer> list3 = new ArrayList<>();
	Random rd = new Random(); 
	
	for (int i = 0; i < 10 ; i++) {
		list3.add(rd.nextInt(100)+1);
	}
	System.out.println(list3);
	
	//예제 2) list3에 저장된 값의 합계와 평균을 구해주세요 
	int sum=0;
	double avg; 
	
	for (int i = 0; i < list3.size(); i++) {
		sum += list3.get(i);
	}
	
//	for(int item : list3) {
//		sum += item; 
//	}
// 향상된 for문 사용 
	
	System.out.println("합계 : " + sum);
	System.out.println("평균 : " + (double)sum/list3.size());
	
	
	// 예제3) list3에서 최솟값과 최댓값을 구해주세요. 
	int max = list3.get(0);
	int min = list3.get(0);
	
	for (int i = 0; i < list3.size(); i++) {
		if(list3.get(i) > max) {
			max = list3.get(i);
		}
		if(list3.get(i) < min) {
			min = list3.get(i);
		}
	}
	System.out.println("최댓값 :" + max);
	System.out.println("최솟값 :" + min);
	
	//다시 풀기!! 
	//예제4) list3을 오름차순으로 정렬해주세요 (sort() 미사용)
//	
//	for (int i = 0; i < list3.size(); i++) {
//		for (int j = 0; j < list3.size(); j++) {
//			if(list3.get(j)>list3.get(i)) {
//				int temp = list3.get(i);
//				list3(j,list3.get(j));
//				list3.remove(list3.get(i),temp);
//			}
//		}
//	}
	System.out.println(" 오름차순 정렬!!!!! >> " + list3);
	
	list3.sort(new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1 > o2) {
				return 1;
			}else if(o1==o2) {
				return 0;	
			}else
				return -1;
		}
	});
	System.out.println(list3);
	
	
	
	}
}
































