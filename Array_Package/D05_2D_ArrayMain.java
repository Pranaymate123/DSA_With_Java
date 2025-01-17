package Array_Package;

import java.util.Scanner;

// Matrix Operation
public class D05_2D_ArrayMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=-1;
        int m1=0,n1=0,m2=0,n2=0;
        D05_2D_Array aobj=new D05_2D_Array();
        int mat1[][]=new int[8][8];
        int mat2[][]=new int[8][8];
        do {
            System.out.println("Enter the choice \n1 create\n2 for display\n3 Addition \n4 For Substraction\n5 For Multiplication");
            ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter the number of rows and columns for mat1");
                m1=sc.nextInt();
                 n1=sc.nextInt();
                System.out.println("Enter the number of rows and columns for mat2");
                 m2=sc.nextInt();
                 n2=sc.nextInt();
                System.out.println("Enter the entries for matrix 1");
                mat1=aobj.createMatrix1(mat1,m1,n1);
                System.out.println("Enter the entries for matrix 2");
                mat2=aobj.createMatrix1(mat2,m2,n2);

            }
            else if(ch==2)
            {
                System.out.println("First Matrix Is ---->");
                aobj.displayMatrix(mat1,m1,n1);
                System.out.println("Second Matrix Is ---->");
                aobj.displayMatrix(mat2,m2,n2);
            }
            else if (ch==3) {
                int result[][]=aobj.addition(mat1,mat2,m1,n1,m2,n2);
               if(result!=null)
               {
                   System.out.println("Addtion Is -->");
                   aobj.displayMatrix(result,m1,n1);
               }

            }
            else if(ch==4)
            {
                int result[][]=aobj.substraction(mat1,mat2,m1,n1,m2,n2);
                if(result!=null)
                {
                    System.out.println("Substarction  Is -->");
                    aobj.displayMatrix(result,m1,n1);
                }


            }
            else if(ch==5)
            {
                int result[][]=aobj.multiplication(mat1,mat2,m1,n1,m2,n2);
                if(result!=null)
                {
                    System.out.println("Multiplication  Is -->");
                    aobj.displayMatrix(result,m1,n2);
                }


            }
            else if(ch==6)
            {
                System.out.println("Transport Of Matrix 1 ");
            }

            System.out.println("To continue Press 1 ");
        }while ((sc.next().equals("1")));

    }

}
