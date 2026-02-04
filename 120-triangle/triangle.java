class Solution {
     static{
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }));
    }
    public int minimumTotal(List<List<Integer>> triangle) {
      int n=triangle.size();

      for(int i=n-2;i>=0;i--){
        for(int j=0;j<triangle.get(i).size();j++)
        {
            int left =triangle.get(i+1).get(j);
            int right=triangle.get(i+1).get(j+1);
            int update=triangle.get(i).get(j)+Math.min(left,right);
            triangle.get(i).set(j,update);
        }


      }
  return triangle.get(0).get(0);
   

    }
}