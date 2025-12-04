import java.lang.runtime.SwitchBootstraps;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //primitive datatypes
//        System.out.println("hello world");
//        byte age = 52;
//        int phone = 1234567891;
//        long number = 1213484314665454615L;
//        float pi = 3.14F;
//        char ch = 'a';
//        boolean isAdult = false;

        //nonprimitive datatypes

//        String name= "sujit";
//        System.out.println(name.length());


        //concatenation
//        String name1="Sujit ";
//        String name2="Mecwan";
//        String name3= name1+ name2;
//        System.out.println(name3);

        //charAt
//        String name="sujit";
//        System.out.println(name.charAt(2));


        //replace
//        String name="sujit";
//        String updatedname = name.replace('j', 'm');
//        System.out.println(updatedname);

        //substring
//        String name="sujit mecwan";
//        System.out.println(name.substring(0,5));

//        int[] marks = {59,77,89,51,52};
        //length
//        System.out.println(marks.length);

        //sort
//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

        //2d array
//        int [][] finalMarks={{59,89,56},{50,88,78}};
//
//        System.out.println(finalMarks[1][1]);


        //casting
        //double has 8bytes
//            double price=100.00;
//            double finalPrice=price+18.0;
        //int has 2 bytes
/*        int price=100;
        int finalPrice=price+(int)18.0;
        System.out.println(finalPrice);*/

        //constants

//        final float pi=3.14F;
//        System.out.println(pi);


        //oprators

        //arithmatic oprators
//        int a=10;
//        int b=5;
//        int c=a+b;
//        int c=a-b;
//        int c=a*b;
//        int c=a/b;
//        int c=a%b;
//        System.out.println(c);

//        increment and decrement operator

//        int a=5;
//        a++; postincrement
//        ++a; preincrement

//        a--; postdecrement
//        --a;predecrement

//        System.out.println(a);

        //maths class
//        System.out.println(Math.max(19,20));

        //random
//        System.out.println((int)(Math.random()*100));

        //how to take Input?
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Input age:");
        //for integer value
//        int age=sc.nextInt();
//        System.out.println(age);


        //string input

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Input name:");
//        String name=sc.nextLine();
//        System.out.println(name);


        //comparison operator
//        int a=5;
//        int b=10;
//        System.out.println(a<b);

        //condition
//
//        boolean isSunUp=true;
//        if(isSunUp==true) System.out.println("day");
//        else System.out.println("night");

//        int age=21;
//        if(age>18)
//            System.out.println("You can vote!");
//        else
//            System.out.println("You can not vote!");

//        Scanner sc = new Scanner(System.in);

//        int pen=10;
//        int noteBook=50;
//
//        int cash=sc.nextInt();
//
//        if(cash<10){
//            System.out.println("do not have enough cash");
//        }
//        else if(cash>10 && cash < 50){
//            System.out.println("you can buy only pen");
//        }
//        else{
//            System.out.println("you can buy anything");
//        }


        //witch statement

//        int day = 2 ;
//
//        switch (day) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//            default:
//                System.out.println("error");
//                break;
//        }

        //loops
        //0 to 4
//        int i;
//        for (i=0; i<5; i++){
//            System.out.println(i);
//        }
//    //4 to 0
//        for (i=4; i>=0; i--){
//            System.out.println(i);
//        }


        //do while
//        int number;
//
//        Scanner sc = new Scanner(System.in);
//
//        do{
//            System.out.print("Enter a number:");
//            number=sc.nextInt();
//            System.out.println("your number is:"+number);
//        }while(number>=0);
//        System.out.println("The End");

        //break and continue
//        int i=0;
//        while(true){
//            if(i==3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i=i+1;
//            if(i>=5){
//                break;
//            }
//        }

        //try and catch in exceptions handling

//        String[] arr = {"sujit", "mecwan"};
//        try {
//            System.out.println(arr[5]);
//        } catch (Exception e) {
//            //do somthing after catching
//        }
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);


    }
}