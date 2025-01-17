package Array_Package;

import java.util.Scanner;

public class D02_ArrayInfo {
    Scanner sc=null;
    private int n=0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public D02_ArrayInfo()
    {
        sc=new Scanner(System.in);
    }

    public int [] createArray()
    {
        System.out.println("Enter the Size of the array Max size is 15");
        n=sc.nextInt();
        int [] arr=new int[15];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public void display(int arr[])
    {
        System.out.println("Array Is ------->");
        for(int i=0;i<n;i++)
        {
            System.out.print("\t"+arr[i]);
        }
        System.out.println(" ");
    }

    public void insert(int arr[],int num,int loc)
    {
        for(int i=n-1;i>=loc-1;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[loc-1]=num;
    }

    public void delete(int arr[],int loc)
    {
        for(int i=loc-1;i<n-1;i++)
        {
           arr[i]=arr[i+1];
        }

    }

    public void update(int arr[],int loc,int num)
    {
        arr[loc-1]=num;
    }
}
