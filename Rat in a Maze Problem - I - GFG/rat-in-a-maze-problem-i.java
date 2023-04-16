//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends

class Solution {
        public static void solve(int i,int j,int[][]m,int n,ArrayList<String>ans,String s,int [][]visited){
            if(i==n-1 && j==n-1){
                ans.add(s);
                return;
            }
            if(i+1<n && m[i+1][j]==1 && visited[i+1][j]==0){
                visited[i][j]=1;
                solve(i+1,j,m,n,ans,s+"D",visited);
                visited[i][j]=0;
            }
            if (j-1>=0 && m[i][j-1]==1 && visited[i][j-1]==0){
                visited[i][j]=1;
                solve(i,j-1,m,n,ans,s+"L",visited);
                visited[i][j]=0;
            }

            if (j+1<n && m[i][j+1]==1 && visited[i][j+1]==0){
                visited[i][j]=1;
                solve(i,j+1,m,n,ans,s+"R",visited);
                visited[i][j]=0;
            }
            if(i-1>=0 && m[i-1][j]==1 && visited[i-1][j]==0){
                visited[i][j]=1;
                solve(i-1,j,m,n,ans,s+"U",visited);
                visited[i][j]=0;
            }
            else{
                return;
            }
            




        }
        public static ArrayList<String> findPath(int[][] m, int n) {
            ArrayList<String>ans=new ArrayList<>();
            String s="";
            int i=0;int j=0;
            int [][]visited=new int[n][n];
            if(m[0][0]!=0){
              solve(i,j,m,n,ans,s,visited);
            }
            
            else{
                ans.add("-1");
            }
            if(ans.size()==0){
                ans.add("-1");
            }
            
            return ans;
        }
    }
       
    
