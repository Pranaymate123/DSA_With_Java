package Greedy;

import java.util.Arrays;
import java.util.Comparator;

class Item{

    int value;
    int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapSack {

   static   double fractionalKnapsack(int W, Item arr[], int n)
    {
        Arrays.sort(arr,(a,b)->(b.value*a.weight)-(a.value*b.weight));
        double res=0;

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i].value+ " " + arr[i].weight);
        }

        //going from maximum ratio for benefits (greedy)
        for(int i=0;i<n;i++){
            if(W>arr[i].weight){
                W-=arr[i].weight;
                res+=arr[i].value;
            }
            else{
                double a=(double)W / (double)arr[i].weight;
                double b=(double)arr[i].value*a;
                res+=b;
                return res;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Item arr[]=new Item[3];
        arr[0]=new Item(60,10);
        arr[1]=new Item(100,20);
        arr[2]=new Item(120,30);
        System.out.println( fractionalKnapsack(50,arr,3));

    }

}
