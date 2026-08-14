class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int element=-(n/2+1);
        for (int i=0;i<n;i++){
            if(n%2==0){
                if(element==-1) {
                    element=element+1;
                }
            } 
            element=element+1;
            arr[i]=element;
        }
    return arr;
    }
}