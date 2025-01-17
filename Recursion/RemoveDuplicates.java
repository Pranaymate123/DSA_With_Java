package Recursion;

public class RemoveDuplicates {

    public static void removeDuplicates(String str,int idx,StringBuilder newStr, boolean map[])
    {
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true)
        {
            //duplicate
            removeDuplicates(str,idx+1,newStr,map);
        }
        else {
            //new character
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(str.charAt(idx)), map);


        }
    }

    public static void main(String[] args) {
        String str="appnnacollege";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}
