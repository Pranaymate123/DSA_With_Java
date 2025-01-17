package DAA;


import java.util.ArrayList;

import java.util.List;


class Item{
    int profit;
    int weight;

    public Item(int profit,int weight)
    {
        this.profit=profit;
        this.weight=weight;
    }

}
public class Fractional_Knapsack_Problem {

    public static double getMaximumProfit(int capacity, List<Item> itemList)
    {

        double totalProfit=0.0;
        itemList.sort((a,b)->(Double.compare((double) b.profit/b.weight,(double) a.profit/a.weight)));

        for(Item item:itemList)
        {
            //if weight of the item is less than capacity
            if(capacity>=item.weight)
            {
                capacity=capacity-item.weight;
                totalProfit=totalProfit+item.profit;
            }
            else
            {
                totalProfit=totalProfit+ ( ((double)capacity/item.weight)) * item.profit;
                break;
            }
        }
        return totalProfit;
    }


    public static void main(String[] args) {

        List<Item> itemList=new ArrayList<>();


        itemList.add(new Item(5,1));
        itemList.add(new Item(10,3));
        itemList.add(new Item(15,5));
        itemList.add(new Item(7,4));
        itemList.add(new Item(8,1));
        itemList.add(new Item(9,3));
        itemList.add(new Item(4,2));

        System.out.println("Maximum Profit Generated are : "+ getMaximumProfit(15,itemList));

    }
}
