//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:

// Input: x = 2.10000, n = 3
// Output: 9.26100
// Example 3:

// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

// Constraints:

// -100.0 < x < 100.0
// -231 <= n <= 231-1
// n is an integer.
// -104 <= xn <= 104


// CODE:

class Solution {
    public double myPow(double x, int n) {
        if(n==0){//base case
            return 1;
        }
        double pow;
//       using the logarithmetic approach to solve this question.
        if(n>0){// this will execute when n is +ve.
            double xnb2=myPow(x,n/2);
            pow=xnb2*xnb2;
            if(n%2==1){
                pow=pow*x;
            }
            return pow;
        }
        else{// this will execute when n is -ve.
            double xnm2=myPow(x,n/2);
            pow=xnm2*xnm2;
            if(n%2==-1)
            {
                pow=pow/x;
            }
            return pow;
        }
        
    }
}
