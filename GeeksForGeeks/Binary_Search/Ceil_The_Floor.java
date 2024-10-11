class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor = -1, ceil = -1;
        
        for(int num : arr){
            if(num<= x){
                if(floor == -1 || num > floor) {
                    floor = num;
                }
            }
            if(num>= x){
                if(ceil == -1 || num< ceil) ceil = num;
            }
        }
        
        return new int[]{floor,ceil};
    }
}
