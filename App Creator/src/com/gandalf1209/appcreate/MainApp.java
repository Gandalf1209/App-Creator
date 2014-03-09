package com.gandalf1209.appcreate;

import javax.swing.JFrame;

public class MainApp extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private static JFrame frame = new JFrame();
	
	public static void createWindow(int w, int h, String name) {
		System.out.println("Setting MainApp Contents...");
		frame.setSize(w, h);
		frame.setTitle(name);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		System.out.println("Finished!\n");
	}

}
