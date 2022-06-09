class ATM {
long []bankD;
    int sub[]=new int[]{20,50,100,200,500};
    public ATM() {
        bankD=new long[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<banknotesCount.length;i++)
        {
            bankD[i]+=banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int reduce[]=new int[5];
        for(int i=reduce.length-1;i>=0;i--){
         reduce[i] = (int)Math.min(bankD[i], amount/sub[i]);
            amount -= sub[i]*reduce[i];
    }
        if(amount!=0)
        return new int[]{-1};
        for(int i=0 ; i<5; i++)
            bankD[i] = bankD[i]-reduce[i];
        return reduce;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */