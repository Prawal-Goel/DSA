class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList <Integer> result=new ArrayList<>(num.length);
        int carry=0;
        int i=num.length-1;
        int temp=0;
        while(i>=0||k!=0){
        if(i<0) temp=k%10+carry;
        else if (k==0) temp=num[i]+carry;
        else temp=num[i]+(k%10)+carry;
        result.add(0,temp%10);
        carry=temp/10;
        k=k/10;
        i--;
       }
       if(carry!=0){
        result.add(0,carry);
       }
    return result;
    }
}