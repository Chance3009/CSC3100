import java.awt.*;
import javax.swing.*;

public class AnotherLab4_1 extends JFrame {
	
	char parkType = 'T';
	int age = 0;
	int ageGroup;
	int price;
	
	AnotherLab4_1() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("Welcome to Mahkota Theme Park");
		this.setPreferredSize(new Dimension(600,500));
		this.setResizable(false);
		
		JLabel label1 = new JLabel("Park type: ");
		label1.setBounds(50, 50, 100, 50);
		
		JRadioButton themeButton = new JRadioButton("Theme Park");
		JRadioButton waterButton = new JRadioButton("Water Park");
		JRadioButton bothButton = new JRadioButton("Both Park");
				
		ButtonGroup group = new ButtonGroup();
		group.add(themeButton);
		group.add(waterButton);
		group.add(bothButton);
		
		themeButton.setSelected(true) ;
		
		JSlider slider = new JSlider(0,150,0);
		slider.setBounds(50, 100, 500, 100);;
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setOrientation(SwingConstants.HORIZONTAL);
		  
		JLabel label2 = new JLabel();
		label2.setBounds(275, 175, 100, 100);
		label2.setText("Age = "+ slider.getValue());
		slider.addChangeListener((e) -> {label2.setText("Age = "+ slider.getValue());
										age = slider.getValue();});
		
		JLabel label3 = new JLabel();
		label3.setBounds(210, 300, 200, 200);
		label3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		themeButton.setBounds(150,50,100,50);
		waterButton.setBounds(300,50,100,50);
		bothButton.setBounds(450,50,100,50);
		themeButton.addActionListener((e) -> {parkType = 'T';});
		waterButton.addActionListener((e) -> {parkType = 'W';});
		bothButton.addActionListener((e) -> {parkType = 'B';});
		
		int[][] parks = {{10, 25, 20, 10, 0}, 
				{15, 30, 25, 15, 7}, 
				{20, 45, 40, 20, 5}};
		
		JButton okButton = new JButton("Calculate");
		okButton.setBounds(250, 275, 100, 70);
		okButton.addActionListener((e) -> {
			if (age > 54) {
				ageGroup = 0;
			} else if (age > 20) {
				ageGroup = 1;
			} else if (age > 12) {
				ageGroup = 2;
			} else if (age > 2) {
				ageGroup = 3;
			} else {
				ageGroup = 4;
			}
			switch (parkType) {
			case 'T':
				price = parks[0][ageGroup];
				break;
			case 'W':
				price = parks[1][ageGroup];
				break;
			case 'B':
				price = parks[2][ageGroup];
				break;
			}
			label3.setText("Price is RM" + price);});		  
		 
		this.add(themeButton);
		this.add(waterButton);
		this.add(bothButton);
		this.add(okButton);
		this.add(slider);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new AnotherLab4_1();
	}
}
