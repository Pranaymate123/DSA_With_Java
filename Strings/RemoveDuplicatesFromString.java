package Strings;

import java.util.HashSet;

public class RemoveDuplicatesFromString {

    public static String removeDuplicatesFromString(String str){
        StringBuilder sb=new StringBuilder("");
        HashSet<Character> hashSet=new HashSet<>();
         char strArray[]=str.toCharArray();
         for(int i=0;i<strArray.length;i++)
         {
             if(!hashSet.contains(strArray[i]))
             {
                 sb.append(strArray[i]);
             }
             hashSet.add(strArray[i]);
         }
         return sb.toString();
    }

    public static void main(String[] args) {
        String str="geEksforGEeks";
        System.out.println(removeDuplicatesFromString(str));
        //geEksforG
    }
}
