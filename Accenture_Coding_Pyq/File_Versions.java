package Accenture_Coding_Pyq;

public class File_Versions {

    public static int getLatestVersion(String [] strs)
    {
        int latest=0;
        for(String s:strs)
        {
            latest=Math.max(getVersionNumber(s),latest);
        }
        if(latest==0) return -1;
        return latest;
    }
    public static int getVersionNumber(String s)
    {
        if(s.length()<=5) return -1;
        String t="File_";
        for(int i=0;i<5;i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                return -1;
            }
        }
        StringBuilder version=new StringBuilder();
        for(int i=5;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                version.append(ch);
            }else
            {
                return -1;
            }
        }
        return Integer.parseInt(version.toString());
    }

    public static void main(String[] args) {
        String[] strs={"File_3","File_6","Fil","File_10"};
        System.out.println(getLatestVersion(strs));
    }
}
