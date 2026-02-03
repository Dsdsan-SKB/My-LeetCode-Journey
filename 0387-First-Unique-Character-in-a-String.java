class Solution {
    public int firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++){
            char item = s.charAt(i);
            if (!set.contains(item)) {
                set.add(item);
                map.put(item,i);
            }
            else map.remove(item); 
        }
        if (!map.isEmpty()) return map.values().iterator().next();
        else return -1; 
    }
}
