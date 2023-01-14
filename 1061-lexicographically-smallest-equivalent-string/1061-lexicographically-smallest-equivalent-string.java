class Solution {
     public String smallestEquivalentString(String s1, String s2, String baseStr) {
        FindUnion graph = new FindUnion();

        for(int i=0;i< s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            graph.union(c1,c2);
        }
        char[] res = new char[baseStr.length()];
        Map<Character, Character> dp = new HashMap<>();
        for(int i =0;i<baseStr.length();i++){
            char replace;
            if(dp.containsKey(baseStr.charAt(i))){
                replace = dp.get(baseStr.charAt(i));
            }else{
                replace = graph.findAllConnected(baseStr.charAt(i)).peek();
                dp.put(baseStr.charAt(i), replace);
            }
            res[i] = replace;
        }
        return new String(res);
    }
}
class FindUnion{
    char[] root = new char[26];
    FindUnion(){
        for(int i=0;i<root.length;i++){
            root[i] = (char)('a' + i);
        }
    }
    char find(char ch){
        
        int x = ch - 'a' ;
        if(root[x] == ch) return ch;
        return root[x] = find(root[x]);
    }
    void union(char x, char y){
        char rootX = find(x);
        char rootY = find(y);
        if( rootX != rootY){
            root[rootY-'a'] = rootX;
        }
    }
    PriorityQueue<Character> findAllConnected(char curr){
        char rootIn = find(curr);
        PriorityQueue<Character> minHeap = new PriorityQueue<>((a,b)->a-b);
        for(char ch = 'a';ch<='z' ;ch++){
            if(rootIn == find(ch)){
                minHeap.offer(ch);
            }
        }
        return minHeap;
    }
}