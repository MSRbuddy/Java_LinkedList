public class LinkedListUC4
{
    public static void main(String[] args)
    {
         Linkedlist4<Object> list = new Linkedlist4<Object>();
        list.add(70);
        list.add(56);
        list.display();
        list.pop(70);
        list.add(30);
        list.add(70);
        list.display();
    }
}

class Node4
{
    int data;
    Node4 next;

    Node4(int data)
    {
        this.data = data;
    }
}

class Linkedlist4<T>
{
    Node4 head;
    Node4 tail;

    public void add(int data)
    {
        Node4 newNode = new Node4(data);
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

    public void display()
    {
        Node4 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

//	public void insertBetween( int data, int newNode) {
//		Node newNode = new Node(data);
//		if (head == null) {
//			head = newNode;
//			tail = newNode;
//		Node tempNode = prevNode.next;
//		prevNode.next = newNode;
//		newNode.next = tempNode;
//	}

//		 public void insertAfter(int prev_node, int new_data) {
//			    if (prev_node == null) {
//			      System.out.println("The given previous node cannot be null");
//			      return;
//			    }
//			    Node new_node = new Node(new_data);
//			    new_node.next = prev_node.next;
//			    prev_node.next = new_node;
//			  }

    public void pop(int data)
    {
        this.head = this.head.next;
    }

}

