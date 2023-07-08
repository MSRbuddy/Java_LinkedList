public class LinkedListUC3
{
    public static void main(String[] args)
    {
        Linkedlist3 list = new Linkedlist3();
        list.add(56);
        list.addNodeAtFirst(30);
        list.addNodeAtFirst(70);
        list.display();
    }
}

class Node3
{
    int data;
    Node3 next;

    Node3(int data)
    {
        this.data = data;
    }
}

class Linkedlist3
{
    Node3 head;
    Node3 tail;

    public void add(int data)
    {
        Node3 newNode = new Node3(data);
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

    public void addNodeAtFirst(int data)
    {
        Node3 newNode = new Node3(data);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
            newNode.next = head;
        head = newNode;
    }

    public void display()
    {
        Node3 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
