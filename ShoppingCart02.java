
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double itemPrice = 12.00, salesTax = 0.10 ;
        int itemQuantity = 2;
        
        
        // Declare and assign a calculated totalPrice
        double totalPrice = (itemPrice * itemQuantity);
        totalPrice = totalPrice + (totalPrice * salesTax);
        
        // Modify message to include quantity 
        
        System.out.println(message);
        
        System.out.println("Total Cost with tax is: $"+ totalPrice);
        
        // Print another message with the total cost
        
    }    
}
