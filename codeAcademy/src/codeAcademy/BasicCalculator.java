package codeAcademy;

public class BasicCalculator {

	  public BasicCalculator(){

	  }
	  public int add(int a, int b){
	    int sum = a + b;
	    return sum;
	  }
	  public int subtract(int a, int b){
	    int difference = a - b;
	    return difference;
	  }

	   public int multiply(int a, int b){
	    int product = a * b;
	    return product;
	  }
	  public int divide(int a, int b){
	    int division = a / b;
	    return division;
	  }
	  public int modulo(int a, int b){
	    int result = a % b;
	    return result;
	  }

	  public static void main (String[] args){
		  BasicCalculator mycalculator = new BasicCalculator();

	    System.out.println(mycalculator.add(5,7));
	    System.out.println(mycalculator.subtract(45,11));
	  }
	}