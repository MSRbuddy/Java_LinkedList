public class LinkedListUC6
{
    public static void main(String[] args)
    {
        Linkedlist6<Object> list = new Linkedlist6<Object>();
        list.add(56);
        list.add(30);
        list.add(70);
        list.display();
        list.pop(70);
        list.display();
    }
}

class Node6
{
    int data;
    Node6 next;
    Node6(int data)
    {
        this.data = data;
    }
}

class Linkedlist6<T>
{
    Node6 head;
    Node6 tail;

    public void add(int data)
    {
        Node6 newNode = new Node6(data);
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
//		Node6 newNode = new Node6(data);
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
        Node6 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

//	public void push(int data)
//	{
//        Node6 newNode = new Node6(data);
//        if (head == null){
//            head = newNode;
//            tail = newNode;
//        }
//        else
//        {
//            newNode.next = head;
//            head = newNode;
//        }
//    }

//	public void insertBetween( int data, int newNode)
//	{
//		Node6 newNode = new Node6(data);
//		if (head == null)
//		{
//			head = newNode;
//			tail = newNode;
//		Node tempNode = prevNode.next;
//		prevNode.next = newNode;
//		newNode.next = tempNode;
//	    }
// }

    public Object pop(int data)
    {
        if (head == null)
        {
            return null;
        }
        if (head.next == null)
        {
            return null;
        }
        Node6 temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;

        return head;
    }
}