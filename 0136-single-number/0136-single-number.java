
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashmap=new  HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(nums[i])){
                
                hashmap.put(nums[i],hashmap.get(nums[i])+1);
            }
            else{
            hashmap.put(nums[i],1);                
            }
            
        }    
        int result=0;
        for (int key : hashmap.keySet()) {
            if(hashmap.get(key) == 1){
                result=key;
            }
        }
        return result;
        
        
        
        
        
        
    }
}