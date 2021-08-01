package _02_File_Encrypt_Decrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

public class FileEncryptor {
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a messager.
	 * Use any key you want (1 - 25) to shift each letter in the users input and save the final result to a file.
	 * 
	 * 
	
	 */
	 public static void main(String[] args) {        
	    
	    }
	 String S =   JOptionPane.showInputDialog("enter a string");
     String one = JOptionPane.showInputDialog("and the amount of shifts");
    int two = Integer.parseInt(one);
    int[] shifts;
    
	    /* Solution */
	    public String shiftingLetters(String S, int[] shifts) {
	         
	        int previous = 0;
	        for(int i=shifts.length-1; i>=0; i--){            
	            shifts[i] = (shifts[i] + previous) % 26;
	            previous = shifts[i];
	        }
	         
	        char[] chars = S.toCharArray();
	        for(int i=0; i<chars.length; i++){
	            chars[i] = (char)('a' + (((int)chars[i] + shifts[i]) % 'a') % 26);
	        }
	        return String.valueOf(chars);
	    }
	
	

}
