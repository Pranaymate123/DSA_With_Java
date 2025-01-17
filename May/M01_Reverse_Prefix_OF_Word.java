package May;

public class M01_Reverse_Prefix_OF_Word {
    public static String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)<0)
        {
            return word;
        }
        StringBuilder result=new StringBuilder("");
        int idx=word.indexOf(ch);
        for(int i=idx;i>=0;i--)
        {
            result.append(word.charAt(i));
        }
        for (int i=idx+1;i<word.length();i++)
        {
            result.append(word.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str="abcdefd";
        System.out.println(reversePrefix(str,'d'));

    }
}
