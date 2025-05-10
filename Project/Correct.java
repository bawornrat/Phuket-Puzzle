package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Correct implements ActionListener {
	private JFrame frame = new JFrame();
	private JFrame frmThePuzzlePhuet;
	private JTextField textField;
	private String name;
	private String Q;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public Correct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmThePuzzlePhuet = new JFrame();
		frmThePuzzlePhuet.setTitle("THE PUZZLE PHUET GAME ของดี๊ดีภูเก็ต");
		frmThePuzzlePhuet.setBounds(100, 100, 500, 500);
		frmThePuzzlePhuet.setLocationRelativeTo(null);
		frmThePuzzlePhuet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThePuzzlePhuet.getContentPane().setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		frmThePuzzlePhuet.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ยินดีด้วย คุณตอบถูก");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.white);
		lblNewLabel.setBounds(139, 28, 267, 51);
		lblNewLabel.setFont(new Font("Angsana New", Font.BOLD, 45));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Correct.class.getResource("/img/OO.png")));
		lblNewLabel_9.setBounds(28, 11, 101, 93);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 0, 486, 232);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(Correct.class.getResource("/img/PAge1.22.jpg")));
		
		
		
		
		JPanel panel_2 = new JPanel();
		frmThePuzzlePhuet.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ใส่ชื่อของคุณ");
		lblNewLabel_1.setForeground(Color.white);
		lblNewLabel_1.setBounds(157, 11, 161, 54);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 38));
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Correct.class.getResource("/img/Money11.png")));
		lblNewLabel_7.setBounds(300, 11, 114, 54);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(Correct.class.getResource("/img/Money22.png")));
		lblNewLabel_10.setBounds(62, 41, 103, 63);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, -116, 486, 231);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(Correct.class.getResource("/img/backg.png")));
		
		
		
		JPanel panel_3 = new JPanel();
		frmThePuzzlePhuet.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(133, 11, 216, 54);
		textField.setFont(new Font("Angsana New", Font.PLAIN, 35));
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Correct.class.getResource("/img/Money33.png")));
		lblNewLabel_8.setBounds(0, 35, 101, 69);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Correct.class.getResource("/img/backg.png")));
		lblNewLabel_4.setBounds(0, -229, 486, 344);
		panel_3.add(lblNewLabel_4);
		
		
		JPanel panel = new JPanel();
		frmThePuzzlePhuet.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("ไปต่อ");
		btnNewButton.setBounds(173, 11, 132, 53);
		btnNewButton.setFont(new Font("Angsana New", Font.BOLD, 30));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Correct.class.getResource("/img/player002.png")));
		lblNewLabel_6.setBounds(281, 0, 184, 115);
		panel.add(lblNewLabel_6);
		btnNewButton.addActionListener(this);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Correct.class.getResource("/img/backg.png")));
		lblNewLabel_5.setBounds(0, -590, 486, 761);
		panel.add(lblNewLabel_5);
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String btnName = ((JButton)e.getSource()).getText();
		
		if (btnName == "ไปต่อ")
		{
			this.name = textField.getText();
			createFile();
			getBufferedWriter();
			frmThePuzzlePhuet.setVisible(false);
			switch(Q){
        	case"1":Display dis = new Display("1");
    			break;
        	case"2":Display dis2 = new Display("2");
				break;
        	case"3":Display dis3 = new Display("3");
				break;
        	case"4":Display dis4 = new Display("4");
				break;
        	}
	    }
			
		

		}
	
	
	public void Qcorrect(String Q) {
		this.Q = Q;
		frmThePuzzlePhuet.setVisible(true);
		
	}
	
public String getName() {
	return name;
		
	}
private BufferedWriter getBufferedWriter()
{
	try
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter("record.txt",true));
		
		writer.append(name+"\n");
		writer.close();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}

	return null;
}

private boolean fileExists(String file)
{
	return new File(file).exists();
}

private void createFile()
{
	if(!fileExists("record.txt")) {
	try
	{
		new BufferedWriter(new FileWriter(new File("record.txt")));
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}	
}
}
