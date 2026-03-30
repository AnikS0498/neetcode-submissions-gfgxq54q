class Solution {
    public boolean isAnagram(String s, String t) {
        int flag = 0;
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if(mapS.containsKey(chS)){
                mapS.put(chS, mapS.get(chS) + 1);
            }
            else {
                mapS.put(chS, 1);
            }

            if(mapT.containsKey(chT)){
                mapT.put(chT, mapT.get(chT) + 1);
            }
            else {
                mapT.put(chT, 1);
            }
        }

        return mapT.equals(mapS);

        
    }
}
