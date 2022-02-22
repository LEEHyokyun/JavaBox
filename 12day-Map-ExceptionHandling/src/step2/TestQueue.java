package step2;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("a");
		queue.add("b");
		//요소삽입
		queue.poll();
		//요소제거
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
