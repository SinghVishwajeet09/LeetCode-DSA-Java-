class Solution {
    public int countOrders(int n) {
        long mod = 1000000007l;
        long ans = 1;
        for(int i =1;i<=n;i++){
            ans = (ans*i)%mod;
            ans = (ans *(2L*i-1))%mod;
        }
   return (int) ans;
    }
    
}