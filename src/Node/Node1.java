package Node;

//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            Node head = new Node( s.charAt(0) - '0' );
            Node tail = head;
            for(int i=1; i<s.length(); i++)
            {
                tail.next = new Node( s.charAt(i) - '0' );
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        }
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution
{
    public static Node addOne(Node head)
    {
        //code here.
        Node p = head;
        Node temp = head;Node prev = null; Node next = null;
        while(temp!=null){

            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;


        }

        while(prev.data+1>=10){
            prev.data = prev.data-10;
            prev.next.data+=1;
            prev = prev.next;
        }

        head = prev;

        Node temp1 = head;Node prev1 = null; Node next1 = null;
        while(temp1!=null){

            next1 = temp1.next;
            temp1.next = prev1;
            prev1 = temp1;
            temp1 = next1;


        }
        head = prev1;


        return head;

    }
}