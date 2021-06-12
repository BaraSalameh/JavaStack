public class GreeterTest {
    public static void main(String[] args){
        Greeter hw = new Greeter();
        String greeting = hw.greeting();
        String greetingWithName = hw.greetingWithName("Bara Salameh");

        if(greeting.equals("Hello World") || greetingWithName.equals("Hello Bara Salameh")){
            System.out.println("Successfully worked!");
        }else{
            System.out.println("Test Failed");
        }
    }
}
