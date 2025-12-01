import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SortedSet;

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

        int[] marks = new int[5];

        marks[0] = 59;
        marks[1] = 77;
        marks[2] = 89;
        marks[3] = 51;
        marks[4] = 52;

        //length
//        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}