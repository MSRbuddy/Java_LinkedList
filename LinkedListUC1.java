public class LinkedListUC1
{
    public static void main(String[] args)
    {
        Linkedlist1 list = new Linkedlist1();
        list.add(56);
        list.add(30);
        list.add(70);
        list.display();
    }
}

class Node1
{
    int data;
    Node1 next;

    Node1(int data)
    {
        this.data = data;
    }
}

class Linkedlist1 {
    Node1 head;
    Node1 tail;

    void add(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}