/*
 *@Description: This code is used to understand the implementation of a Singly ended Linked List through Java.
 *@author: Sangeeta Gupta
 *@date:1st March 2018
 *@version:1.3
 */
class Node{

    public int data;
    public Node next;

    public Node(int data){

        this.data = data;
        next = null;

    }

}
public class LinkedList {

    private Node headNode,curNode,newNode;

    private LinkedList(int data){

        headNode = new Node(data);

        curNode = headNode;

    }

    private void insert(int data){

        newNode = new Node(data);

        curNode.next = newNode;
        curNode = newNode;

    }

    private void delete(){

        newNode = headNode;

        while (newNode.next != curNode){

            newNode = newNode.next;
        }

        curNode = newNode;
        curNode.next = null;
        newNode = null;

    }

    private void display(){

        newNode = headNode;

        while(newNode != null){

            System.out.println(newNode.data);
            newNode = newNode.next;

        }
    }


    public static void main(String... args){

        LinkedList linkedList = new LinkedList(2);

        linkedList.insert(12);
        linkedList.insert(13);

        linkedList.display();

        linkedList.delete();
        linkedList.display();

    }

}
