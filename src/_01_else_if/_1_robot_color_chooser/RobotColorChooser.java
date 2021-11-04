
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot("batman");
		rob.setSpeed(10);
		rob.penDown();
		
		while(true) {
		
		for(int i = 0; i<8; i++) {
			rob.turn(45);
			rob.move(100);
		}
		rob.setPenWidth(10);
		String color = JOptionPane.showInputDialog("What color do you want the robot to draw with?");
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}else if(color.equalsIgnoreCase("orange")) {
			rob.setPenColor(Color.orange);
		}else if(color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.yellow);
		}else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		}else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}else if(color.equalsIgnoreCase("cyan")) {
			rob.setPenColor(Color.cyan);
		}else if(color.equalsIgnoreCase("magenta")){
			rob.setPenColor(Color.magenta);
		}else if(color.equalsIgnoreCase("pink")) {
			rob.setPenColor(Color.pink);
		}else if(color.equalsIgnoreCase("white")) {
			rob.setPenColor(Color.white);
		}else if(color.equalsIgnoreCase("black")) {
			rob.setPenColor(Color.black);
		}else {
			rob.setRandomPenColor();
		}
		}// hi
		
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
