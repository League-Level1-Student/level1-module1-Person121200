package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What is your popcorn flavor?");
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		String heatTime = JOptionPane.showInputDialog("How long to heat in minutes?");
		int heatTimeAsint = Integer.parseInt(heatTime);
		microwave.setTime(heatTimeAsint);
		microwave.startMicrowave();
		popcorn.eat();
		
	}
}
