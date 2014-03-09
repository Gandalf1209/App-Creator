package com.gandalf1209.appcreate;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Display extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private static JFrame frame = new JFrame();
	private static JPanel panel = new JPanel();
	private static JLabel widthL = new JLabel("Window Width:");
	private static JTextField widthT = new JTextField("200");
	private static JLabel heightL = new JLabel("Window Height:");
	private static JTextField heightT = new JTextField("200");
	private static JLabel appTitle = new JLabel("App Name:");
	private static JTextField appHeader = new JTextField("Name Your App");
	private static JButton buildWindow = new JButton("Build App Window");
	
	public static void buildStartWindow() {
		
		System.out.println("Setting StartWindow Contents...");
		
		panel.setLayout(new GridLayout(10, 1));
		panel.add(widthL);
		panel.add(widthT);
		panel.add(heightL);
		panel.add(heightT);
		panel.add(appTitle);
		panel.add(appHeader);
		panel.add(buildWindow);
		
		frame.setTitle("App Creator - Start Window");
		frame.setSize(300, 450);
		frame.setContentPane(panel);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		System.out.println("Setting Listeners...");
		
		buildWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Gathering data...");
				int w = 0;
				int h = 0;
				try {
					w = Integer.parseInt(widthT.getText());
					h = Integer.parseInt(heightT.getText());
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(frame, "One of the specified dimensions can not be completed");
					return;
				}
				if (w < 100 && h < 100) {
					JOptionPane.showMessageDialog(frame, "One of the specified dimensions is too small");
					return;
				}
				String name = appHeader.getText();
				MainApp.createWindow(w, h, name);
				frame.setVisible(false);
			}
		});
		
		startWindow();
	}
	
	
	
	private static void startWindow() {
		System.out.println("Finishing...");
		frame.setVisible(true);
		System.out.println("Finished loading!\n");
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
