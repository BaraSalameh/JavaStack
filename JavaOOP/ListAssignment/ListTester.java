public class ListTester {
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(5);
        sll.add(10);
        sll.add(15);
        sll.add(20);
        sll.add(25);

        sll.printValues();

        Node node;
        node = sll.find(10);
        try{
            System.out.println(node.value);
        }catch(Exception e){
            System.out.println("The value doesn't exist!");
        }

        System.out.println(" ");
        sll.removeAt(2);
        sll.printValues();
    }
}
