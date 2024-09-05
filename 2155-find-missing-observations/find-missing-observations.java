class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        for (int val : rolls)
            sum += val;
        int missingSum = mean * (n + rolls.length) - sum;
          if (missingSum < n || missingSum > 6*n) return new int[0];
       int part = missingSum / n, rem = missingSum % n;
        int[] ans = new int[n];
        Arrays.fill(ans, part);
        for (int i = 0; i < rem; ++i)
            ++ans[i];
        return ans;

    }

    // public void soln(int array[], int sum, int curr_sum,int i) {
    //     // System.out.println(array[i]+" awin "+i);
    //     if (sum == curr_sum&&i==array.length-1)
    //         {
    //             //  for(int val:array)
    //             //  System.out.println(val+" su,==0");
    //              return;
    //         }
    //     else if ((i==array.length-1))
    //        {
    //             for(int val:array)
    //             //  System.out.println(val+" val=="+i);
    //              return;
    //        }

    //     for (int val = 1; val <= 6; val++) {
    //         array[i] = val;
    //         System.out.println(array[i]+" "+val+" index "+i);
    //         i++;
    //         soln(array, sum,curr_sum+val, i);
    //         i--;
            
    //     }

    // }
}