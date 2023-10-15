package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.lang.model.element.PackageElement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Convertor implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(20);
	JLabel label = new JLabel();
	JButton button = new JButton();
    
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button) {
			label.setText(convert(text.getText()));
		}
	}



	public void showButton() {
		button.addActionListener(this);
		button.setText("Convert");
		frame.setTitle("Convert 8 Bits of Binary to ASCII");
		panel.add(button);
		panel.add(text);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}





	
	

	
}
