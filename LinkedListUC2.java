public class LinkedListUC2
{
    public static void main(String[] args)
    {
         Linkedlist2 list = new Linkedlist2();
        list.push(70);
        list.push(30);
        list.push(56);
        list.display();
    }
}

class Node2
{
    int data;
    Node2 next;
      Node2(int data)
      {
        this.data = data;
      }
}


class Linkedlist2
{
    Node2 head;
    Node2 tail;

    public void add(int data)
    {
       Node2 newNode = new Node2(data);
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
        Node2 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public void push(int data)
    {
        Node2 newNode = new Node2(data);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }
}