import java.util.Scanner;
class Node{
    int data;
    Node next;
}
public class sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head=null;
        Node tail=null;
        int n=4;
        while(n>0){
            int data = sc.nextInt();
            Node newNode = new Node();
            newNode.data=data;
            newNode.next=null;
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            n--;
        }
    }
}