package Java8_Features.Addition;

public class Main {
    public static void main(String[] args) {
        SumInterface sum1=(int a,int b)->{
            return a+b;
        };

        System.out.println(sum1.sum(4,5));

        SumInterface sum2=(a,b)->a+b;

        System.out.println("sum2 is : "+sum2.sum(4,9));



    }
}
