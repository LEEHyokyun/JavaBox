package test2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class TestGUI {
	private JFrame frame;
	
	public void showUI() {
		frame = new JFrame("gui test");
		frame.setSize(300, 100);
		frame.setLocation(300, 200); 	
		/*
		 * frame 종료 이벤트 = 익명 클래스
		 * 클래스명이 존재하지 않는 단기 사용목적의 클래스
		 */
		//interface의 구현체를 위해, 인자에 익명 클래스 자체로 바로 전달
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//System.out.println("Hello World");
				System.exit(0);
			}
		});
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new TestGUI().showUI();
	}
}
