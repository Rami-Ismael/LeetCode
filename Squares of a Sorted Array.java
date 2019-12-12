Runtime: 2 ms, faster than 69.11% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 39.9 MB, less than 100.00% of Java online submissions for Squares of a Sorted Array.
class Solution {
    public int[] sortedSquares(int[] A) {
        //check if the array has one elment
        if(A.length==1)
        {
            A[0] = A[0]*A[0];
            return A;
        }
        //check if the array is null
        if(A.length==0)
            return A;
        int firstPointer = 0;
        int secondPointer = 1;
        //where is it negative
        while(firstPointer<A.length&&A[firstPointer+1]<0)
            firstPointer++;
        //the secondPointer is  where the array is not negative
        secondPointer = firstPointer+1;
        //create a new array
        int [] elements = new int[A.length];
        int i=0;
        while(firstPointer>=0||secondPointer<A.length&&i<A.length){
           if(firstPointer>=0&&secondPointer<A.length&&A[firstPointer]*A[firstPointer]<=A[secondPointer]*A[secondPointer])
           {
               elements[i] = A[firstPointer]*A[firstPointer];
               i++;
               firstPointer--;
           }
            else if(firstPointer>=0&&secondPointer<A.length&&A[firstPointer]*A[firstPointer]>A[secondPointer]*A[secondPointer])
            {
                elements[i] = A[secondPointer]*A[secondPointer];
                i++;
                secondPointer++;
            }
            else if(firstPointer==-1){
                  elements[i] = A[secondPointer]*A[secondPointer];
                i++;
                secondPointer++;
            }
            else{
                  elements[i] = A[firstPointer]*A[firstPointer];
               i++;
               firstPointer--;
            }
        }
        return elements;
        
    }
}
