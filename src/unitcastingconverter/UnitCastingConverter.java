package unitcastingconverter;

public class UnitCastingConverter {

    public static void main(String[] args) {
        double centimeters = 696.9;
        
        int meters = (int) (centimeters / 100);
        double remainingCentimeters = centimeters - (meters * 100);
        
        System.out.println("Unit Casting Converter");
        System.out.println("Total Centimeters: " + centimeters);
        System.out.println("Whole meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);
        
        
        int number = 25;
        double windenedNumber = number;
        
        //no need to cast cause double stores all the int value
        System.out.println("\nImplict Widening:");
        System.out.println("Integer: " + number);
        System.out.println("Double: " + windenedNumber);
        
        double decimalNumber = 15.50;
        int narrowedNumber = (int) decimalNumber;
        
        //The Decimal part (yung .50 po sa double decimalNumber) is lost when turning into double to int
        System.out.println("\nExplicit Narrowing:");
        System.out.println("Double: " + decimalNumber);
        System.out.println("Integer: " + narrowedNumber);
    }
    
}
