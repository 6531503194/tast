package pack1;

public class SLL
{
    private Node head=null;
    private Node tail=null;
    private int size=0;
   public void add(Node n)
   {
       if(size==0)
       {
           head=n;
           tail=n;
       }
       else if(size>0)
       {
          tail.next=n;
          tail=n;
       }
       size++;
   }
   public int getDataByIndex(int i)
   {
       Node n=this.head;
       int c=0;
       while(c<i)
       {
           n=n.next;
           c++;
       }
       return n.data;
   }
   public int getSize()
   {
      return size;
   }
   public Node getHead()
   {
       return this.head;
   }
   public Node getTail()
   {
       return this.tail;
   }


}
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}