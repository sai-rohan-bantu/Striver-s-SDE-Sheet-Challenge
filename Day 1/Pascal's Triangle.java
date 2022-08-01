import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
          ArrayList<ArrayList<Long>> ans=new ArrayList();
          if(n==0) return ans;
          
          for(int i=1;i<=n;i++)
          {
               ArrayList<Long> ds=new ArrayList<>();
              for(int j=0;j<i;j++)
              {
                  if(j==0 || j==i-1)
                      ds.add(1L);
                  else
                  {
                      ds.add(ans.get(i-2).get(j)+ans.get(i-2).get(j-1));
                  }
              }
              ans.add(ds);
          }
        return ans;
	}
}

