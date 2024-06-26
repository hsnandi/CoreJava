public class Datatypes {
    public static void main(String [] args){
        
        //Types of PRIMITIVE data types for variables:
        byte age = 21; //Byte can be in range of -128 to 127. Values cannot be more than it
        byte maxByte= 127;
        byte minByte= -128;
        
        int variable = 123; //Int represents a 32-bit signed integer. It can be in range of -2^31 2^31 -1.
        int maxInt = 2147483647;
        int minInt = -2147483647;

        short variable1 = 890; //Represents a 16-bit signed integer. It can be in range of -32768 to 32767
        
        long variable2 = 8402948271945L; //It ends with 'L' representing long.Represents a 64-bit signed integer. It can be in range of -2^63 2^63 -1.
        
        float pi = 3.14f; //It ends with 'f' or 'F' representing float.Represents a 32-bit floating number.
        
        double variable3 = 329854.397430294; //Represents a 64-bit floating number for decimal values.

        char grade = 'A'; // Represents a 16-bit unicode character. Are only under single quotes ' '
        char sign = '@';

        boolean isJavaFun = true; //Represents a value of true or false.

    //Non-Primitive data types.
    
    //Strings:
    String name = "Nandi"; //Non-primitive data types are initiated with the keyword 'new'. Although String can be initiated without using the keyword of 'new'.
       
    String name1 = "Harish";
    System.out.println(name1.length()); //This help us to get length of string by using '.length'. Output: 6
    //String dont have fix size.


    System.out.println(name1.charAt(0)); // This would tell us the character at the index. Index start from 0. Output: 'H'
    System.out.println(name1.charAt(1)) ;//Output: 'A'
    System.out.println(name1.charAt(2)); //Output: 'R'
    System.out.println(name1.charAt(3)) ; //Output: 'I'
    System.out.println(name1.charAt(4)); //Output: 'S'
    System.out.println(name1.charAt(5)); //Output: 'H'

    System.out.println(name1.substring(0, 5)); //Get values between the index using .substring . Output: aris

    System.out.println(name3.replace('H','M')); //This will replace H with M. Output : Manish. Small 'h' would not be replaced!
     
    String name2 = name + name 1 ; //We can concetenate strings with '+'
    System.out.println(name2); //Output : NandiHarish

    String name3 = name1.replace('H','M');
    System.out.println(name3); //This will replace H with M. Output : Manish. Small 'h' would not be replaced!
     //Original string (Harish) would not not be changed though because String in java is immutable i.e string would never be changed. To make change we need to make a new string with same values.

    
    //Arrays:
    //First to import package of 'java.util.Arrays'.
    int [] marks =  new int[3]; //Arrays are initiated with '[]'.
    marks [0]  = 99;
    marks [1] = 96;
    marks [2] = 89;
    System.out.println(marks); //This would only give us the position of array in heap location.
    
    int [] marks1 = {99,96,89} ; //Like string Array can be initiated without 'new' by directly assigning values.

    Arrays.sort(marks); //This is used for sorting Array
    
     

     //Casting:

     int price =  100;
     int finalPrice = price + (int)18.50; //Here one int (100) would be added to a double (18.50) so we do explicit casting by adding (int) . 
     //Double and float can be used for casting into int, but integer cannot be casted to double or float. String or character cannot be used.
     //Number after point (.) would be ignored while casting. 
    
    //Constant:
    final float g = 9.8F; //Using the 'final' keyword would make this constant. so henceforth 'g' could not be now changed further.

    
    
    }
}
