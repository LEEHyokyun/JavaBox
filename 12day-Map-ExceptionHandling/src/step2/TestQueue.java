package step2;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("a");
		queue.add("b");
		//��һ���
		queue.poll();
		//�������
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
