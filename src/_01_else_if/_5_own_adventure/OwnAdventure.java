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
			}else if(option2 == 2) {
				JOptionPane.showMessageDialog(null, "When the monster wakes up you feed it some meat scraps you had in the freezer.\nIt seems almost... happy?");
				JOptionPane.showMessageDialog(null, "You decide to keep it as a pet. You develop sort of a bond with it.");
				JOptionPane.showMessageDialog(null, "You end up living happily ever after with your alien creature!\nMaybe you'll find out what it actually is someday.");
				System.exit(0);
			}else {
				JOptionPane.showMessageDialog(null, "You decide to do nothing at let the creature live. It wakes up and bites your head off.");
				System.exit(0);
			}
		}else if(option1 == 3) {
			JOptionPane.showMessageDialog(null, "You dash to the phone and call 911. They send some people over to help you out.");
			JOptionPane.showMessageDialog(null, "They kick open the basement door. They spot a strange alien creature in the darkness.");
			JOptionPane.showMessageDialog(null, "They manage to haul the creature into the truck. It bites some of the people's arms off in the process though.");
			JOptionPane.showMessageDialog(null, "The creature is now out of your life. You see in the news a few days later that an alien creature killed multiple scientists while conducting experiments on it.");
			JOptionPane.showMessageDialog(null, "You realize now that you let a monster out into the world.");
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null, "You run away from your house in fear. You return noticing that the noise is gone, but so is all the meat in your freezer.");
			System.exit(0);
		}
	}

}
