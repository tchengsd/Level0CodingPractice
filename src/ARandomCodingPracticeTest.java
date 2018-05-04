import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ARandomCodingPracticeTest {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.setSpeed(2000000000);
		robot.penDown();
		
		robot.setPenWidth(10);
		int color = JOptionPane.showOptionDialog(null, "What color do you want your shapes to be drawn in?",
				"SAMPLE_TXT", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "Red", "Green", "Blue" }, 0);
		if (color == 0) {
			robot.setPenColor(175, 0, 0);
		} else if(color == 1) {
			robot.setPenColor(0, 255, 0);
		} else if(color == 2) {
			robot.setPenColor(0, 0, 175);
		}
		String shape = JOptionPane.showInputDialog("How many shapes do you want to be drawn?");
		int shapeNum = Integer.parseInt(shape);
		for(int i = 0;i<shapeNum;i++) {
			robot.penDown();
			for (int j = 0; j < 4; j++) {
				robot.move(100);
				robot.turn(90);
			}
			robot.penUp();
			robot.move(-125);
		}
	}
}
