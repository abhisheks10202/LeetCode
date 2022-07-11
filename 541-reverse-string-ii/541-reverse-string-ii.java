class Solution {
    public String reverseStr(String s, int k) {

    int length = s.length();
    
    char[] ips = s.toCharArray();
    
    int l = 0;
    int r = k - 1;
    
    while (l < length) {
        if (r < length) {
            reverse(ips, l, r);
        } else {
            reverse(ips, l, length - 1); 
        }
        l = r + k + 1;
        r = l + k -1;    
    }
    
    return new String(ips);
    
}

public static void reverse(char[] arr, int l, int r) {
    while (l < r) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
    }
}
}