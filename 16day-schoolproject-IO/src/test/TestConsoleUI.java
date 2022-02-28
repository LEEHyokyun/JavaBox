package test;

import java.io.IOException;

import view.ConsoleUI;

public class TestConsoleUI {
	public static void main(String[] args) {
		ConsoleUI ui = new ConsoleUI();
		try {
			ui.execute();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
