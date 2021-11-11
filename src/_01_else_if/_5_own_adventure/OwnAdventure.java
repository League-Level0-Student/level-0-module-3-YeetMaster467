package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "You are sitting on your couch watching TV.\nSuddenly, you hear a strange noise coming from the basement.");
		String option1String = JOptionPane.showInputDialog("Do you (1) keep watching TV and do nothing,\n(2) go down and investigate,\nor, (3) panic and call 911?");
		int option1 = Integer.parseInt(option1String);
		
		if(option1 == 1) {
			JOptionPane.showMessageDialog(null, "You keep watching TV. The noise eventually stops, but it comes back somtimes and you just ignore it.");
			System.exit(0);
		}else if(option1 == 2) {
			JOptionPane.showMessageDialog(null, "You get up and start twards the basement. You go down the creaky basement stairs and flick on the basement lights.");
			JOptionPane.showMessageDialog(null, "You are startled when some alien creature lurches at you. Your reflexes kick in and you punch it in its face, knocking it out.");
			String option2String = JOptionPane.showInputDialog("Do you (1) finish it off and kill it, or (2) take pity on it and try to help it?");
			int option2 = Integer.parseInt(option2String);
			if(option2 == 1) {
				JOptionPane.showMessageDialog(null, "You pull out your consealed glock and shoot it once. The crature is no more.");
				System.exit(0);
			}
		}
	}

}
