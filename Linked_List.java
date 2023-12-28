import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class Linked_List {
    static Scanner X = new Scanner(System.in);
    public static void main(String[] args) {
        Node Head = new Node(1);
        Node Temp = Head;
        int i = 3;
        while(i > 0){
            System.out.print("Data: ");
            int data = X.nextInt();
            Head.next = new Node(data);
            Head = Head.next;
            i--;
        }
        Head = Temp;
        Node P = Head;
        System.out.println("Linked List Traversal: ");
        while(P!=null){
            System.out.print(P.data + " ");
            P = P.next;
        }
        //Linked List Reverse using Recursion
        System.out.println("\nReverse Linked List: ");
        Recursion(Head);
        //Inserting a Node and Printing Linked List again
        System.out.println("\n\nLinked List after Inserting: ");
        insert_a_node(Head);
        //Delete a Node and Printing Linked List again
        System.out.println("\n\nLinked List after Deleting: ");
        delete_a_node(Head);
    }
    static void insert_a_node(Node Head){
        System.out.println("Enter Data to be added to list: ");
        int data = X.nextInt();
        System.out.println("Enter the index to be inserted: ");
        int index = X.nextInt();
        Node to_be_added = new Node(data);
        Node temp=Head;
        int i=1;
        while(i != index-1){
            temp = temp.next;
            i++;
        }
        Node p = temp.next;
        temp.next = to_be_added;
        to_be_added.next = p;
        while(Head != null){
            System.out.print(Head.data + " ");
            Head = Head.next;
        }
    }
    static void delete_a_node(Node Head){
        System.out.println("Enter the index to be removed: ");
        int dnode = X.nextInt();
        Node temp=Head;
        int i = 1;
        while(i != dnode-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        while(Head!=null){
            System.out.print(Head.data + " ");
            Head=Head.next;
        }
    }
    static void Recursion(Node Head){
        if(Head.next==null){
            System.out.print(Head.data+ " ");
            return;
        }
        Recursion(Head.next);
        System.out.print(Head.data + " ");
    }
}
/*-----------------------------------------------------
 * Linked List Program For Creating,Inserting,Deleting|                                                 
 *-----------------------------------------------------
 */

 //Author Vijay Kumar Varma 