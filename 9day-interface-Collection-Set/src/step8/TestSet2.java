package step8;

import java.util.TreeSet;

public class TestSet2 {
	public static void main(String[] args) {
		//TreeSet: 중복인정X, 정렬기능이 내장되어있다.
		TreeSet<String> set1 = new TreeSet<String>();// 문자열요소
		set1.add("a");
		set1.add("b");
		set1.add("a"); //중복불허
		System.out.println(set1.size());
		System.out.println(set1); //정렬기능
	}
}
