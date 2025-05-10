package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.View;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Display implements ActionListener {
	private View view;
	private JFrame frmPhuketGane;
	private String name;
	private String Q;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	
	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public Display(String Q) {
		initialize(Q);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String Q) {
		
		this.Q =Q;
		
		frmPhuketGane = new JFrame();
		frmPhuketGane.setTitle("THE PUZZLE PHUET GAME ของดี๊ดีภูเก็ต");
		frmPhuketGane.setBounds(100, 100, 500, 500);
		frmPhuketGane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhuketGane.setLocationRelativeTo(null);
		
		ImageIcon imgIcon = new ImageIcon(this.getClass().getResource("/img/backg.png"));
        JLabel label = new JLabel(imgIcon);
        label.setBounds(-83, -135, 150, 150); // You can use your own values
		JPanel pic = new JPanel();
		pic.setBackground(new Color(0, 0, 51));
		frmPhuketGane.getContentPane().add(pic, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Angsana New", Font.PLAIN, 11));
		
		pic.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		frmPhuketGane.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setBounds(10, 10, 464, 152);
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, 16));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Display.class.getResource("/img/guard2.png")));
		lblNewLabel_3.setBounds(267, 117, 219, 152);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Display.class.getResource("/img/Money11.png")));
		lblNewLabel_4.setBounds(304, 0, 112, 69);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Display.class.getResource("/img/OO.png")));
		lblNewLabel_5.setBounds(10, 151, 121, 65);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(" ");
		lblNewLabel_6.setIcon(new ImageIcon(Display.class.getResource("/img/XX.png")));
		lblNewLabel_6.setBounds(101, 151, 116, 65);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Display.class.getResource("/img/Money33.png")));
		lblNewLabel_7.setBounds(71, 0, 106, 59);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Display.class.getResource("/img/Money22.png")));
		lblNewLabel_8.setBounds(206, 162, 112, 65);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Display.class.getResource("/img/backg.png")));
		lblNewLabel_2.setBounds(0, -66, 486, 720);
		panel.add(lblNewLabel_2);
		
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 51));
		frmPhuketGane.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNext = new JButton("ต่อไป");
		btnNext.setBackground(Color.WHITE);
		btnNext.setFont(new Font("Angsana New", Font.BOLD, 30));
		
		btnNext.addActionListener(this); 
		btnNext.setLayout(null);
		panel_2.add(btnNext);
		
		switch(Q){
	    	case"1":Q1Display();
				break;
	    	case"2":Q2Display();
				break;
	    	case"3":Q3Display();
				break;
	    	case"4":Q4Display();
				break;
    	}
	}

	public void Q1Display() {
		lblNewLabel_1.setText("<html>'น้ำพริกกุ้งเสียบ'<br/>จุดเด่นคือรสชาติเข้มข้น เผ็ดเปรี้ยวกลมกล่อมตามแบบฉบับอาหารใต้ พร้อมด้วยกุ้งกรอบ ตัวใหญ่ อร่อยได้เนื้อ จึงถือเป็นของฝากยอดฮิตที่พลาดไม่ได้เมื่อไปเยือนภูเก็ต โดยน้ำพริกกุ้งเสียบจะมีหลายสูตรแตกต่างกันไปตามร้านค้าที่จำหน่าย โดยอาจมีทั้งแบบเพิ่มเม็ดมะม่วงหิมพานต์หรือสูตรเข้มข้นสำหรับคนชอบทานรสจัด นอกจากนี้ยังมีแบบตำสดและแบบแห้งให้เลือกซื้ออีกด้วย</html>");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD,(int) 17.3));
		lblNewLabel.setIcon(new ImageIcon(Display.class.getResource("/img/mininampick.jpg")));
		lblNewLabel_1.setForeground(Color.white);
		frmPhuketGane.setVisible(true);
	}
	
	public void Q2Display() {
		lblNewLabel_1.setText("<html>'ขนมพริกไทย'<br/>เป็นขนมของว่าง ที่นิยมทานคู่กับน้ำชา มีรสชาติหวานกรอบ เผ็ดร้อนด้วยตัวเมล็ดพริกไทยดำ เป็นความลงตัวของรสชาติที่เต็มไปด้วยสรรพคุณทางยา และคุณประโยชน์ต่อร่างกาย คือจะช่วยขับลม แก้อาการท้องอืด ท้องเฟ้อ อีกทั้งในเมล็ดพริกไทยยังมีสารต้านอนุมูลอิสระ ซึ่งชาวภูเก็ตดั้งเดิมมักนิยมนำไปฝากคุณแม่หลังคลอดอีกด้วย</html>");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD,(int) 17.3));
		lblNewLabel.setIcon(new ImageIcon(Display.class.getResource("/img/Minikanom.jpg")));
		lblNewLabel_1.setForeground(Color.white);
		frmPhuketGane.setVisible(true);
	}
	
	public void Q3Display() {
		lblNewLabel_1.setText("<html>'แหลมพรหมเทพ'<br/>เป็นสถานที่ท่องเที่ยวแห่งหนึ่งในจังหวัดภูเก็ตและเป็นจุดชมวิวพระอาทิตย์ตกดินที่สวยงามแห่งหนึ่งของภูเก็ต ซึ่งอยู่ทางตอนใต้ของเกาะภูเก็ตห่างจากหาดราไวย์ประมาณ 2 กิโลเมตร รวมถึงเป็นจุดที่ใช้อ้างอิงเวลาพระอาทิตย์ตกดินของประเทศไทย สุดปลายของแหลมพรหมเทพ มีชื่อแหลมว่า แหลมเจ้า บริเวณตัวแหลมที่ยื่นออกไปในทะเล มีลักษณะโดดเด่นที่สังเกตได้ง่าย คือ กลุ่มต้นตาล</html>");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD,(int) 17.3));
		lblNewLabel.setIcon(new ImageIcon(Display.class.getResource("/img/pom.jpg")));
		lblNewLabel_1.setForeground(Color.white);
		frmPhuketGane.setVisible(true);
	}
	
	public void Q4Display() {
		lblNewLabel_1.setText("<html>'ไข่มุก'<br/>จังหวัดภูเก็ตได้ชื่อว่าเป็นแหล่งสำคัญในการผลิตไข่มุกน้ำเค็มของประเทศไทย เนื่องจากมีลักษณะภูมิประเทศเป็นเกาะที่ตั้งอยู่ท่ามกลางสภาพแวดล้อมทางทะเลที่มีความอุดมสมบูรณ์ ทำให้ประชาชนบางส่วนในพื้นที่มีการทำฟาร์มมุก และพัฒนาคุณภาพของไข่มุกมาอย่างยาวนาน จนเกิดเป็น “ไข่มุกอันดามัน” ซึ่งถือเป็นอัญมณีล้ำค่าแห่งเกาะภูเก็ตที่มีชื่อเสียงเลื่องลือไปทั่วโลกถึงความงดงามและความมีคุณค่า</html>");
		lblNewLabel_1.setFont(new Font("Angsana New", Font.BOLD, (int) 17.3));
		lblNewLabel.setIcon(new ImageIcon(Display.class.getResource("/img/bubble.jpg")));
		lblNewLabel_1.setForeground(Color.white);
		frmPhuketGane.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String btnName = ((JButton)e.getSource()).getText();
		if (btnName == "ต่อไป")
		{
			frmPhuketGane.dispose();
			RecordDisplay record = new RecordDisplay();
		}
	}

}