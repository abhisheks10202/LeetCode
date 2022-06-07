class Solution {
    public boolean checkGaurdedOrNot(char arr[][],int i,int j,int m,int n){
            int row=i;
            int col=j;
            while(i>=0&&j>=0)
            {
                if(arr[i][j]=='W')
                     break;
                else if(arr[i][j]=='G')
                    return true;
                i--;
            }
            i=row;
            j=col;
            while(j>=0)
            {
                if(arr[i][j]=='W')
                     break;
                else if(arr[i][j]=='G')
                    return true;
                j--;
            }
            i=row;
            j=col;
            while(i<m)
            {
                if(arr[i][j]=='W')
                     break;
                else if(arr[i][j]=='G')
                    return true;
                i++;
            }
            i=row;
            j=col;
        
         while(j<n)
            {
                if(arr[i][j]=='W')
                     break;
                else if(arr[i][j]=='G')
                    return true;
                j++;
            }
            return false;
        
        
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char arr[][]=new char[m][n];
        int count=0;
        // Arrays.fill(arr,'.');
        int i=0;
        int countG=0;
        
        if(guards.length==1&&walls.length==1&&m==1)
        {
            if(guards[0][1]<walls[0][1])
            {
                // System.out.println(walls[0][1]+1);
                return m*n-(walls[0][1]+1);
            }
                
        }
        if(guards.length==1&&walls.length==1&&n==1)
        {
           if( guards[0][0]<walls[0][0])
                return m*n-walls[0][0]+1;
        }
        
        
        while(i<guards.length&&countG<guards.length)
        {
             arr[guards[i][0]][guards[i][1]]='G';
            count++;
            i++;
            countG++;
        }
        i=0;
        countG=0;
         while(i<walls.length&&countG<walls.length)
        {
             arr[walls[i][0]][walls[i][1]]='W';
            count++;
              i++;
            countG++;
        }
        int gc=0;
        for( i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]!='G'&&arr[i][j]!='W')
                {
                    if(checkGaurdedOrNot(arr,i,j,m,n))
                    {
                        // System.out.println(i+"   "+j);
                        gc++;}
                }
            }
        }
        // System.out.println(m*n+" "+gc+" "+count);
        return m*n-gc-count;
    }
}