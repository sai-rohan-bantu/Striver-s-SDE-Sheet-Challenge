import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[arr.get(i)]>=1)
                return (arr.get(i));
            else a[arr.get(i)]++;       
        }
        return -1;
    }
}
