import java.util.Scanner;

import java.io.*;

public class Reading{
    
     public static void main(String[] args) throws Exception{


     	//1. scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age");
        String name = sc.next();
        int age = sc.nextInt();
        System.out.println("Name: " +name+"\nAge :"+age);

        //2. Bufferreader

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name and age");
        String n = br.readLine();
        int a = Integer.parseInt(br.readLine());
        System.out.println("Name: " +name+"\nAge :"+age);

        //3)

     }

}
