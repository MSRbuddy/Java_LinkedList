public class LinkedListUC10
{
    public static void main(String[] args) {

        Linkedlist<Object> list = new Linkedlist<Object>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        list.display();
        list.sortList();
        list.display();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Linkedlist<T> {
    Node head;
    Node tail;

    public Linkedlist<?> add(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return null;
    }

    public void display() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public Node searchInsert(int value, Node newNode) {
        Node tempNode = head;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            while (tempNode != null) {
                if (tempNode.data == value) {
                    break;
                }
                tempNode = tempNode.next;
            }
            Node tempNodeNext = tempNode.next;
            tempNode.next = newNode;
            newNode.next = tempNodeNext;
        }
        return tempNode;
    }

//	public Node search(int data) {
//
//		Node temp = head;
//		while (temp != null) {
//			if (temp.data == data) {
//				System.out.println(temp.data);
//			}
//			temp = temp.next;
//		}
//		return null;
//	}

    public void deleteANode(int value) {

        if (this.head == null) {
            System.out.println("Sorry no data !!!");
            return;
        }
        Node tempNode = head;
        while (tempNode.next.data != value) {
            tempNode = tempNode.next;
        }
        Node prvNode = tempNode;
        Node nextNode = tempNode.next.next;
        prvNode.next = nextNode;
    }

    public int size() {

        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void sortList() {

        Node current = head;
        Node index = null;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        int temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
}