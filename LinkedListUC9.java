public class LinkedListUC9
{
    public static void main(String[] args)
    {
        Linkedlist9<Object> list = new Linkedlist9<Object>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        list.display();
        list.size();
        list.deleteANode(40);
        list.display();
        list.size();
    }
}

class Node9
{
    int data;
    Node9 next;

    Node9(int data)
    {
        this.data = data;
    }
}

class Linkedlist9<T> {

    Node9 head;
    Node9 tail;

    public Linkedlist9<?> add(int data) {
      Node9 newNode = new Node9(data);
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
        Node9 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }


    public Node9 searchInsert(int value, Node9 newNode) {
        Node9 tempNode = head;
        if(head == null) {
            System.out.println("List is Empty");
        }
        else {
            while(tempNode != null) {
                if(tempNode.data == value) {
                    break;
                }
                tempNode = tempNode.next;
            }
            Node9 tempNodeNext = tempNode.next;
            tempNode.next = newNode;
            newNode.next = tempNodeNext;
        }
        return tempNode;
    }

//	public Node9 search(int data) {
//		Node9 temp = head;
//		while (temp != null) {
//			if (temp.data == data) {
//				System.out.println(temp.data);
//			}
//			temp = temp.next;
//		}
//		return null;
//	}

    public void deleteANode(int value) {

        if(this.head == null) {
            System.out.println("Sorry no data !!!");
            return;
        }
        Node9 tempNode = head;
        while(tempNode.next.data != value) {
            tempNode = tempNode.next;
        }
        Node9 prvNode = tempNode;
        Node9 nextNode = tempNode.next.next;
        prvNode.next = nextNode;
    }

    public int size() {

        Node9 temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}