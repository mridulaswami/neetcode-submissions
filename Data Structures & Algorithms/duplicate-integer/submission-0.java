class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> newhash = new HashSet<>();

        for(int i : nums){
            if(newhash.contains(i)){
                return true;
            }else{
                newhash.add(i);
            }
        }
        return false;


    }
}