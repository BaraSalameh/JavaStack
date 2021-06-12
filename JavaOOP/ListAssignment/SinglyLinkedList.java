public class SinglyLinkedList {
    private Node head;

    public void add(double value){
        Node node = new Node(value);
        if(this.head == null){
            this.head = node;
        }else{
            Node temp = this.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void remove(){
        Node temp = this.head;
        while(true){
            if(temp.next.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = null;
    }
    public void printValues(){
        Node temp = this.head;
        while(temp.next != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
    public Node find(double value){
        Node temp = this.head;
        while(temp.next != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        if(temp.value == value){
            return temp;
        }
        return null;
    }
    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }
    public void removeAt(int index){
        if(!isEmpty()){
            Node rear = this.head;
            int counter = 1;
            if(index == 0){
                this.head = this.head.next;
                rear.next = null;
            }
            Node front = this.head.next;
            while(front.next != null){
                if(index == counter){
                    rear = front.next;
                    front.next = null;
                    break;
                }
                rear = rear.next;
                front = front.next;
                counter++;
            }
        }
    }
}
