class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        // char[] s1 = s.toCharArray();
        // char[] t1 = t.toCharArray();
        // Arrays.sort(s1);
        // Arrays.sort(t1);
        // String s2 = new String(s1);
        // String t2 = new String(t1);
        // return s2.equals(t2);


        char[] freq = new char[26];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)- 'a']++;
            freq[t.charAt(i)- 'a']--;
        }

        for(int i=0; i< freq.length; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}