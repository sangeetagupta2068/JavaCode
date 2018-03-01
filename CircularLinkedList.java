
class CircularNode{

    public int data;
    public  CircularNode next;

    public CircularNode(int data){

        this.data = data;
        next = null;

    }

}


public class CircularLinkedList {

    CircularNode headNode,curNode,newNode;

    public CircularLinkedList(int data){

        headNode=new CircularNode(data);
        curNode=headNode;

    }

    public void insert(int data){

        newNode = new CircularNode(data);
        newNode.next = headNode;

        curNode.next = newNode;
        curNode = newNode;

    }

    public void delete(){

        newNode = headNode;

        while (newNode.next != curNode){

            newNode = newNode.next;

        }

        newNode.next = null;

        curNode = newNode;
        curNode.next = headNode;

        newNode = null;

    }

    public void display(){

        newNode = headNode;

        do{

            System.out.println(newNode.data);
            newNode = newNode.next;

        }while(newNode.next != headNode);

    }

    public static void main(String... args){

        CircularLinkedList circularLinkedList=new CircularLinkedList(5);

        circularLinkedList.insert(7);
        circularLinkedList.insert(8);
        circularLinkedList.insert(10);

        circularLinkedList.display();

        circularLinkedList.delete();
        circularLinkedList.display();

    }


}
