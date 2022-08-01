class Solution {
    public void nextPermutation(int[] a) {
        int l=a.length;
        int i=l-2;
        while(i>=0 && a[i]>=a[i+1])
            i--;
        if(i>=0)
        {
            int j=a.length-1;
            while(j>=0 && a[j]<=a[i])j--;
            swap(a,i,j);
        }
        reverse(a,i+1);
        
	}
    public static void swap(int[] a,int f,int e)
    {
        int temp=a[f];
        a[f]=a[e];
        a[e]=temp;
    }
    public static void reverse(int[] a,int start)
    {
        int end=a.length-1;
        while(start<end)
        {
            swap(a,start,end);
            start++;
            end--;
        }
    }
    
}
