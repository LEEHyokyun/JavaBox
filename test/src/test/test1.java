package test;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 *  �⺻������ ���͸� ������ �Ǹ� �Է½���
		 */
		//*****************************************************
		int n = sc.nextInt(); //���͸� �������� �Էµ� �ΰ��� ���� n,m�� ���� ����ȴ�.
		int m = sc.nextInt();
		
		System.out.println(n+","+m);
		
		//*****************************************************
		String str = null;
		
		for(int i=0;i<n;i++) {
			str = sc.nextLine(); //���͸� �������� ���ڿ� str�� ���ڿ� ���� ����ȴ�.
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
