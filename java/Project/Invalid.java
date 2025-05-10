package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Invalid implements ActionListener {

	private JFrame frmPhuketGame;
	private JButton btnNewButton;
	private String Q;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Invalid() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPhuketGame = new JFrame();
		frmPhuketGame.setTitle("THE PUZZLE PHUET GAME ของดี๊ดีภูเก็ต");
		frmPhuketGame.setBounds(100, 100, 500, 500);
		frmPhuketGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhuketGame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 486, 68);
		panel.setBackground(Color.RED);
		frmPhuketGame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("เสียใจด้วย คุณตอบผิด");
		lblNewLabel.setBounds(148, 0, 278, 68);
		lblNewLabel.setForeground(Color.white);
		lblNewLabel.setFont(new Font("Angsana New", Font.BOLD, 45));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Invalid.class.getResource("/img/XX.png")));
		lblNewLabel_2.setBounds(41, 0, 117, 68);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 388, 496, 75);
		panel_1.setBackground(Color.RED);
		frmPhuketGame.getContentPane().add(panel_1);
		
		btnNewButton = new JButton("ต่อไป");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(175, 11, 132, 53);
		btnNewButton.setFont(new Font("Angsana New", Font.BOLD, 30));
		btnNewButton.addActionListener(this);
		panel_1.setLayout(null);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setIcon(new ImageIcon(Invalid.class.getResource("/img/wrong.gif")));
		lblNewLabel_1.setBounds(-10, 56, 496, 351);
		frmPhuketGame.getContentPane().add(lblNewLabel_1);
		frmPhuketGame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String btnName = ((JButton)e.getSource()).getText();
		
		if (btnName == "ต่อไป")
		{
			frmPhuketGame.dispose();
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

	public void allincorrect(String Q) {
		this.Q = Q ;
		frmPhuketGame.setVisible(true);
		
	}
}
