class Solution {
    public boolean isIdealPermutation(int[] A) {
        int i = A.length;
        for(int a=0; a<i; a++){
        for(int b=i-1;b>=a;b--){
            if(A[a]>A[b]&&b-a>1)
            return false;
        }
        }
        return true;
    }
}

/*  public boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i ++){
            if (Math.abs(i - A[i]) >= 2)
                return false;
        }
        return true;
    }
    8 */