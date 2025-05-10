package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.ImageIcon;

public class RecordDisplay implements ActionListener{
	private String scoreFile;
	private JFrame frmPhuketGame;
	private String name;
	private String[] arrOfStr ;
	private ArrayList<String> allname = new ArrayList<String>(/*Arrays.asList(arrOfStr)*/);
			
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public RecordDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmPhuketGame = new JFrame();
		frmPhuketGame.setFont(new Font("Angsana New", Font.BOLD, 12));
		frmPhuketGame.getContentPane().setBackground(Color.WHITE);
		frmPhuketGame.setTitle("THE PUZZLE PHUET GAME ของดี๊ดีภูเก็ต");
		frmPhuketGame.setBounds(100, 100, 500, 500);
		frmPhuketGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhuketGame.getContentPane().setLayout(null);
		frmPhuketGame.setLocationRelativeTo(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.5f));
		panel_1.setBounds(85, 349, 310, 76);
		frmPhuketGame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("เมนู");
		btnNewButton.setBounds(10, 11, 132, 53);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Angsana New", Font.PLAIN, 30));
		btnNewButton.addActionListener(this);
		
		JButton btnNewButton_1 = new JButton("จบ");
		btnNewButton_1.setBounds(167, 11, 132, 53);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Angsana New", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(this);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 66, 461, 256);
		frmPhuketGame.getContentPane().add(panel_2);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(1, 1, 5, 27);
		txtArea.setFont(new Font("Angsana New", Font.BOLD, 35));
		txtArea.setEditable(false);
		
		getBufferedReader();
		
		String readtxtfile = "1. "+allname.get(0);
		for (int i = 1; i<allname.size();i++) {
			readtxtfile = readtxtfile + "\n"+(i+1)+". "+(allname.get(i));
		}
		panel_2.setLayout(null);
		txtArea.setText(readtxtfile);
		//panel_2.add(txtArea);
		JScrollPane sp =new JScrollPane(txtArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(5, 5, 451, 246);
		panel_2.add(sp);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(RecordDisplay.class.getResource("/img/PAge1.22.jpg")));
		lblNewLabel_1.setBounds(-238, -43, 933, 520);
		frmPhuketGame.getContentPane().add(lblNewLabel_1);
		frmPhuketGame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String btnName = ((JButton)e.getSource()).getText();
		if (btnName == "เมนู")
		{
			frmPhuketGame.dispose();
			Menu menu = new Menu();
		}
		if (btnName == "จบ")
		{
			frmPhuketGame.dispose();
		}
	}
	
	private BufferedReader getBufferedReader()
	{
		try
		{
			BufferedReader reader =  new BufferedReader(new FileReader(new File("record.txt")));
			String line ;
			int i =0;
			while((line = reader.readLine()) != null) {
				allname.add(line);
				i++;
			}
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		return null;
	}
	
	
	
	}

	
	
	


