package work04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Work {

	public static void main(String[] args) {

		work1();
		work2();
		work3();

	}

	public static void work1(){

		System.out.println("---work4-1---");
		Grade g1 = new Grade("�R�c", 70, 90, 90);
		Grade g2 = new Grade("����", 80, 70, 80);
		Grade g3 = new Grade("���", 95, 65, 60);
		Grade[] grades = {g1,g2,g3};

		Comparator<Grade> comparatorOfSum =  new Comparator<Grade>() {
			@Override
			public int compare(Grade o1, Grade o2) {
				return Integer.compare(o2.calSum(), o1.calSum());
			}
		};

		Comparator<Grade> comparatorOfEnglish =  new Comparator<Grade>() {
			@Override
			public int compare(Grade o1, Grade o2) {
				return Integer.compare(o2.getEnglish(), o1.getEnglish());
			}
		}; 

		Comparator<Grade> comparatorOfJapanese =  new Comparator<Grade>() {
			@Override
			public int compare(Grade o1, Grade o2) {
				return Integer.compare(o2.getJapanese(), o1.getJapanese());
			}
		}; 

		Comparator<Grade> comparatorOfMath =  new Comparator<Grade>() {
			@Override
			public int compare(Grade o1, Grade o2) {
				return Integer.compare(o2.getMath(), o1.getMath());
			}
		}; 

		Arrays.sort(grades, comparatorOfSum);
		System.out.println("���v�_");
		for (Grade grade : grades) {
			System.out.println(grade.getName()+": ���v "+grade.calSum()+": �p�� "+grade.getEnglish()+", ����@"+grade.getJapanese()+", ���w "+grade.getMath());
		}
		Arrays.sort(grades, comparatorOfEnglish);
		System.out.println("�p��");
		for (Grade grade : grades) {
			System.out.println(grade.getName()+": ���v "+grade.calSum()+": �p�� "+grade.getEnglish()+", ����@"+grade.getJapanese()+", ���w "+grade.getMath());
		}
		Arrays.sort(grades, comparatorOfJapanese);
		System.out.println("����");
		for (Grade grade : grades) {
			System.out.println(grade.getName()+": ���v "+grade.calSum()+": �p�� "+grade.getEnglish()+", ����@"+grade.getJapanese()+", ���w "+grade.getMath());
		}
		Arrays.sort(grades, comparatorOfMath);
		System.out.println("���w");
		for (Grade grade : grades) {
			System.out.println(grade.getName()+": ���v "+grade.calSum()+": �p�� "+grade.getEnglish()+", ����@"+grade.getJapanese()+", ���w "+grade.getMath());
		}
	}

	public static void work2(){

		System.out.println("---work4-2---");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 1000; i++) {
			if(i%9 == 0) {
				list.add(i);
			}
		}
		System.out.println("9�̔{��: "+list.size());
		for (Integer integer : list) {
			System.out.println(integer);
		}
		

	}
	
	public static void work3(){

		System.out.println("---work4-3---");
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		map.put(5,0);
		map.put(7, 0);
		map.put(9, 0);
		for (int i = 1; i <= 1000; i++) {
			if(i%5 == 0) {
				map.put(5, map.get(5)+1);
			}
			if(i%7 == 0) {
				map.put(7, map.get(7)+1);
			}
			if(i%9 == 0) {
				map.put(9, map.get(9)+1);
			}
		}
		for (Integer key : map.keySet()) {
			System.out.println(key+"�̔{���̌�: "+map.get(key)+"��");
		}
		

	}
}