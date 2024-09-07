class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high)
        {
            int p = partition(arr,low, high);
            quickSort(arr,low, p-1);
            quickSort(arr,p+1,high);
            
        }
        
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[low];
        int pivotIdx = 0; 
        for (int i = low+1 ; i<=high; i++){
            if(arr[i]<=pivot) {
                pivotIdx ++;
            } 
        }
        
        pivotIdx += low;
        int temp = arr[pivotIdx];
        arr[pivotIdx] = arr[low];
        arr[low] = temp;
        
        int i  =low,j = high;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIdx && j>pivotIdx){
            
                temp = arr[i];
                arr[i] = arr[j];
                arr[j]  = temp;
                i++;
                j--;
            }
        }
        
        return pivotIdx;
        
    } 
}
