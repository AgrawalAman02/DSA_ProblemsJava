class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;  
        // mp.put(arr[0],1);
        int cnt = 0;  
        for(int i = 0; i<n ;i++){
            sum += arr[i];
            if(sum==0){
                
                cnt= i+1;
            }else{
                if(!mp.containsKey(sum)){
                    mp.put(sum,i);
                }else{
                    int idx = i -mp.get(sum);
                    if(idx>cnt) cnt = idx;
                }
            }
        }
        return cnt;
    }
}
