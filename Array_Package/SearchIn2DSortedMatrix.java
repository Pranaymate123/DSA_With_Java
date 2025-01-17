package Array_Package;

public class SearchIn2DSortedMatrix {


    public static  boolean search(int mat[][],int target)
    {
        int r=0;
        int c= mat[0].length-1;
        while (r<= mat.length-1 && c>=0)
        {
            if(target == mat[r][c])
            {
                return true;
            } else if (mat[r][c] > target) {
                c--;

            }else{
                r++;
            }
        }
        return  false;
    }

    public static void main(String[] args) {

    }
}
