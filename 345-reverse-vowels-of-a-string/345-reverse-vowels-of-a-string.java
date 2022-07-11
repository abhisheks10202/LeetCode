class Solution {
    List<Character>list=new ArrayList<>();
    
    public String solve(StringBuilder s,int i,int j){
        while(i<j)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
              if(list.contains(ch1)==false)
               i++;
               if(list.contains(ch2)==false)
               j--;
            if(list.contains(ch1)&&list.contains(ch2))
               {
                   s.setCharAt(i,ch2);
                   s.setCharAt(j,ch1);
                   j--;i++;
               }
              
        }
        return s.toString();
    }
    public String reverseVowels(String s) {
    list.add('a');
    list.add('e');
    list.add('i');
    list.add('o');
    list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        StringBuilder sb=new StringBuilder(s);
        return solve(sb,0,s.length()-1);
    }
}