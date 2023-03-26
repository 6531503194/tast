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
    public  Node getPrev(Node head,Node n)
    {
        Node j=null;
        for(Node h=head;h!=n;h=h.next)
        {
            j=h;
        }
        return j;
    }
    public Node getLast(Node head)
    {
        Node last=null;
        for(Node h=head;h!=null;h=h.next)
        {
            last=h;
        }
        return last;
    }
    public void theRealAddOne(Node head, Node last)
    {
        last.data+=1;
        if(last.data>=10)
        {
            last.data%=10;
            if(last==head)
                return;
            else
                theRealAddOne(head,getPrev(head,last));
        }
    }


    public  Node addOne(Node head)
    {
        //code here.
        Node last=getLast(head);
        this.theRealAddOne(head,last);
        return head;

    }
}
//Enter the first num which will be neglected
//Enter the number again to add one