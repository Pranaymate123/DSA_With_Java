package Backtracking_CodeStoryWithMik;

import java.util.*;

public class Letter_Tile_Possibilties {


    List<String> resultList=new ArrayList<>();

    public int numTilePossibilities(String tiles) {
        boolean[] taken=new boolean[tiles.length()+1];
        Arrays.fill(taken,false);
        Set<String> set=new HashSet<>();

        solve(tiles,new StringBuilder(""),taken,set);

        return set.size()-1;
    }

    public  void solve(String tiles,StringBuilder curr,boolean[] taken,Set<String> set)
    {
        set.add(curr.toString());


        for(int i=0;i<tiles.length();i++)
        {

            if(taken[i]) continue;
            //Take
            char ch=tiles.charAt(i);
            taken[i]=true;
            curr.append(ch);
            //not take
            solve(tiles,curr,taken,set);
            taken[i]=false;
            curr.deleteCharAt(curr.length()-1);
        }
        resultList.add(curr.toString());
    }
    public static void main(String[] args) {

        Letter_Tile_Possibilties obj=new Letter_Tile_Possibilties();

        System.out.println(obj.numTilePossibilities("AAB"));

        System.out.println(obj.resultList);
    }
}
