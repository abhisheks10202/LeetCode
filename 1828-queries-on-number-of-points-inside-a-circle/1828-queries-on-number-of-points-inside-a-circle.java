class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int arr[]=new int[queries.length];
         int k=0;
        for(int circle[]:queries)
        {
            int X=circle[0];
            int Y=circle[1];
            int r=circle[2];
           
            int size=0;
            List<String>point=new ArrayList<>();
            for(int i=0;i<points.length;i++)
            {
                int x=points[i][0];
                int y=points[i][1];
                
                    if( (X-x)*(X-x)+(Y-y)*(Y-y)<=r*r ){
                        point.add(x+","+y);
                    }
            }
            arr[k]=point.size();
            k++;
        }
        return arr;
    }
}