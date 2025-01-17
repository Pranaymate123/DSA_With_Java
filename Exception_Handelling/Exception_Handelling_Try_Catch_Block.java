package Exception_Handelling;

import java.util.Scanner;

public class Exception_Handelling_Try_Catch_Block {
    public static void main(String[] args) {
//        System.out.println("Hello Guys ");
//        int[] arr=new int[5];
//        try
//        {
//            Integer k=null;
//            k.intValue();
//            int n=arr[15];
//            int num=5/0;
//        }
//        catch(ArithmeticException | IndexOutOfBoundsException | NullPointerException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("I always run no matter exception occurs or not");
//        }
//
//        System.out.println("Bye Guys");


        try {
            takeAge();
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }

    }

    public static void takeAge() throws InvalidAgeException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age=sc.nextInt();
        try{
            if(age>100 || age<=0)
            {
                throw new InvalidAgeException("The Age is Invalid");
            }
        }catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Bye Bye Guys...");
    }
}
