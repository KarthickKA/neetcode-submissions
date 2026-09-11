class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        s = s.toLowerCase();
        t = t.toLowerCase();
        HashMap<Character,Integer> sCounter = new HashMap<>();
        HashMap<Character,Integer> tCounter = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            sCounter.put(s.charAt(i),(sCounter.getOrDefault(s.charAt(i), 0)) + 1);
        }
        for(int j=0;j<t.length();j++)
        {
            tCounter.put(t.charAt(j),tCounter.getOrDefault(t.charAt(j),0)+1);
        }
        return sCounter.equals(tCounter);
    }
}
