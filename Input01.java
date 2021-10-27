package input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Type Something:");
        
        System.out.println(input);
        
        int numberOne = Integer.parseInt(input);
        
        System.out.println(numberOne+1);
        
        
        
        int numTwo = Integer.parseInt (JOptionPane.showInputDialog("Type a Number:"));
System.out.println(numTwo);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}
