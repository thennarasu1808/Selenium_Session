package test1;
import java.awt.AWTException; 
//import java.awt.Robot; 
//import java.awt.event.KeyEvent; 
import java.io.*; 

public class Write_Text_In_Notepde_Using_Robot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		
		//String command ="notepad.exe";
		Runtime run= Runtime.getRuntime();
		/*run.exec(command);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I); */
		
		int avlprocessor=run.availableProcessors();
		System.out.println("Available Peocessor: "+avlprocessor);
		System.out.println("Available free memory: "+run.freeMemory());
		System.out.println("Total memory: "+run.totalMemory());
		System.out.println("Class name: "+run.getClass());
		
	}

}
