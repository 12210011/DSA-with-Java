import java.util.Scanner;
public class Implementation {
    //create structure of node 
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
//craate linked list data structure
    public static class linkedList {
        Node head = null;
        Node tail = null;
//method to insert element at the end of index
        void InsertAtEnt(int val) {
            Node temp = new Node(val);
            
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
//MEthod to Display All element from the linked list
        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
        }
    //MEthod to return size(length) of linked list;
        int size()
        {   int count=0;
            Node temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }
  //Method to insert element at the begining
        void insertAtBeg(int val)
        {
            Node temp=new Node(val);
            if(head==null)
            {
               head=temp;
               tail=temp;
            }
            else
            {
                
               temp.next=head;
                head=temp;
            }
        }
  //Method to insert at any index or b/w the node;
        void InsertBetween(int val,int loc)
        {   Node temp1=head;
            Node temp=new Node(val);
            int count=1;
            if(head==null)//if node not exist
            {
                head=temp;
                
            }else
            {
                while(temp1!=null)
                {   
                    if(loc==0)//if insert at 0 index
                    {
                        temp.next=head;
                        head=temp;
                        break;
                    }else
                    if(count==loc)//insert in b/w
                    {
                        temp.next=temp1.next;
                        temp1.next=temp;
                        break;
                    }
                    count++;
                    temp1=temp1.next;
                }
                System.out.println("Index out of bound!!");//if loaction will out of range 
            }
        }
    //Method to get Element of any postion
        void getElement(int postion)
        {   
            Node temp=head;
            int element=0;
            while(temp!=null)
            {
               if(element==postion)
               {
                 System.out.println("Element of "+postion+" is: "+temp.data);
                 return;
               }element++;temp=temp.next;
            }
           
        }
    //method to delete element
        void DeleteElement(int pos)
        {
            if(pos==0)
            {
                Node ptr=head;
                head=head.next;
            }
        }
    }
    public static void main(String args[]) {
        linkedList LL = new linkedList();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of Linked List: ");
        int n=Sc.nextInt(),count=1;
        while(n!=0)
        {
            System.out.println("Enter the value of "+count+" node: ");
            int val=Sc.nextInt();
            LL.InsertAtEnt(val);
           // LL.insertAtBeg(val);
            n--;count++;
        }
         //LL.InsertBetween(19,3);//passing value and location
         //LL.getElement(4);
        //LL.Display();
        //System.out.println("\n Length of linked List: "+LL.size());
        //LL.DeleteElement(0);
        //LL.Display();
        //System.out.println("\n Length of linked List: "+LL.size());
    }
}
