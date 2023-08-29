class Solution {
    public int myAtoi(String s) 
    {
        int i = 0;
        int n = s.length();

        // Skipping space characters at the beginning
        while (i < n && s.charAt(i) == ' ') { 
            i++;
        }

        int positive = 0;
        int negative = 0;

        // Calculating number of positive & negative signs at the start in string
        if (i<n && s.charAt(i) == '+') {
            positive++; 
            i++;
        }

        if (i<n && s.charAt(i) == '-') {
            negative++; 
            i++;
        }
        
        double ans = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            // (s.charAt(i) - '0') is converting character to integer
            ans = ans * 10 + (s.charAt(i) - '0'); 
            i++;
        }

        if (negative > 0) { 
           // if negative sign exists
            ans = -ans;
        }
        
        if (positive > 0 && negative > 0) { 
            // if both +ve and -ve sign exist, Example: +-12
            return 0;
        }
        
        int INT_MAX = (int) Math.pow(2, 31)-1;
        int INT_MIN = (int) Math.pow(-2, 31);

        if (ans > INT_MAX) { // if ans > 2^31 - 1
            ans = INT_MAX + 1 ;
        }

        if (ans < INT_MIN) { // if ans < -2^31
            ans = INT_MIN;
        }

        return (int) ans;
        
        
    }
}