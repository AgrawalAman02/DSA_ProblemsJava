class Solution {

    public List<Integer> rowList(int row){
        List<Integer> arr = new ArrayList<>();
        int ans = 1;
        arr.add(ans);

        for(int col = 1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/col;
            arr.add((int)ans);
        }
        return arr;
    }
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 1;i<=numRows;i++ ){
            arr.add(rowList(i));
        }
        return arr;
    }
}
