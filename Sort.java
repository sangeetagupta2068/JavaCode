/*
 *@Description: TThis is to understand the various sorting techniques for a one dimensional array using Java.
 *@author: Sangeeta Gupta
 *@date:1st March 2018
 *@version:1.2
 */

public class Sort {
    private int number[]={77,33,44,11,88,22,66,55};
    private int count1,count2,key;

    private void insertionSort(){

        for(count1=0;count1<number.length;count1++){
            key=number[count1];
            count2=count1;

            while ((count2>0) && key<(number[count2-1])){
                    number[count2]=number[count2-1];
                    count2=count2-1;
            }

            number[count2]=key;
        }
    }

    private void bubbleSort(){

        int temp;

        for(count1=0;count1<number.length;count1++){
            for(count2=0;count2<number.length-count1-1;count2++){
                if(number[count2]>number[count2+1]){
                    temp=number[count2];
                    number[count2]=number[count2+1];number[count2+1]=temp;
                }
            }
        }
    }

    private void selectionSort(){

        for(count1=0;count1<number.length-1;count1++){
            key=count1;
            count2=count1+1;

            while(count2<number.length-1){
                if(number[key]>number[count2]){

                    key=count2;

                }

                count2=count2+1;
            }

            number[count1]=number[key];
        }
    }

    private void display(){

        for (int element:number) {
            System.out.println(element);
        }

    }

    public static void main(String... args){

        Sort sort=new Sort();

        sort.insertionSort();
        System.out.println("Insertion sort: ");
        sort.display();

        sort.bubbleSort();
        System.out.println("Bubble sort: ");
        sort.display();

        sort.selectionSort();
        System.out.println("Selection sort: ");
        sort.display();

    }
}
