class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for(char c : s.toCharArray()){
            countS.put(c, countS.getOrDefault(c,0)+1);
        }

        for(char m : t.toCharArray()){
            countT.put(m , countT.getOrDefault(m,0)+1);
        }

        return countS.equals(countT);

    }
}
