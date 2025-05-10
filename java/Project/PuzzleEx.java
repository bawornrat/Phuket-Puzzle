package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;//--.--
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PuzzleEx extends JFrame{
	private JPanel panel ;
    private BufferedImage source;
    private BufferedImage resized;    
    private Image image;
    private MyButton lastButton;
    private int width, height;    
 
    private static PuzzleEx puzzle = null ;
    private ArrayList<MyButton> buttons;
    private ArrayList<Point> solution;
    private String Q;
    private final int NUMBER_OF_BUTTONS = 16;
    private final int DESIRED_WIDTH = 500;
	

    public PuzzleEx(BufferedImage img,String Q) {

        initUI(img,Q);
    }

    private void initUI(BufferedImage img,String Q) {
    	this.Q =Q;
        solution = new ArrayList<>();
        
        solution.add(new Point(0, 0));
        solution.add(new Point(0, 1));
        solution.add(new Point(0, 2));
        solution.add(new Point(0, 3));
        solution.add(new Point(1, 0));
        solution.add(new Point(1, 1));
        solution.add(new Point(1, 2));
        solution.add(new Point(1, 3));
        solution.add(new Point(2, 0));
        solution.add(new Point(2, 1));
        solution.add(new Point(2, 2));
        solution.add(new Point(2, 3));
        solution.add(new Point(3, 0));
        solution.add(new Point(3, 1));
        solution.add(new Point(3, 2));
        solution.add(new Point(3, 3));
        
        //but = new ArrayList<>();
        
        buttons = new ArrayList<>();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.gray));
        panel.setLayout(new GridLayout(4, 4, 0, 0));

        try {
            source = img;
            resized = resizeImage(source, DESIRED_WIDTH, DESIRED_WIDTH,
                    BufferedImage.TYPE_INT_ARGB);

        } catch (IOException ex) {
            Logger.getLogger(PuzzleEx.class.getName()).log(
                    Level.SEVERE, null, ex);
        }

        width = resized.getWidth(null);
        height = resized.getHeight(null);

        add(panel, BorderLayout.CENTER);

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                image = createImage(new FilteredImageSource(resized.getSource(),
                        new CropImageFilter(j * width / 4, i * height / 4,
                                (width / 4), height / 4)));
                
                MyButton button = new MyButton(image);
                button.putClientProperty("position", new Point(i, j));
                //button.putClientProperty(object key, object value)

                if (i == 3 && j == 3) {
                    lastButton = new MyButton();
                    lastButton.setBorderPainted(false);
                    lastButton.setContentAreaFilled(false);
                    lastButton.setLastButton();
                    lastButton.putClientProperty("position", new Point(i, j));
                   
                } else {
                    buttons.add(button);
                }
            }
        }

        Collections.shuffle(buttons);
        buttons.add(lastButton);

        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {

            MyButton btn = buttons.get(i);
            panel.add(btn);
            btn.setBorder(BorderFactory.createLineBorder(Color.gray));
            btn.addActionListener(new ClickAction());
        }

        
        setTitle("THE PUZZLE PHUET GAME �ͧ��������");
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    

    private BufferedImage resizeImage(BufferedImage originalImage, int width,
            int height, int type) throws IOException {

        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        return resizedImage;
    }


    

   
     private static BufferedImage loadImage1() throws IOException {
    	
        BufferedImage bimg = ImageIO.read(new File("C:\\Users\\PC\\eclipse-workspace\\Project\\src\\img\\nampick.jpg"));

        return bimg;
    }

    private static BufferedImage loadImage2() throws IOException {
    	
        BufferedImage bimg = ImageIO.read(new File("C:\\Users\\PC\\eclipse-workspace\\Project\\src\\img\\kanom.jpg"));

        return bimg;
    }

    private static BufferedImage loadImage3() throws IOException {
    	
        BufferedImage bimg = ImageIO.read(new File("C:\\Users\\PC\\eclipse-workspace\\Project\\src\\img\\pom2.jpg"));

        return bimg;
    }

    private static BufferedImage loadImage4() throws IOException {
    	
        BufferedImage bimg = ImageIO.read(new File("C:\\Users\\PC\\eclipse-workspace\\Project\\src\\img\\bubble2.jpg"));

        return bimg;
    }
    
    public static void Q1() {
		try {
    		puzzle = new PuzzleEx(loadImage1(),"1");
    	} catch (IOException e1) {
    		// TODO Auto-generated catch block
    		e1.printStackTrace();
    	}
    	puzzle.setVisible(true);
		
	}

    public static void Q2() {
    	try {
    		puzzle = new PuzzleEx(loadImage2(),"2");
    	} catch (IOException e1) {
    		// TODO Auto-generated catch block
    		e1.printStackTrace();
    	}
    	puzzle.setVisible(true);
    }
    
    public static void Q3() {
    	try {
    		puzzle = new PuzzleEx(loadImage3(),"3");
    	} catch (IOException e1) {
    		// TODO Auto-generated catch block
    		e1.printStackTrace();
    	}
    	puzzle.setVisible(true);
    }
    
    public static void Q4() {
    	try {
    		puzzle = new PuzzleEx(loadImage4(),"4");
    	} catch (IOException e1) {
    		// TODO Auto-generated catch block
    		e1.printStackTrace();
    	}
    	puzzle.setVisible(true);
    }
    public class ClickAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            checkButton(e);
            checkSolution();
        }

        private void checkButton(ActionEvent e) {

            int lidx = 0;
            
            int i =0;
            for (MyButton button : buttons) {
          
                if (button.isLastButton()) {
                    lidx = buttons.indexOf(button);
                    
                }
            }

            JButton button = (JButton) e.getSource();
        
            
            int bidx = buttons.indexOf(button);
            
            Collections.swap(buttons, bidx, lidx);
            updateButtons();
           
        }

        private void updateButtons() {

            panel.removeAll();
            
            for (JComponent btn : buttons) {

                panel.add(btn);
            }
            
            panel.validate();
    }

    private void checkSolution() {

        ArrayList<Point> current = new ArrayList<>();

        for (JComponent btn : buttons) {
            current.add((Point) btn.getClientProperty("position"));
        }

        if (compareList(solution, current)) {
        	puzzle.setVisible(false);
        	switch(Q){
        	case"1":Answer Q1 = new Answer("1");
    			Q1.ans();
    			break;
        	case"2":Answer Q2 = new Answer("2");
				Q2.ans();
				break;
        	case"3":Answer Q3 = new Answer("3");
				Q3.ans();
				break;
        	case"4":Answer Q4 = new Answer("4");
        		Q4.ans();
				break;
        	}
        }
    }
    public boolean compareList(ArrayList ls1, ArrayList current) {
        
        return ls1.toString().contentEquals(current.toString());
    }
    
    }
    }
    

	

	
	

	

