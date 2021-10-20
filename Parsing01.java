package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "87rhr8yh38";
        
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        int result = Integer.parseInt(shirtPrice);
        double result2 = Double.parseDouble (taxRate);
        double totalTax = (result * result2);
        System.out.println(totalTax);
        //Try to parse taxRate as an int
        int taxRateInt = Integer.parseInt(taxRate);
        System.out.println(taxRateInt);
        //Try to parse gibberish as an int
        int gibberishint = Integer.parseInt(gibberish);
        System.out.println(gibberishint);
    }
    
}
