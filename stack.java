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

            public void menu(){

                int var=0;
                String data="";
                boolean flag=true;
                Scanner scanner=new Scanner(System.in);
                String answer;

                do{
                    try{

                            int choice;

                            System.out.println("------Menu------");
                            System.out.println("1.Add element");
                            System.out.println("2.Remove element");
                            System.out.println("3.Check the last element");
                            System.out.println("----------------");

                            System.out.println("Enter your choice: ");
                            choice=scanner.nextInt();

                            switch(choice){

                                  case 1: System.out.println("Enter the element to be pushed!");
                                          data=scanner.next();
                                          push(data);
                                          break;

                                  case 2:System.out.println("Element popped: " + pop());
                                          break;

                                  case 3: peek();
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

                 System.out.println("Okay!Thanks you!");

            }//menu ends

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

                            System.out.println("Okay! Thank you!");

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

                        System.out.println("Okay! Thank you!");

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

          String name;
          static Stack stack;

          Client(String name){

                this.name=name;
                stack=new Stack();
                System.out.println("Welcome " + this.name + "!");
          }

           public static void main(String... args){

                Client client=new Client("Sangeeta");
                stack.menu();

          }//main ends

      }//class Client ends
