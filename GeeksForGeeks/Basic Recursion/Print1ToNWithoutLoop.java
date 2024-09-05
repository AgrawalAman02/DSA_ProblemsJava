class Solution
{
    
    public void print(int i,int n){
        if(i>n) return;
        System.out.print(i+" ");
        print(i+1, n);
    }
    
    
  public void printNos(int n)
    {
        
        print(1,n);
        //Your code here
    }
}

