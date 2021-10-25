package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "This is still not an input, but I did change the message!",
                "Thing",
                2);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Is this is a new title?",
                "Title of Thing",
                1,
                null,
                null,
                "Type something here.");
        
        
        String[] acceptableValues = {"The First Thing", "The Second Thing", "The Third Thing"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a new title?",
                "Another Title of Thing",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
        
        System.out.println(input1);
        System.out.println(input2);
                
    }
}
