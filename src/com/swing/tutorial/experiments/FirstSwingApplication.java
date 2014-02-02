package com.swing.tutorial.experiments;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FirstSwingApplication extends JFrame {

	public FirstSwingApplication() {
		setSize(300, 200);
		setTitle("First Application");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// setting window in the center of the screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2
				- getHeight() / 2);

	}

	public static void main(String[] args) {
		FirstSwingApplication simple = new FirstSwingApplication();
		simple.setVisible(true);
	}
}
