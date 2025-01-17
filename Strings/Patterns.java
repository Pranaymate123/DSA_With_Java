package Strings;

public class Patterns {

    static  void pattern2(int n){
        for(int i=1;i<=n;i++)
        {
            ///for every row run the column
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
    static  void pattern1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            ///for every row run the column
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*\t");
                }
                System.out.println("");
            }
        }

    }
    static void pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n)
    {
        for(int i=1;i<=n;i++ )
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println(" ");
        }
    }
    static  void pattern5(int n)
    {
        for(int i=1;i<(2*n);i++)
        {
            if(i>n) {
                for (int j = 1; j <= (n - (i - n)); j++) {
                    System.out.print("*\t");
                }
            }
            else
            {
                for (int j = 1; j <=i; j++) {
                    System.out.print("*\t");
                }

            }
            System.out.println("");
        }
    }

    static void pattern6(int n)
    {
        for(int i=0;i<2*n;i++)
        {
            int totalCol=i>n? 2*n-i:i;
            int nSpaces=n-totalCol;
            for(int j=0;j<nSpaces;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<totalCol;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static  void pattern30(int n)
    {
        for(int row=1;row<=2*n;row++)
        {
            int c=row>n?2*n-row:row;
            for(int space=0;space<n-c;space++)
            {
                System.out.print("  ");
            }

            for(int col=c;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            for(int col=2;col<=c;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static  void pattern31(int n)
    {
        int originalN=n;
        n=2*n;
        for(int row=0;row<=n;row++)
        {
            for(int col=0;col<=n;col++)
            {
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+"\t");
            }
            System.out.println();
        }
    }
    public static void hollowPattern(int n,int m)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || i==n ||j==1||j==m)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
    public static void InvertedHalfPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  static  void InvertedHalfPyramidOfNumbers(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+"  ");
            }
            System.out.println("");
        }
    }
    public static void FloydsTriangle(int n)
    {
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+"  ");
                num++;
            }
            System.out.println("");
        }
    }
    public static void Traingle_0_1(int n)
    {
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1 +" ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println("");
        }
    }
    public static void ButterflyPattern(int n)
    {
        //1st half
        for(int i=1;i<=n;i++)
        {
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        //second half
        for(int i=n;i>=0;i--)
        {
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();

        }


    }
    public  static void SolidRhomubus(int n)
    {
        for(int i=1;i<=n;i++)
        {
//            spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public  static void HollowRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
//            spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void DaimondPattern(int n)
    {
//        for 1st half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//        for 2nd half
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void NumberPyramid(int n)
    {

        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //nums
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }

            System.out.println();
        }

    }
    public static void PalindromPyramid(int n)
    {
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }


            System.out.println();
        }
    }


    public static void main(String[] args) {
    //        hollowPattern(10,12);
//        InvertedHalfPyramid(10);
//            InvertedHalfPyramidOfNumbers(5);
//            FloydsTriangle(5);
//            Traingle_0_1(5);
//        ButterflyPattern(5);
//        SolidRhomubus(10);
//        HollowRhombus(5);
//        DaimondPattern(10);
//            NumberPyramid(5);
            PalindromPyramid(5);
    }

}
