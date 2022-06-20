class Solution {
    public String reorderSpaces(String text) {
        int cs=0;
        for(char ch:text.toCharArray())
            cs+=ch==' '?1:0;
        // System.out.println(cs);
        text=text.trim();
        // System.out.println(text+"ram");
        String arr[]=text.split("\\s+");
        if(arr.length==1)
        {
            String a=arr[0];
            // System.out.println(text);
            for(int i=0;i<cs;i++)
                a+=" ";
            return a;
        }
        int rem=cs%(arr.length-1);
        cs=cs/(arr.length-1);
         // System.out.println(cs+" "+arr.length+" "+rem);
        String s="";
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
            if(i==arr.length-1)
                break;
            for(int j=0;j<cs;j++)
            {
                s+=" ";
                 // System.out.println(s);
               
            }
        }
        while(rem>0)
        {
            s+=" ";
            rem--;
        }
        return s;
    }
}