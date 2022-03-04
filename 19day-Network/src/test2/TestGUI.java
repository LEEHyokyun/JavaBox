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
		 * frame ���� �̺�Ʈ = �͸� Ŭ����
		 * Ŭ�������� �������� �ʴ� �ܱ� �������� Ŭ����
		 */
		//interface�� ����ü�� ����, ���ڿ� �͸� Ŭ���� ��ü�� �ٷ� ����
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
