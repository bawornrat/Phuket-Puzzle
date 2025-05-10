package Project;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Start implements ActionListener{
	JButton start = new JButton("");
	JFrame frmThePuzzlePhuket = new JFrame();
	private final JLabel lblNewLabel_1 = new JLabel("");
	
	Start(){
		
		
		
		//Start
				start.setBounds(234, 219, 126, 56);//x,y,width,height
				start.addActionListener(this);
				
				start.setRolloverEnabled(true);//setRolloverButton
				start.setIcon(new ImageIcon(Start.class.getResource("/img/Start1.png")));
				start.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/Start2.png")));
				
				start.setBorderPainted(false);//make button visible
				start.setContentAreaFilled(false);//make button 0% opacity
				start.setFocusPainted(false); 
				start.setOpaque(false);
				
				//frame-menu
				frmThePuzzlePhuket.getContentPane().add(start);//add start button
				frmThePuzzlePhuket.getContentPane().setBackground(Color.WHITE);
				frmThePuzzlePhuket.setFont(new Font("Angsana New", Font.BOLD, 12));
				frmThePuzzlePhuket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frmThePuzzlePhuket.setTitle("THE PUZZLE PHUET GAME \u0E02\u0E2D\u0E07\u0E14\u0E35\u0E4A\u0E14\u0E35\u0E20\u0E39\u0E40\u0E01\u0E47\u0E15");
				frmThePuzzlePhuket.setResizable(false);
				frmThePuzzlePhuket.setSize(500,500);
				frmThePuzzlePhuket.getContentPane().setLayout(null);
				frmThePuzzlePhuket.setLocationRelativeTo(null);
				
				lblNewLabel_1.setIcon(new ImageIcon(Start.class.getResource("/img/Pg.png")));
				lblNewLabel_1.setBounds(117, 0, 215, 142);
				
				frmThePuzzlePhuket.getContentPane().add(lblNewLabel_1);
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(Start.class.getResource("/img/THE PUZZLE PHUKET GAME.png")));
				lblNewLabel.setBounds(-45, -40, 531, 566);
				frmThePuzzlePhuket.getContentPane().add(lblNewLabel);
				frmThePuzzlePhuket.setVisible(true);

				
				
				
	}
	
	public static void main(String[] args) {
		Start start = new Start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
			frmThePuzzlePhuket.dispose();
			Menu menu = new Menu();
	
	}
		
}
}



