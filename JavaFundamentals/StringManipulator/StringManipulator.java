public class StringManipulator{
	public static String trimAndConcat(String firstWord, String secondWord){
		return firstWord.trim()+secondWord.trim();
	}
	public static int getIndexOrNull(String word,char letter){
		return word.indexOf(letter);
	}
	public static int getIndexOrNull(String word,String letter){
		return word.indexOf(letter);
	}
	public static String concatSubstring(String word, int start, int end, String secondWord){
		String output = word.substring(start,end);
		return output+secondWord;
	}
	public static void main(String [] args){
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hello     ","     World    ");
		System.out.println(str);
		System.out.println("_________________________________________________________");

		
		StringManipulator secondManipulator = new StringManipulator();
		char letter = 'o';
		Integer a = secondManipulator.getIndexOrNull("Coding", letter);
		Integer b = secondManipulator.getIndexOrNull("Hello World", letter);
		Integer c = secondManipulator.getIndexOrNull("Hi", letter);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("_________________________________________________________");

		StringManipulator thirdManipulator = new StringManipulator();
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer d = thirdManipulator.getIndexOrNull(word, subString);
		Integer e = thirdManipulator.getIndexOrNull(word, notSubString);
		System.out.println(d); // 2
		System.out.println(e); // null
		System.out.println("_________________________________________________________"); 
		
		StringManipulator fourthManipulator = new StringManipulator();
		String finalWord = fourthManipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(finalWord); // eworld
		System.out.println("_________________________________________________________");

	}
}