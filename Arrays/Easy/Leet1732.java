class Solution {
    public int largestAltitude(int[] gain) {
        int highest=0;
        int curr=0;
        for (int i=0;i<gain.length;i++){
            curr=curr+gain[i];
            if(curr>highest) highest=curr;
    }
        return highest;
    }
}