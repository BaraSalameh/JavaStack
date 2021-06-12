import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava{
    public static ArrayList<Integer> numbersGreaterThanTen(int[] myArray){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0 ; i < myArray.length ; i++){
            System.out.println(myArray[i]);
            if(myArray[i] > 10)
                al.add(myArray[i]);
        }
        return al;      
    }
    public static ArrayList<String> arrayOfNames(ArrayList<String> names){
        Collections.shuffle(names);
        System.out.println(names);
        ArrayList<String> newNames = new ArrayList<String>();
        for(int i = 0 ; i < names.size() ; i++){
            if(names.get(i).length() > 5)
                newNames.add(names.get(i));
        }
        return newNames;
    }
    public static void shuffleLetters(ArrayList<Character> letters){
        Collections.shuffle(letters);
        System.out.println(letters);
        char[] aeiou = {'a','e','i','o','u'};
        for(char l : aeiou){
            if(letters.get(0) == l)
                System.out.println("The first letter in the shuffled ArrayList is vowel!");
            else if(letters.get(letters.size()-1) == l)
                System.out.println("The last letter in the shuffled ArrayList is vowel!");
        }
    }
    public static int[] generateTenRandomNumbers(){
        Random number = new Random();
        int[] randomNumbers = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            randomNumbers[i] = number.nextInt(101-55)+55;
        }
        return randomNumbers;
    }
    public static ArrayList<Integer> sortRandomNumbers(){
        
        int[] randomNumbers = generateTenRandomNumbers();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0 ; i < randomNumbers.length ; i++){
            al.add(randomNumbers[i]);
        }
        Collections.sort(al);
        return al;
    }
    public static String generateRandomString(){
        Character[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random number = new Random();
        String word = new String();
        for(int i = 0 ; i < 5 ; i++){
            word += alpha[number.nextInt(26)];
        }
        return word;
    }
    public static ArrayList<String> arrayString(){
        ArrayList<String> words = new ArrayList<String>();
        for(int i = 0 ; i < 10 ; i++){
            words.add(generateRandomString());
        }
        return words;
    }
    public static void main(String[] args){
        //Q1
        // int[] myArray = {3,5,1,2,7,9,8,13,25,32};
        // ArrayList<Integer> myArrayList = numbersGreaterThanTen(myArray);
        // System.out.println(myArrayList);

        //Q2
        // String[] myArray = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        // ArrayList<String> myArrayList = new ArrayList<String>();
        // for(int i = 0 ; i < myArray.length ; i++){
        //     myArrayList.add(myArray[i]);
        // }
        // System.out.println(arrayOfNames(myArrayList));

        //Q3
        // ArrayList<Character> alphabet = new ArrayList<Character>();
        // Character[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        // for(int i = 0 ; i < alpha.length ; i++){
        //     alphabet.add(alpha[i]);
        // }
        // shuffleLetters(alphabet);

        //Q4
        // int[] myArray = generateTenRandomNumbers();
        // for(int i = 0 ; i < myArray.length ; i++){
        //     System.out.println(myArray[i]);
        // }

        //Q5
        // ArrayList<Integer> al = sortRandomNumbers();
        // System.out.println(al);
        // System.out.println(al.get(0));
        // System.out.println(al.get(al.size()-1));

        //Q6
        // System.out.println(generateRandomString());

        //Q7
        System.out.println(arrayString());
        
    }
}