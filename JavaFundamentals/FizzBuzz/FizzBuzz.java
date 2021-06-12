public class FizzBuzz {
    public static String fizzBuzz(int number) {
	if (number % 3 == 0 && number % 5 == 0){
		return "fizz buzz";
	}else if(number % 5 == 0){
		return "buzz";
	}else if(number % 3 == 0){
		return "fizz";
	}else{
		return Integer.toString(number);
	}
    }
    public static void main(String [] args){
	System.out.println(fizzBuzz(4));
    }
}
