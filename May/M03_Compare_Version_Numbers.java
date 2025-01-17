package May;

import java.util.Arrays;

public class M03_Compare_Version_Numbers {

    public static int compareVersion(String version1, String version2) {
        int i=0,j=0;
        int v1len=version1.length();
        int v2len=version2.length();
        int n1,n2;
        while (i<v1len || j<v2len)
        {
            n1=0;
            n2=0;
            while (i<v1len && version1.charAt(i)!='.')
            {
                n1=n1*10 +(version1.charAt(i)-'0');
                i++;
            }
            while (j<v2len && version2.charAt(j)!='.')
            {
                n2=n2*10 +(version2.charAt(j)-'0');
                j++;
            }
            if(n1>n2){
                return 1;
            }
            else if (n1<n2) {
                return -1;
            }
            i++;
            j++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String version1="1.01.002";
        String version2="1.0001";
//        System.out.println(Arrays.toString(version1.split(".")));

        System.out.println(compareVersion(version1,version2));
    }
}
