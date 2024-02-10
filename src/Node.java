public class Node {
    char data;
    int frequency;
    Node next,left,right;

    public Node(char data,int frequency){
        this.data = data;
        this.frequency = frequency;
        this.next = this.left = this.right = null;
    }
}
