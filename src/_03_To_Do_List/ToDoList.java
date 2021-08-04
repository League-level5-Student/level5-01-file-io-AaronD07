package _03_To_Do_List;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class ToDoList implements ActionListener{
	private JLabel label = new JLabel();
	private JFrame frme = new JFrame();
	private JPanel panel = new JPanel();
	private JButton button1 = new JButton("add task");
	private JButton button2 = new JButton("view tasks");
	private JButton button3 = new JButton("remove task");
	private JButton button4 = new JButton("save list");
	private JButton button5 = new JButton("load list");
	ArrayList<String> buttonsList = new ArrayList<String>();

	public ToDoList() {
		frme.setVisible(true);
		frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frme.setLayout(new FlowLayout());
		label.setName("to do list");
		frme.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		frme.add(panel);

		button1.addActionListener((event) -> {
String oneQ = JOptionPane.showInputDialog("Enter a task");
buttonsList.add(oneQ);
		});
		button2.addActionListener((event)-> {
			for(int i=0; i<buttonsList.size(); i++) {
				
			
			System.out.print(buttonsList.get(i) + ", ");
			}
		});
		button3.addActionListener((event)-> {
			System.out.println( );
			String remove = JOptionPane.showInputDialog("Which # on list would you like to remove?");
			int remove2 = Integer.parseInt(remove);
			buttonsList.remove(remove2-1);
			for(int i=0; i<buttonsList.size(); i++) {
				
				
				System.out.print(buttonsList.get(i) + ", ");
				}
		});
		button4.addActionListener((event)->{
			  
			    String two = JOptionPane.showInputDialog("Enter a title for your text");

			    try( PrintStream out = new PrintStream( new File( two ) ) ) {
			        out.println( buttonsList );
			    } catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		});
	}
	public static void main(String[] args) {
		new ToDoList();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
}
