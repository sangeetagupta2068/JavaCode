/*
 *@Description: This code is used to understand the implementation of Stack Data Structure.
 *@author: Sangeeta Gupta
 *@date:5th February 2018
 *@version:1.0
 */
import java.util.Scanner;
import java.util.InputMismatchException;

      class Stack{

            String[] stackList;
            int top;
            Scanner scanner;

            public Stack(){

                this.stackList=new String[10];
                this.top=-1;
                this.scanner=new Scanner(System.in);

              }

            public int menu() throws InputMismatchException{

                int choice;

                System.out.println("------Menu------");
                System.out.println("1.Add element");
                System.out.println("2.Remove element");
                System.out.println("3.Check the last element");
                System.out.println("----------------");

                System.out.println("Enter your choice: ");
                choice=scanner.nextInt();

                return choice;

            }

            public void push(String data){

                boolean flag=true;

                do{

                    try{

                        top=top+1;
                        stackList[top]=data;

                        System.out.println("Item added at: " + top);

                        flag=false;

                      }//try ends

                    catch(Exception overflow){

                        String answer;

                        System.out.println("Exception: Stack Overflow occured!");

                        System.out.println("Do you want to remove an element from stack?(yes/no)");
                        answer=scanner.next();

                        if(answer.equalsIgnoreCase("no")){

                            System.out.println("Okay!");

                            flag=false;
                        }

                        else if(answer.equalsIgnoreCase("yes")){

                            String elementRemove;
                            elementRemove=pop();

                            System.out.println("Element popped: " + elementRemove);

                        }

                        }//catch ends

                  }while(flag);

            }//push ends

            public String pop(){

                  String data="";

                  try{

                      data=stackList[top];
                      top=top-1;

                      }//try ends

                  catch(Exception underflow){

                      String answer;

                      System.out.println("Exception: Stack Underflow occured!");

                      System.out.println("Do you want to add an element to stack?(yes/no)");
                      answer=scanner.next();

                      if(answer.equalsIgnoreCase("no")){

                        System.out.println("Okay!");

                      }

                      else if(answer.equalsIgnoreCase("yes")){

                        String elementAdd;

                        System.out.println("Enter the element to be added: ");
                        elementAdd=scanner.next();

                        push(elementAdd);

                        pop();

                    }

                  }//catch ends

                  return data;

            }//pop ends

            public void peek(){

                if(top>-1){

                    System.out.println("Current element at top: " + stackList[top]);

                 }

                else{

                    System.out.println("Empty stack!");

                }

           }//peek ends

      }//class Stack ends

      class Client{

           public static void main(String... args){

                Stack stack=new Stack();
                Client client=new Client();
                int var=0;
                String data="";
                boolean flag=true;
                Scanner scanner=new Scanner(System.in);
                String answer;


                do{
                    try{
                          var=stack.menu();
                          switch(var){

                                case 1: System.out.println("Enter the element to be pushed!");
                                        data=scanner.next();
                                        stack.push(data);
                                        break;

                                case 2:System.out.println("Element popped: " + stack.pop());
                                        break;

                                case 3: stack.peek();
                                        break;

                                default: System.out.println("Invalid choice!");
                                         break;

                          }
                    }//try ends

                    catch(Exception misMatch){

                          System.out.println("Exception occured!" + misMatch.getMessage());

                    }//catch ends

                    System.out.println("Do you want to try again?");
                    answer=scanner.next();
                    if(answer.equalsIgnoreCase("yes"))
                          flag=true;
                    else
                          flag=false;

                }while(flag);

          }//main ends

      }//class Client ends
