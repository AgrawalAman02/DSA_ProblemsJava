class Solution {
    public void moveZeroes(int[] arr) {

        // my first optimal approach without using extra space   -- 1ms
        // int i =0, j = 0;
        // for(i = 0 ; i<arr.length; i++){
        //     if(arr[i]!= 0){
        //         arr[j] = arr[i];
        //         j++;

        //     }
            
        // }
        // if(j!= arr.length){
        //     for(i = j; i<arr.length; i++){
        //         arr[i] = 0;
        //     }
        // }


// after striver video , used this approach ---- 2ms
        int i = 0 , j=-1;
        for(i  = 0 ; i<arr.length;i++){
            if(arr[i]== 0)
            {
                j= i;
                break;
            }
        } 

        if (j == -1) {
            return;
        }

        for(i= j+1;i<arr.length; i++ ){
            if(arr[i]!= 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }       

    }
}
