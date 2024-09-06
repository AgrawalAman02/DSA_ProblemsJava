class Solution
{
	int  select(int arr[], int i)
	{
    // code here such that selectionSort() sorts arr[]
    
    // this function select the index with minimum value from the unsorted part then return the index;
        int min = Integer.MAX_VALUE;   // initialise with the max value
        int idx  = -1;
        for(int j  = i; j<arr.length; j++){
            if(arr[j] < min ){
                min = arr[j];    // store the local min
                idx = j;   // store the index of local min value
            }
            
        }
        return idx;
	}
	
	
	void selectionSort(int arr[], int n)
	{
	    //this function sorts the array
	    for(int i = 0;i<n-1; i++){
	        int idx= select(arr,i);
	        int temp = arr[idx];
	        arr[idx] = arr[i]; 
	        arr[i] = temp;
	    }
	}
}
