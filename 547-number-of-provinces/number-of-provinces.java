class Solution {
    public int findCircleNum(int[][] isConnected) {
   int V=isConnected.length;
   boolean vis[]=new boolean[V];
     int noOfProvices=0;
    Queue<Integer> q=new LinkedList<>();
    List<Integer> bfs=new ArrayList<>();
    for(int i=0;i<V;i++)
    {
        if(!vis[i])
        {   
            noOfProvices++;
            vis[i]=true;
            q.add(i);
            bfs.add(i);
        }
        while(!q.isEmpty())
        {
            int n=q.poll();
            vis[n]=true;
            for(int j=0;j<V;j++)
            {
                if(isConnected[n][j]==1 && !vis[j])
                {
                    vis[j]=true;
                    q.add(j);
                    bfs.add(j);
                }
            }
        }
    }

return noOfProvices;

        
    }
}