package Array_Package;

import java.sql.SQLOutput;
import java.util.Scanner;

public class D01_ARRAYMain {
    public static void main(String[] args) {
        int ch=-1;
        Scanner sc=new Scanner(System.in);
        D02_ArrayInfo aobj=new D02_ArrayInfo();
        int arr[]=null;
        do{
            System.out.println("Enter the choice \n1 for create \n2 for display \n3 for insert\n4 for delete \n5 for update");
            ch=sc.nextInt();
            if(ch==1)
            {

                 arr=aobj.createArray();
            }
            else if(ch==2)
            {
                aobj.display(arr);
            }
            else if(ch==3)
            {
                System.out.println("Enter the new element and its posiition to insert ");
                int num=sc.nextInt();
                int loc=sc.nextInt();
                aobj.insert(arr,num,loc);
                int n= aobj.getN()+1;
                aobj.setN(n);

            }
            else if(ch==4)
            {
                System.out.println("Enter the location of the item to delete the element");
                int loc=sc.nextInt();
                aobj.delete(arr,loc);
                int n= aobj.getN()-1;
                aobj.setN(n);
            }
            else if(ch==5)
            {
                System.out.println("Enter the location of the element and the new element to update ");
                int loc=sc.nextInt();
                int num=sc.nextInt();
                aobj.update(arr,loc,num);
            }

            System.out.println("To continue Press 1 ");
        }while (sc.next().equals("1"));
    }
}
