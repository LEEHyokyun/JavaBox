package test;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 *  기본적으로 엔터를 누르게 되면 입력실행
		 */
		//*****************************************************
		int n = sc.nextInt(); //엔터를 기준으로 입력된 두개의 값이 n,m에 각각 저장된다.
		int m = sc.nextInt();
		
		System.out.println(n+","+m);
		
		//*****************************************************
		String str = null;
		
		for(int i=0;i<n;i++) {
			str = sc.nextLine(); //엔터를 기준으로 문자열 str에 문자열 값이 저장된다.
		}
		
		System.out.println(str);
		//*****************************************************
		int value = sc.nextInt();
		int[] arr = new int[value];
		for(int i=0;i<value;i++) {
			arr[i] = sc.nextInt(); 
		}
		
		System.out.println(arr[0]+","+arr[1]+","+arr[2]);
	}
}
