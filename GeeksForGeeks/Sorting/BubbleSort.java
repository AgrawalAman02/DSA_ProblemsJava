class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int  i = 0 ; i <n; i++){
            for (int j =  0 ; j<n-i-1; j++){
                if(arr[j+1]<arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    }
}
