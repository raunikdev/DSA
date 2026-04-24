class Solution {
    public int mirrorDistance(int n) {
        int reverse = 0;
        int number = n;
        // reverse number
        int last=0;
        while(number>0){
            last = number%10;
            reverse = reverse*10 + last;
            number/=10;
        }
        if(n>reverse){
            return n-reverse;
        }else{
            return reverse-n;
        }
    }
}