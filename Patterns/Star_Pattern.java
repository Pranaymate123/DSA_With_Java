package Patterns;

import Accenture_Coding_Pyq.Floyds_Pattern;

public class Star_Pattern {

    public static void rightAngledTranglePattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedRightAngledTranglePattern(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void HalfPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void InvertedHalfPyramidWithNumbers(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void CharacterPatternHalfPyramid(int n)
    {
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void HollowRectangle()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1 || i==4 )
                {
                    System.out.print("* ");
                }
                else if(j==1 || j==5)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedAndRotatedHalfPyramidPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void invertedHalfPyramidWithNumbers(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floydsPattern(int n)
    {
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n)
    {
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num + " ");
                num=num==1?0:1;
            }
            System.out.println();
        }
    }

//    public static void FullPyramidPattern(int n)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            if(i==1)
//            {
//                for(int j=1;j<=n-1;j++)
//                {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            else
//            {
//                for(int j=1;j<=n-i;j++)
//                {
//                    System.out.print("  ");
//                }
//                for(int j=1;j<=i-1;j++)
//                {
//                    System.out.print("* ");
//                }
//                System.out.print("* ");
//
//                for(int j=1;j<=i-1;j++)
//                {
//                    System.out.print("* ");
//                }
//
//
//            }
//            System.out.println();
//        }
//    }

    private static void FullPyramidPattern(int n) {

        //outer loop
        for(int i=1;i<=n;i++)
        {
            //for spaces
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            //starts
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void InvertedFullPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i+1;j<n;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(n-i+1)*2-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void NumberPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pascalTriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            int num=1;
            //spaces
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }

//            /numbers
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();


        }


    }

    public static void main(String[] args) {

//        rightAngledTranglePattern(5);
//        invertedRightAngledTranglePattern(5);

//        HalfPyramid(4);
//        CharacterPatternHalfPyramid(4);
//        HollowRectangle();
//        InvertedHalfPyramidWithNumbers(5);
//        invertedAndRotatedHalfPyramidPattern(5);
//            invertedHalfPyramidWithNumbers(5);
//            floydsPattern(5);
//
////        zeroOneTriangle(5);
//        FullPyramidPattern(4);
//        InvertedFullPyramid(4);

//        NumberPyramid(5);
        pascalTriangle(5);

    }



}
