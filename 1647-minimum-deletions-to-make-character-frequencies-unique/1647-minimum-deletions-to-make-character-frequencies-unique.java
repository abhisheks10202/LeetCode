class Solution {
    public int minDeletions(String s) {
        int count =0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                int f=hm.get(ch);
                f++;
                hm.put(ch,f);
            }
            else{
                hm.put(ch,1);
            }
        }
        int [] arr=new int[hm.size()];
        int i =0;
        for (HashMap.Entry<Character,Integer> entry : hm.entrySet()){ 
            // System.out.println("Key = " + entry.getKey() +
                             // ", Value = " + entry.getValue());
        arr[i]=entry.getValue();
        i++;
        }  
    
    
    Arrays.sort(arr);
    
    i=arr.length-1;
    int j=i-1;
    
    while(j>=0){
        if(arr[i]<=arr[j]){
            while(arr[i]<=arr[j] && arr[j]!=0){
            arr[j]--;
            count++;
            }
        }
        else{
            
        }
        j--;
        i--;
    }
    
    return count ;
    }
}