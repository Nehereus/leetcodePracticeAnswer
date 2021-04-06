class Solution {
    public int minOperations(int n) {
        int target =0 ;
        int index = 0;
        int result = 0;
        if (n % 2!=0){target = getValue(((n+1)/2)-1); index = (n-1)/2; }
        else{target =  (getValue((n/2)-1)+getValue(n/2))/2; index =n/2;}
        for (int i =0;i<index;i++){
            result+= target-getValue(i);
        }
        return result;
    }
    public int getValue(int n){
        return (2* n)+1;
    }
}