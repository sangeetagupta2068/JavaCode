/*
 *@Description: This code is used to understand the implementation of Doubly ended Linked List through Java. Doubly ended Linked List 
                is a linear linked list wherein every node is linked with the previous and the next node.
 *@author: Sangeeta Gupta
 *@date:1st March 2018
 *@version:1.3
 */

class DoubleEndedNode{

    public int data;
    public  DoubleEndedNode next;
    public DoubleEndedNode previous;

    public DoubleEndedNode(int data){

        this.data = data;
        next = null;
        previous=null;

    }

}

public class DoublyEndedLinkedList{

    DoubleEndedNode headNode,curNode,newNode;

    public DoublyEndedLinkedList(int data){

        headNode = new DoubleEndedNode(data);

        curNode = headNode;

    }

    public void insert(int data){

        newNode = new DoubleEndedNode(data);
        newNode.previous = curNode;

        curNode.next = newNode;
        curNode = newNode;

    }

    public void delete(){

        curNode = curNode.previous;
        curNode.next = null;

    }

    public void display(){

        newNode = headNode;

        while(newNode.next != null){

            System.out.println(newNode.data);
            newNode = newNode.next;

        }

    }

    public static void main(String... args){

        DoublyEndedLinkedList doublyEndedLinkedList=new DoublyEndedLinkedList(4);

        doublyEndedLinkedList.insert(15);
        doublyEndedLinkedList.insert(16);
        doublyEndedLinkedList.insert(17);

        doublyEndedLinkedList.display();

        doublyEndedLinkedList.delete();
        doublyEndedLinkedList.display();

    }
}
