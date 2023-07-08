public class LinkedListUC7
{
    public static void main(String[] args)
    {
        Linkedlist7<Object> list = new Linkedlist7<Object>();
        list.add(56);
        list.add(30);
        list.add(70);
        list.add(30);
        list.add(20);
        list.add(30);
        list.display();
        list.search(30);
    }
}

class Node7
{
    int data;
    Node7 next;
    Node7(int data)
    {
        this.data = data;
    }
}

class Linkedlist7<T>
{
    Node7 head;
    Node7 tail;

    public void add(int data)
    {
        Node7 newNode = new Node7(data);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

//	public void addNodeAtFirst(int data)
//	{
//		Node7 newNode = new Node7(data);
//		if (head == null)
//		{
//			head = newNode;
//			tail = newNode;
//		}
//		else
//			newNode.next = head;
//		    head = newNode;
//	}

    public void display()
    {
        Node7 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

//	public void push(int data)
//	{
//        Node7 newNode = new Node7(data);
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

//	public void insertBetween( int data, int newNode
//	{
//		Node7 newNode = new Node7(data);
//		if (head == null)
//		{
//			head = newNode;
//			tail = newNode;
//		Node tempNode = prevNode.next;
//		prevNode.next = newNode;
//		newNode.next = tempNode;
//	}

//	public Object pop(int data)
//	{
//		if (head == null)
//		{
//			return null;
//		}
//		if (head.next == null)
//		{
//			return null;
//		}
//		Node7 temp = head;
//		while (temp.next.next != null)
//			temp = temp.next;
//		temp.next = null;
//		return head;
//	}

    public Node7 search(int data)
    {
        Node7 temp = head;
        while (temp != null)
        {
            if (temp.data == data)
            {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
        return temp;
    }
}

