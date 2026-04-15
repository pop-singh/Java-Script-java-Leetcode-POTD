class Solution {
    public int closestTarget(String[] words, String target, int si) {

       int  dis=Integer.MAX_VALUE;
        int n=words.length;

        for(int i=0;i<n;i++)
        {
            if(words[(si+i)%n].equals(target))
            {
                dis=Math.min(dis,i);
            }
            if(words[(si-i+n)%n].equals(target))
            {
                dis=Math.min(dis,i);

            }

        }
        return dis==Integer.MAX_VALUE?-1:dis;

        


        
    }
}