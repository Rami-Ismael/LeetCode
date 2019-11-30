class Solution {
public:
    int mySqrt(int x) {
        long left = 0;
        long right = x;
        long mid = (left+right)/2;
        if(x==1)
            return 1;
        while(left!=mid&&right!=mid){
            
            if(mid*mid==x)
                return mid;
            else if((mid*mid)>x)
            {
                //go right
                right = mid;
                mid = (left+right)/2;
            }
            else
            {
                left = mid;
                mid = (left+right)/2;
            } 
        }
        return mid;
    }
};
