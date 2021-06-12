import java.util.ArrayList;

public class Exceptions{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0 ; i < myList.size() ; i++){
            try{
                System.out.println((Integer) myList.get(i));
            }catch(Exception e){
                System.out.println("Exeption : "+ e.getMessage());
                System.out.println("index : "+i);
                System.out.println("Value : "+myList.get(i));
            }
        }
    }
}