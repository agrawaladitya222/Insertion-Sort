package insertionsort;

import javax.swing.*;
import BreezySwing.*;

public class GUI extends GBFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame gui = new GUI();
		gui.setTitle("Insertion Sort");
		gui.setVisible(true);
		gui.setSize(800, 800);
	}

	public GUI() {
		outputbox.setEditable(false);
	}

	private JLabel inputlabel = addLabel("Input Integer:", 1, 1, 1, 1);
	private IntegerField inputbox = addIntegerField( 0, 2, 1, 1, 1);
	private JButton input = addButton("Input Number", 1, 2, 1, 1);
	private JButton outputmean = addButton("Output Mean", 3, 1, 1, 1);
	private JButton outputmedian = addButton("Output Median", 4, 1, 1, 1);
	private JButton outputmode = addButton("Output Mode", 5, 1, 1, 1);
	private JButton reset = addButton("Reset", 7, 1, 1, 1);
	private JTextArea outputbox = addTextArea("", 6, 1, 1, 1);
	private InsertionSort l = new InsertionSort();
	
	public void buttonClicked(JButton button) {
		if (button == input) {
			if(inputbox.isValidNumber()) {
				l.insert(inputbox.getNumber());
			}else {
				messageBox("Invalid Number");
			}
			l.findSmallest();
			
			
			if(l.checkendindex()) {
				input.setEnabled(false);
			}
		}
		if (button == outputmean) {

		}
		if (button == outputmedian) {

		}
		if (button == outputmode) {

		}
		if (button == reset) {

		}
	}
}
