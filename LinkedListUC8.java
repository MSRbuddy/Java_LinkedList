public class LinkedListUC8
{
    public static void main(String[] args)
    {
        Linkedlist8<Object> list = new Linkedlist8<Object>();
        list.add(56);
        list.add(30);
        list.add(70);
        list.display();
        list.addAfter(30, 40);
        list.display();

    }
}

class Node8
{
    int data;
    Node8 next;

    Node8(int data)
    {
        this.data = data;
    }
}

class Linkedlist8<T>
{
    Node8 head;
    Node8 tail;

    public Linkedlist8 add(int data)
    {
        Node8 newNode = new Node8(data);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return null;
    }

//	public void addNodeAtFirst(int data)
//	{
//		Node8 newNode = new Node8(data);
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
        Node8 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    //	public void push(int data)
    //	{
    //	Node8 newNode = new Node8(data);
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
    public Node8 searchInsert(int value, Node8 newNode) {
        Node8 tempNode = head;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            while (tempNode != null) {
                if (tempNode.data == value) {
                    break;
                }
                tempNode = tempNode.next;
            }
            Node8 tempNodeNext = tempNode.next;
            tempNode.next = newNode;
            newNode.next = tempNodeNext;
        }
        return tempNode;
    }

    public Node8 addAfter(int prevNodeData, int data)
    {
        Linkedlist8 linklist = add(data);
        Node8 newNode = new Node8(40);
        Node8 prvNode = searchInsert(30, newNode);
        System.out.print("Newly Added data in List : ");
        return newNode;
    }
}

