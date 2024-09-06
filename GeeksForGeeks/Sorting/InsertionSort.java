class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here

        for (int j = i+1;j>0; j--){
                if(arr[j]<arr[j-1] ){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
        
        for(int i = 0 ;i <n-1;i++){
            insert(arr,i);
        }
    }
}
