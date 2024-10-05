class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int cnt1 = 0;
        int cnt2= 0;
        int elem1 = Integer.MIN_VALUE, elem2 = Integer.MIN_VALUE;
        int maj = (int)nums.length/3;
        for(int i : nums){
            if(cnt1 ==0 && i!= elem2){
                elem1 = i;
                cnt1 =1;
            }else if(cnt2 ==0&& i!= elem1){
                elem2 = i;
                cnt2++;
            }
            else if(i==elem1 && cnt1!= 0){
                cnt1++;
                
            }
            else if(i==elem2 && cnt2!= 0){
                cnt2++;
                
            }

            else{
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1 = 0; cnt2  = 0;
        for(int i:nums){
            if(i==elem1) cnt1++;
            if(i==elem2) cnt2++;
        }

        if(cnt1> maj) res.add(elem1);
        if(cnt2> maj) res.add(elem2);
        return res;    
    }
}
