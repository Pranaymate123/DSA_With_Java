package Accenture_Coding_Pyq;

public class Snake_Water_Gun {

    public static int getCountOfAWinnings(String str)
    {
        StringBuilder A=new StringBuilder();
        StringBuilder B=new StringBuilder();
        boolean flag=false;
        StringBuilder word=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            word.append(str.charAt(i));
            if(word.toString().equals("snake"))
            {
                if(flag) B.append('s');
                else A.append('s');
                word= new StringBuilder();
                flag=!flag;

            } else if (word.toString().equals("water")) {
                if(flag) B.append('w');
                else A.append('w');
                word= new StringBuilder();
                flag=!flag;
            } else if (word.toString().equals("gun")) {
                if(flag) B.append('g');
                else A.append('g');
                word= new StringBuilder();
                flag=!flag;
            }
        }

        System.out.println("A --> "+A);
        System.out.println("B --> "+B);
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            char ch1=A.charAt(i);
            char ch2=B.charAt(i);
            if(ch1=='s' && ch2=='w' || ch1=='w' && ch2=='g' || ch1=='g' && ch2=='s')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="snakewatergunwater";
        System.out.println(getCountOfAWinnings(str));

    }
}
