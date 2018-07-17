package com.sdmag.iiuc.com;

import java.util.Scanner;

public class Main {
   private static Scanner scannerObj; // scannerObj is a global object
    public static void main(String[] args) {
        scannerObj = new Scanner(System.in);    // initializing scannerObj

//        <<---uncomment ifElseExample() to run ifElseExample()--->>
//        ifElseExample();

//        <<---uncomment switchExample() to run switchExample()--->>
//        switchExample();

//        <<---uncomment forLoopExample() to run forLoopExample()--->>
//        forLoopExample();

//        <<---uncomment forEachLoopExample() to run forEachLoopExample()--->>
//        forEachLoopExample();

//        <<---uncomment whileExample() to run whileExample()--->>
//        whileExample();

    }


    private static void ifElseExample(){

        System.out.println("if-else Example ");
        System.out.println("Student Grading system");
        System.out.println("------------------------");
        System.out.print("Enter Student's score: ");
        int mark = scannerObj.nextInt();
        if(mark >=0 && mark <= 100){
            if (mark < 40){
                System.out.println("Failed");
            }
            else if (mark < 50){
                System.out.println("D");
            }
            else if (mark < 60){
                System.out.println("C");
            }
            else if (mark < 70){
                System.out.println("B");
            }
            else if (mark < 80){
                System.out.println("A");
            }
            else{
                System.out.println("A+");
            }
        }else{
            System.out.println("Wrong Input");
        }

    }
    private static void switchExample(){
        System.out.println("switch Example ");
        System.out.println("Student Grading system");
        System.out.println("------------------------");
        System.out.print("Enter Student's score: ");
        int mark = scannerObj.nextInt();

        switch (mark/10){
            case 0:
            case 1:
            case 2:
            case 3: System.out.println("Failed"); break;
            case 4: System.out.println("D"); break;
            case 5: System.out.println("C"); break;
            case 6: System.out.println("B"); break;
            case 7: System.out.println("A"); break;
            case 8:
            case 9:
            case 10: System.out.println("A"); break;
            default: System.out.println("Wrong Input"); break;
        }
    }
    private static void forLoopExample(){
        System.out.println("For loop Example ");
        System.out.println("------------------------");
        System.out.print("Enter number of loops: ");
        int loopCount = scannerObj.nextInt();

        for(int i = 0; i < loopCount; i++ ){
            System.out.print("loop count: "+i);

        }
    }
    private static void forEachLoopExample(){
        System.out.println("For Each Loop Example ");
        System.out.println("------------------------");
        System.out.println("Enter array size: ");

        int arraySize = scannerObj.nextInt();
        String[] names = new String[arraySize];

        for(int i = 0; i < names.length; i++ ){

            System.out.print("0"+i+". Enter new name: ");
            names[i] = scannerObj.next();

        }

        for (String name: names) {
            System.out.print(name+" ");
        }

    }
    private static void whileExample(){
        System.out.println("while loop Example ");
        System.out.println("------------------------");
        System.out.print("Enter number of loops: ");

        int loopCount = scannerObj.nextInt();
        int i = 0;
        while (i < loopCount){
            System.out.print("loop count: "+i);
            i++;
        }
    }


}