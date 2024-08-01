class Solution {
    public int countSeniors(String[] details) {
        int a=0;
        for(int i=0;i<details.length;i++)
        {
            String str=details[i].substring(11,13);
            int ans=Integer.parseInt(str);
            if(ans>60)
            a++;
        }
        return a;
    }
}