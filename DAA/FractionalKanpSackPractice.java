package DAA;

import java.util.ArrayList;
import java.util.List;

public class FractionalKanpSackPractice {

    public static double getMaximumProfit(int capacity, List<Item> itemList)
    {

        //sort a/c to p/w
        itemList.sort((a,b)->Double.compare((double) b.profit/b.weight, (double) a.profit/a.weight));

        double totalProfit=0.0;
        for(Item item:itemList)
        {
            if(capacity>=item.weight)
            {
                capacity=capacity- item.weight;
                totalProfit+=item.profit;
            }
            else
            {
                totalProfit+=( (double) capacity/item.weight )  * item.profit;
                break;
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        List<Item> itemList=new ArrayList<>();


        itemList.add(new Item(60,10));
        itemList.add(new Item(100,20));
        itemList.add(new Item(120,30));


        System.out.println("Maximum Profit Generated are : "+ getMaximumProfit(50,itemList));
    }
}
