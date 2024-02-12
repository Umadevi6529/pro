public class Array {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }

    }
    public static Array insert(Array list,int data)
    {
        Node new_node = new Node(data);
        if(list.head==null)
        {
            list.head=new_node;
        }
        else
        {
            Node last=list.head;
            while(last.next!=null)
                last=last.next;
            last.next=new_node;
            new_node.next=null;
        }
        return list;
    }
    public static Array front_insert(Array list,int s)
    {
        Node new_node = new Node(s);
        if(list.head==null)
        {
            list.head=new_node;
        }
        else
        {
            new_node.next=list.head;
            list.head=new_node;
        }
        return list;

    }
    public static void printlist(Array list)
    {
        Node temp=list.head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);

    } 
    public static void main(String args[])
    {
        Array list = new Array();
        list=insert(list,10);
        list=insert(list,20);
        list=insert(list,30);
        list=insert(list,40);
        list=front_insert(list,400);
        list=front_insert(list,500);
        list=front_insert(list,800);
        list=front_insert(list,900);
        list.printlist(list);
    }
}
