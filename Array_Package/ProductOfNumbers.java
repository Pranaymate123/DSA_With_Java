package Array_Package;

import java.util.ArrayList;
import java.util.List;

public class ProductOfNumbers {

    List<Integer> stream=new ArrayList<>();
//    List<Integer> productStream=new ArrayList<>();
    public ProductOfNumbers() {

    }

    public void add(int num) {
        if(num==0)
        {
            stream=new ArrayList<>();
        }
       else if(stream.size()==0)
       {
           stream.add(num);
       }
       else
       {
           stream.add(num * stream.get(stream.size()-1));
       }

    }

    public int getProduct(int k) {
        if(k>stream.size()) return 0;
        if(k==stream.size()) return stream.get(stream.size()-1);
        k=stream.size()-k-1;
       int totalProductIdx=stream.size()-1;

       if(stream.get(k)==0) return stream.get(totalProductIdx);
       return stream.get(totalProductIdx) / stream.get(k);

    }

    public static void main(String[] args) {

        ProductOfNumbers obj = new ProductOfNumbers();
         obj.add(5);
        int param_2 = obj.getProduct(2);
    }
}
