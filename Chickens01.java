
package chickens01;

/**
 *
 * @author maconrm180
 */
public class Chickens01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Chicken Egg Count by Joe Burks
    
    //Variables
    int totalEggs =0;
    int chickenCount = 3;
    int eggsPerChicken = 5;
            
    String dayOfWeek = "Monday ";
    String labelOne = " Farmer Brown's chickens number ";
    String labelTwo = " Farmer Brown's eggs number ";
    String frontEndLabel = "On ";
    
    
    // Monday Eggs
   
        // Egg Calculation
    
        totalEggs = chickenCount * eggsPerChicken;
        
        // Print Answer
        
    System.out.println(frontEndLabel + dayOfWeek + labelOne + chickenCount + labelTwo +  totalEggs);
    
    //Tuesday
    
    dayOfWeek = "Tuesday ";
    chickenCount++;
    
    // Egg Calculation
    
        totalEggs = chickenCount * eggsPerChicken;
    
    //Print Answer
    
    System.out.println(frontEndLabel + dayOfWeek + labelOne + chickenCount + labelTwo +  totalEggs);
    
    // Wednesday
    
    dayOfWeek= "Wednesday ";
    chickenCount = chickenCount/2;
    
    // Egg Calculation
    
        totalEggs = chickenCount * eggsPerChicken;
        
        // Print Answer
        
    System.out.println(frontEndLabel + dayOfWeek + labelOne + chickenCount + labelTwo +  totalEggs);
    
    
    
    
        
      System.out.println(totalEggs);
    }
    
}
