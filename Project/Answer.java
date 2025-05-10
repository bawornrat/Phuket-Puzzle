package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Answer implements ActionListener {

	private JFrame frmPhuketGame;
	private String ans;
	private String Q;
	private Correct Qcorrect = new Correct();
	private Invalid incorrect = new Invalid();
	private JTextField textField;
	
	/**
	 * Create the application.
	 */
	public Answer(String Q) {
		initialize(Q);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String Q) {
		this.Q =Q;
		frmPhuketGame = new JFrame();
		frmPhuketGame.setTitle("THE PUZZLE PHUET GAME ของดี๊ดีภูเก็ต");
		frmPhuketGame.setBounds(100, 100, 500, 500);
		frmPhuketGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhuketGame.getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		frmPhuketGame.setLocationRelativeTo(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		frmPhuketGame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel questionLabel = new JLabel("จากภาพปริศนา");
		questionLabel.setBackground(Color.WHITE);
		questionLabel.setForeground(Color.white);
		questionLabel.setBounds(118, 0, 237, 77);
		questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionLabel.setFont(new Font("Angsana New", Font.BOLD, 45));
		panel_3.add(questionLabel);
		
		JLabel questionLabel1 = new JLabel("สิ่งนี้คือสิ่งใด?");
		questionLabel1.setBackground(Color.WHITE);
		questionLabel1.setForeground(Color.white);
		questionLabel1.setBounds(118, 77, 237, 77);
		questionLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		questionLabel1.setFont(new Font("Angsana New", Font.BOLD, 40));
		panel_3.add(questionLabel1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Answer.class.getResource("/img/backg.png")));
		lblNewLabel.setBounds(0, 0, 486, 154);
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		frmPhuketGame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 59, 216, 54);
		textField.setFont(new Font("Angsana New", Font.PLAIN, 35));
		textField.setColumns(10);
		panel_4.add(textField);
		
		JLabel lblNewlazer = new JLabel("");
		lblNewlazer.setIcon(new ImageIcon(Answer.class.getResource("/img/lazerr.png")));
		lblNewlazer.setBounds(48, 92, 450, 154);
		panel_4.add(lblNewlazer);
		
		JLabel lblNewmn3 = new JLabel("");
		lblNewmn3.setIcon(new ImageIcon(Answer.class.getResource("/img/Robot_Doll_.png")));
		lblNewmn3.setBounds(-57, 2, 201, 150);
		panel_4.add(lblNewmn3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Answer.class.getResource("/img/backg.png")));
		lblNewLabel_1.setBounds(0, 0, 486, 464);
		panel_4.add(lblNewLabel_1);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmPhuketGame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("ไปต่อ");
		btnNewButton.setBounds(168, 67, 132, 53);
		btnNewButton.setFont(new Font("Angsana New", Font.BOLD, 30));
		panel.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JLabel lblNewLazer1 = new JLabel("");
		lblNewLazer1.setIcon(new ImageIcon(Answer.class.getResource("/img/lazerr.png")));
		lblNewLazer1.setBounds(49, -118, 454, 261);
		panel.add(lblNewLazer1);
		btnNewButton.addActionListener(this);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Answer.class.getResource("/img/backg.png")));
		lblNewLabel_2.setBounds(-90, -537, 831, 691);
		panel.add(lblNewLabel_2);
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String btnName = ((JButton)e.getSource()).getText();
		if (btnName == "ไปต่อ")
		{
			frmPhuketGame.setVisible(false);
			switch(Q){
        	case"1":anstext();
			if (ans.equals("น้ำพริกกุ้งเสียบ")) {
				 Qcorrect.Qcorrect("1");
			 }
			 else {
				 incorrect.allincorrect("1");	
			}
    			break;
        	case"2":anstext();
			if (ans.equals("ขนมพริกไทย")) {
				 Qcorrect.Qcorrect("2");
			 }
			 else {
				 incorrect.allincorrect("2");	
			}
				break;
        	case"3":anstext();
			if (ans.equals("แหลมพรหมเทพ")) {
				 Qcorrect.Qcorrect("3");
			 }
			 else {
				 incorrect.allincorrect("3");	
			}
				break;
        	case"4":anstext();
			if (ans.equals("ไข่มุก")) {
				 Qcorrect.Qcorrect("4");
			 }
			 else {
				 incorrect.allincorrect("4");	
			}
				break;
			}}
	}
	
	public String anstext() {
		this.ans = textField.getText();
		return ans;
	}
	
	
	public void ans()
	{
		frmPhuketGame.setVisible(true);
	}
	
	

}