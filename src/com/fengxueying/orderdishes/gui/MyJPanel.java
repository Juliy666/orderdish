package com.fengxueying.orderdishes.gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 * ui绘制类
 * @author 82050
 *
 */
public class MyJPanel extends JPanel {

	BufferedImage image;
	
	
	
	public MyJPanel() {
		super();
		try {
			image = ImageIO.read(getClass().getResource("img.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (image!=null) {
			g.drawImage(image, 0, 0, null);
		}
		  
//		super.paintComponent(g);
	}

	@Override
	protected void paintChildren(Graphics g) {
		// TODO Auto-generated method stub
		super.paintChildren(g);
	}

	@Override
	protected void paintBorder(Graphics g) {
		// TODO Auto-generated method stub
		super.paintBorder(g);
	}

}
