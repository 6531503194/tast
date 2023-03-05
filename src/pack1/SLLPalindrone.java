package pack1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SLLPalindrone
{
    public static void main(String[] args)
    {
        SLL list = new SLL();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter how many numbers u want to input");
        int start = 1;
        int choice = scanner.nextInt();
        do// adding values to list
        {
            System.out.println("Please input value for node "+start);
            int value = scanner.nextInt();//ask element value
            Node n = new Node(value);//put in node
            list.add(n);//put that node in list
            start++;
        }while(start<=choice);
        int a=0,b=0;
        int secondstart=0;
        boolean isTrue=false;
        for(int i=0;i<list.getSize()/2;i++)
        {
           a= list.getDataByIndex(i);
           b=list.getDataByIndex(list.getSize()-i-1);
            if(a==b)
                isTrue=true;
            else
            {
                isTrue=false;
                break;
            }
        }
        if(isTrue)
        {
            System.out.println("This is palindrone");
        }
        else System.out.println("This is not a palindrone");
    }

}
