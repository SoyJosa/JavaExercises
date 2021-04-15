


import java.math.BigInteger;
import java.util.Scanner;

public class test {
	
	public static void exercise3() {
		int num = 565;
		String s = Integer.toString(num);
		int len = s.length();
		int result = 0;
		
		for(int i = 0; i < len; i ++) {
			String chararter = String.valueOf(s.charAt(i));
			result += Integer.parseInt(chararter);
		}
		
		System.out.println(result);
	}
	
	public static void excercise4() {
		int num = 123456;
		String s = Integer.toString(num);
		int len = s.length();
		
		for(int i = 0; i < len; i ++) {
			String chararter = String.valueOf(s.charAt(i));
			System.out.print(chararter + " ");
		}
		System.out.println(); 
	}
	
	public static void excercise5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert a float: "); 
		Double thing = scanner.nextDouble();
		scanner.close();
		
		if(Double.isFinite(thing)){
			System.out.println("The float number is Finite");		
		}else {
			System.out.println("The number is not Finite");
		}
	}
	
	public static void excercise6(){
		int a = -24;
		int b = 5;
		//Here when we use the unsigned method it would say that a is greater than b
		//because this method treads the numbers as unsigned numbers
		System.out.println("Compare two signed numbers: "+ Integer.compare(a, b));
		System.out.println("Compare two signed numbers: "+ Integer.compareUnsigned(a, b));
	}
	
	public static void excercise7() {
		// We can do a floor division or modulus using the operator when the dividend and divisor are int 
		int x = -4;
        int y = 3;
        System.out.println();
        System.out.println("Floor division using '/' operator: " + (x / y));
        System.out.println("Floor division using floorDiv() method is: " + Math.floorDiv(x, y));
        System.out.println();
        System.out.println("Floor modulus using '%' operator: " + (x % y));
        System.out.println("Floor modulus using floorMod() method is: " + Math.floorMod(x, y));
	}
	public static void excercise8() {
		// Here only the long types would have the value
		BigInteger bigval = BigInteger.valueOf(Long.MAX_VALUE);
		
        System.out.println("\nBigInteger value: "+bigval);
		long val_Long = bigval.longValue();
		System.out.println("\nConvert to an long value: "+val_Long);
        int val_Int = bigval.intValue();
		System.out.println("\nConvert to an int value: "+val_Int);
        short val_Short = bigval.shortValue();
        System.out.println("\nConvert to an short value: "+val_Short);
        byte val_Byte = bigval.byteValue();
        System.out.println("\nConvert to byte: "+val_Byte);
        long val_ExactLong = bigval.longValueExact();
		System.out.println("\nConvert to exact long: "+val_ExactLong);
	}
	
	public static void main(String[] args) {
		System.out.println("Excercise 3:");
		exercise3();
		System.out.println();
		System.out.println("Excercise 4:");
		excercise4();
		System.out.println();
		System.out.println("Excercise 5:");
		excercise5();
		System.out.println();
		System.out.println("Excercise 6:");
		excercise6();
		System.out.println();
		System.out.println("Excercise 7:");
		excercise7();
		System.out.println();
		System.out.println("Excercise 8:");
		excercise8();
		
		
		
	}


}

