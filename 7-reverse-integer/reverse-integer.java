class Solution {
    public int reverse(int x) {
        int reversedInteger=0, n=Math.abs(x);
        while(n!=0) {
            int lastDigit = n%10;
            if(reversedInteger > (Integer.MAX_VALUE - lastDigit)/10){ return 0; }
            reversedInteger = reversedInteger*10 + lastDigit;
            n=n/10;
        }

        return x>0?reversedInteger:-1*reversedInteger;
    }
}