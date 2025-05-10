package Project;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Menu implements ActionListener{
	JFrame frmThePuzzlePhuet = new JFrame();
	JButton q1 = new JButton("");
	JButton q2 = new JButton("");
	JButton q3 = new JButton("");
	JButton q4 = new JButton("");
	private PuzzleEx puzzle = null ;
	private final JLabel lblNewLabel = new JLabel("");

Menu(){
	q1.setBounds(48, 250, 130, 123);//x,y,width,height
	q1.addActionListener(this);
	
	q1.setRolloverEnabled(true);//setRolloverButton
	q1.setIcon(new ImageIcon(Start.class.getResource("/img/PageW.png")));
	q1.setRolloverIcon(new ImageIcon(Menu.class.getResource("/img/PageW0.png")));
	
	q1.setBorderPainted(false);//make button visible
	q1.setContentAreaFilled(false);//make button 0% opacity
	q1.setFocusPainted(false); 
	q1.setOpaque(false);
	
	q2.setBounds(130, 250, 130, 123);//x,y,width,height
	q2.addActionListener(this);
	
	q2.setRolloverEnabled(true);//setRolloverButton
	q2.setIcon(new ImageIcon(Start.class.getResource("/img/pagew1.png")));
	q2.setRolloverIcon(new ImageIcon(Menu.class.getResource("/img/pagew2.png")));
	
	q2.setBorderPainted(false);//make button visible
	q2.setContentAreaFilled(false);//make button 0% opacity
	q2.setFocusPainted(false); 
	q2.setOpaque(false);
	
	q3.setBounds(210, 250, 140, 123);//x,y,width,height
	q3.addActionListener(this);
	
	q3.setRolloverEnabled(true);//setRolloverButton
	q3.setIcon(new ImageIcon(Start.class.getResource("/img/pagew3.png")));
	q3.setRolloverIcon(new ImageIcon(Menu.class.getResource("/img/pagew4.png")));
	
	q3.setBorderPainted(false);//make button visible
	q3.setContentAreaFilled(false);//make button 0% opacity
	q3.setFocusPainted(false); 
	q3.setOpaque(false);

	q4.setBounds(295, 255, 140, 118);//x,y,width,height
	q4.addActionListener(this);
	
	q4.setRolloverEnabled(true);//setRolloverButton
	q4.setIcon(new ImageIcon(Start.class.getResource("/img/pagew5.png")));
	q4.setRolloverIcon(new ImageIcon(Menu.class.getResource("/img/pagew6.png")));
	
	q4.setBorderPainted(false);//make button visible
	q4.setContentAreaFilled(false);//make button 0% opacity
	q4.setFocusPainted(false); 
	q4.setOpaque(false);
	
	JLabel lblNewLabel_2 = new JLabel("");
	lblNewLabel_2.setIcon(new ImageIcon(Menu.class.getResource("/img/guard.png")));
	lblNewLabel_2.setBounds(200, 22, 188, 132);
	frmThePuzzlePhuet.getContentPane().add(lblNewLabel_2);
	frmThePuzzlePhuet.setVisible(true);
	
	JLabel lblNewLabel_1 = new JLabel("");
	lblNewLabel_1.setIcon(new ImageIcon(Menu.class.getResource("/img/002.png")));
	lblNewLabel_1.setBounds(39, 22, 188, 132);
	frmThePuzzlePhuet.getContentPane().add(lblNewLabel_1);
	frmThePuzzlePhuet.setVisible(true);
	
	//frame-menu
	frmThePuzzlePhuet.getContentPane().add(q1);//add q1 button
	frmThePuzzlePhuet.getContentPane().add(q2);//add q1 Button
	frmThePuzzlePhuet.getContentPane().add(q3);//add q1 Button
	frmThePuzzlePhuet.getContentPane().add(q4);//add q1 button
	frmThePuzzlePhuet.getContentPane().setBackground(Color.WHITE);
	frmThePuzzlePhuet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmThePuzzlePhuet.setTitle("THE PUZZLE PHUET GAME \u0E02\u0E2D\u0E07\u0E14\u0E35\u0E4A\u0E14\u0E35\u0E20\u0E39\u0E40\u0E01\u0E47\u0E15");
	frmThePuzzlePhuet.setResizable(false);
	frmThePuzzlePhuet.setSize(500,500);
	frmThePuzzlePhuet.getContentPane().setLayout(null);
	lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/img/ARE YOU READYy.png")));
	lblNewLabel.setBounds(-84, -13, 651, 501);
	
	frmThePuzzlePhuet.getContentPane().add(lblNewLabel);
	frmThePuzzlePhuet.setLocationRelativeTo(null);
	
	
}


	

	@Override
	public void actionPerformed(ActionEvent e) {
		frmThePuzzlePhuet.dispose();
		if(e.getSource()==q1) {
			PuzzleEx.Q1();
		}
		if(e.getSource()==q2) {
			PuzzleEx.Q2();
		}
		if(e.getSource()==q3) {
			PuzzleEx.Q3();
		}
		if(e.getSource()==q4) {
			PuzzleEx.Q4();
	}
		}
}
