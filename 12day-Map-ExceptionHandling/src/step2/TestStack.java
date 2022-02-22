package step2;

import java.util.Stack;

//Stack, last in first out
public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack.pop());
		
		//stack 반복순회 : while
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
