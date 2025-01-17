package Revision.Array;

import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Address {

    public static List<String> helper(int n,String s,int idx,int parts,StringBuilder curr,List<String> result)
    {
        if(idx>=s.length() && parts==4)
        {
            curr.deleteCharAt(s.length());
            result.add(curr.toString());
            System.out.println(curr);
            return result;
        }

        if((idx+1)<=n)
        {
            System.out.println("First Condition called");
            return helper(n,s,idx+1,parts+1,curr.append(s,idx,idx+1).append("."),result);
        }

        if((idx+2)<=n && isValid(curr.append(s,idx,idx+2)))
        {
            System.out.println("Second Condition called");
            return  helper(n,s,idx+2,parts+1,curr.append(s,idx,idx+2).append("."),result);
        }

        if((idx+3)<=n && isValid(curr.append(s,idx,idx+3)))
        {
            System.out.println("Third Condition called");
            return helper(n,s,idx+3,parts+1,curr.append(s,idx,idx+3).append("."),result);
        }

        return result;
    }

    public static boolean isValid(StringBuilder curr)
    {
        if(curr.charAt(0)=='0')
        {
            return false;
        }
        return Integer.parseInt(curr.toString()) <= 255;
    }
    public static List<String> restoreIpAddresses(String s) {
        StringBuilder curr=new StringBuilder();
        List<String> result=new ArrayList<>();
        helper(s.length(),s,0,0,curr,result);
        return result;
    }

    public static void main(String[] args) {
        String str="25525511135";
        System.out.println(restoreIpAddresses(str));

    }
}
