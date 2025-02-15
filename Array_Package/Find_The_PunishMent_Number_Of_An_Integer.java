package Array_Package;

public class Find_The_PunishMent_Number_Of_An_Integer {

    public int punishmentNumber(int n) {

        return 0;
    }

    public static boolean check(int num , int sum,String str,int idx)
    {
        if(idx>=str.length()) return false;

        if(sum==num)
        {
            System.out.println("Sum is "+ sum);
            return true;
        }

        for(int i=idx;i<str.length();i++)
        {

            int temp=Integer.parseInt(str.substring(idx,i+1));
             sum=sum+temp;
             if(sum<=num)
             {
                 if(check(num,sum,str,i+1))
                 {
                     return true;
                 }

             }
            sum=sum-temp;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(check(36,0,"1296",0));

        String str="1296";

//        System.out.println(str.substring(0,1));

    }
}
