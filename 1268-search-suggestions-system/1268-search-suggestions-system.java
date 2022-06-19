class Solution {
    public List<List<String>> suggestedProducts(String[] products, String word) { 
        List<List<String>>ans=new ArrayList<>();
        Arrays.sort(products);
        for(int i=0;i<word.length();i++)
        {
            String s=word.substring(0,i+1);
            List<String>list=new ArrayList<>();
            int k=0;
            for(int j=0;j<products.length;j++)
            {
                if(products[j].startsWith(s)&&k<3)
                { list.add(products[j]);k++;}
            }
            ans.add(list);
        }
        return ans;
        
    }
}