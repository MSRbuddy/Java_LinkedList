public class LinkedListUC5
{
    public static void main(String[] args)
    {
        Linkedlist5 list = new Linkedlist5();
        list.add(56);
        list.add(30);
        list.add(70);
        list.display();
        list.pop(56);
        list.display();

    }
}

class Node5
{
    int data;
    Node5 next;

    Node5(int data)
    {
        this.data = data;
    }
}

class Linkedlist5
{
    Node5 head;
    Node5 tail;

    public void add(int data)
    {
        Node5 newNode = new Node5(data);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

//	public void addNodeAtFirst(int data)
//	{
//		Node5 newNode = new Node5(data);
//		if (head == null)
//		{
//			head = newNode;
//			tail = newNode;
//		} else
//			newNode.next = head;
//		    head = newNode;
//	}

    public void display()
    {
        Node5 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    //	public void push(int data)
    //	{
//        Node5 newNode = new Node5(data);
//        if (head == null)
//        {
//            head = newNode;
//            tail = newNode;
//        }
//        else
//        {
//            newNode.next = head;
//            head = newNode;
//        }
//    }
    public void pop(int data)
    {
        this.head = this.head.next;
    }
}
