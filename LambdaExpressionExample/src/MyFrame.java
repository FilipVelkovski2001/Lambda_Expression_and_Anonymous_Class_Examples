import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	JButton myButton = new JButton("My button 1!");
	JButton myButton2 = new JButton("My button 2!");

	
	MyFrame(){
	
		//Here we are using the lambda expression to set an action for our button!
		//We can also use the anonymous inner class approach but the lambda expression is quicker and more versitile!
		
		myButton.setBounds(100, 100, 200, 100);
		myButton.addActionListener(
			(e) -> System.out.println("This is the first button!")
		);
		
		myButton2.setBounds(100, 200, 200, 100);
		myButton2.addActionListener(
			(e) -> System.out.println("This is the second button!")
		);
		
		this.add(myButton);
		this.add(myButton2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
	}
	
}
