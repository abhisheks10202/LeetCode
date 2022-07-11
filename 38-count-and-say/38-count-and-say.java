class Solution {
   
    public String countAndSay(int n) {
         if(n==1)
        {
            return "1";
        }
        StringBuilder sb=new StringBuilder();
        String str=countAndSay(n-1);
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int j=i;
            int count=0;
            while(j<str.length()&&ch==str.charAt(j))
            {
                count++;
                j++;
            }
            i+=count-1;
            sb.append(count).append(ch);
        }
        // System.out.println(sb);
        return sb.toString();
    }
}