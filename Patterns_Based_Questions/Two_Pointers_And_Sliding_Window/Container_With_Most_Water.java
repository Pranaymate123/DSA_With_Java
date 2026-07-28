package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

public class Container_With_Most_Water {

    public static int maxArea(int[] height) {

        int n = height.length;
        int i=0;
        int j=n-1;
        int maxArea =0;
        while(i<j)
        {
            int h = Math.min(height[i],height[j]);
            int b = j-i;
            int area = h*b;

            maxArea=Math.max(area,maxArea);

            if(height[i] < height[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height ={1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}
