public class SortedLinkedlist {
    Node head;

    public void insert(char data,int frequency){
        Node newNode = new Node(data, frequency);
        if(head == null){
            head = newNode;
        }
        else if(head.frequency>frequency){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next!= null && current.next.frequency<=frequency){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void display(){
        Node current = head;
        while(current!= null){
            System.out.println(current.data + " : "+current.frequency);
            current = current.next;
        }
    }

    Node[] linkedlistToArray() {
        Node[] nodesArray = new Node[getSize()];
        Node current = head;
        int index = 0;
        while (current != null) {
            nodesArray[index++] = new Node(current.data, current.frequency);
            current = current.next;
        }
        return nodesArray;
    }
    int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}
