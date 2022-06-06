class Solution {
    // 
    
    public int countLatticePoints(int[][] circles) {
       Set<String>points=new HashSet<>();
        for(int circle[]:circles)
        {
            int X=circle[0];
            int Y=circle[1];
            int r=circle[2];
            
            for(int i=X-r;i<=X+r;i++)
            {
                for(int j=Y-r;j<=Y+r;j++)
                {
                    if( (X-i)*(X-i)+(Y-j)*(Y-j)<=r*r ){
                        points.add(i+","+j);
                    }
                }
            }
        }
        return points.size();
    }
}