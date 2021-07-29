package _01_File_Recorder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


import javax.swing.JOptionPane;
public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException
	{
	    System.out.println("Write anything you want	");
	    
	    String one = JOptionPane.showInputDialog("Enter something");
	    String two = JOptionPane.showInputDialog("Enter a title for your text");

	    try( PrintStream out = new PrintStream( new File( two ) ) ) {
	        out.println( one );
	    }
	}
	
}
