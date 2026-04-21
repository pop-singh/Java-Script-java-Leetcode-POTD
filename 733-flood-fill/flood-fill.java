class Solution {
   
   void dfs(int[][]image , int sr,int sc,int color,int iniColor,int[][] res,int n,int m)
   {
        if(sr<0||sc<0||sr>=n||sc>=m|| image[sr][sc]!=iniColor ||res[sr][sc]==color)
            return;
         
         res[sr][sc]=color;
         dfs(image,sr+1,sc,color,iniColor,res,n,m); 
          dfs(image,sr-1,sc,color,iniColor,res,n,m);  
           dfs(image,sr,sc+1,color,iniColor,res,n,m);
            dfs(image,sr,sc-1,color,iniColor,res,n,m);


   }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int [][] res=image;
        int iniColor=image[sr][sc];
        int n=image.length;
        int m=image[0].length;


        dfs(image,sr,sc,color,iniColor,res,n,m);



        return res;
    }
}