import java.util.ArrayList;
public class BasicJava{
	public static void printNumbers(){
		for(int i = 1; i <= 255 ; i++){
			System.out.println(i);
		}
	}
	public static void printOddNumbers(){
		for(int i = 1; i <= 255 ; i+= 2){
			System.out.println(i);
		}
	}
	public static void printSumNumbers(){
		int sum = 0;
		for(int i = 0; i <= 255 ; i++){
			System.out.print(i);
			sum += i;
			System.out.println(" "+sum);
		}
	}
	public static void arrayNumbers(int[] myArray){
		for(int i = 0; i < myArray.length; i++){
			System.out.println(myArray[i]);
		}
		
	}
	public static int findMax(int[] myArray){
		int max = myArray[0];
		for(int i = 1 ; i < myArray.length ; i++){
			if(myArray[i] > max){
				max = myArray[i];
			}
		}
		return max;
		
	}
	public static double findAverage(int[] myArray){
		int sum = myArray[0];
		for(int i = 1 ; i < myArray.length ; i++){
			sum += myArray[i];
		}
		return sum/myArray.length;
		
	}
	public static ArrayList<Integer> createOddNumbersArray(){
		ArrayList <Integer> al = new ArrayList <Integer>();
		for(int i = 1 ; i <= 255 ; i+= 2){
			al.add(i);
		}
		return al;
	}
	public static int greaterThanY(int [] myArray, int y){
		int counter = 0;
		for(int i = 0 ; i < myArray.length ; i++){
			if(myArray[i] > y)
				counter++;
		}
		return counter;
	}
	public static int[] squareArray(int [] myArray){
		for(int i = 0 ; i < myArray.length ; i++){
			myArray[i] = myArray[i]*myArray[i];
		}
		return myArray;
	}
	public static int[] eliminateNegativeNumbers(int [] myArray){
		for(int i = 0 ; i < myArray.length ; i++){
			if(myArray[i] < 0)
				myArray[i] = 0;
		}
		return myArray;
	}
	public static int findMin(int [] myArray){
		int min = myArray[0];
		for(int i = 1 ; i < myArray.length ; i++){
			if(myArray[i] < min)
				min = myArray[i];
		}
		return min;
	}
	public static double[] maxMinAverage(int [] myArray){
		double[] resultArray = {findMax(myArray), findMin(myArray), findAverage(myArray)};
		return resultArray;
	}
	public static int[] shiftingTheValuesInTheArray(int[] myArray){
		for(int i = 0 ; i < myArray.length-1 ; i++){
			myArray[i] = myArray[i+1];
		}
		myArray[myArray.length-1] = 0;
		return myArray;
	}
	
	public static void main(String [] args){
		BasicJava bj = new BasicJava();
		//bj.printNumbers();
		//bj.printOddNumbers();
		//bj.printSumNumbers();

		//int[] myArray = {1,3,5,7,9,13};
		//bj.arrayNumbers(myArray);

		//int[] myArray = {-3, -5, -7};
		//findMax(myArray);

		//int[] myArray = {2, 10, 3};
		//findAverage(myArray);

		//ArrayList<Integer> al = new ArrayList<Integer>();
		//al = createOddNumbersArray();
		//System.out.println(al);

		//int[] myArray = {1,5,2,7};
		//System.out.println(greaterThanY(myArray, 3));

		//int[] myArray = {1,5,10,-2};
		//int[] resultArray = squareArray(myArray);
		//for(int i = 0 ; i < resultArray.length ; i++){
		//	System.out.println(resultArray[i]);
		//}

		//int[] myArray = {1,-5,10,-2};
		//int[] resultArray = eliminateNegativeNumbers(myArray);
		//for(int i = 0 ; i < resultArray.length ; i++){
		//	System.out.println(resultArray[i]);
		//}

		//int[] myArray = {1,5,10,-2};
		//double[] resultArray = maxMinAverage(myArray);
		//for(int i = 0 ; i < resultArray.length ; i++){
		//	System.out.println(resultArray[i]);
		//}

		int[] myArray = {1, 5, 10, 7, -2};
		int[] resultArray = shiftingTheValuesInTheArray(myArray);
		for(int i = 0 ; i < resultArray.length ; i++){
			System.out.println(resultArray[i]);
		}

		
	}
}