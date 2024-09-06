class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int  i = 0 ; i <n; i++){
	    int didSwap = 0;         // added a tracker to keep track of the best case .
            for (int j =  0 ; j<n-i-1; j++){
                if(arr[j+1]<arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
	            didSwap = 1;
                }
            }
		if(didSwap==0) break;   // if swap hadnt taken place in any turn then it means that the arr is sorted , so break;
        }
        
    }
}
