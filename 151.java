class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder("");
        int preptr = s.length() - 1;

        while (preptr >= 0) {
            while (preptr >= 0 && s.charAt(preptr) == ' ') {
                preptr--;
            }
            if (preptr < 0)
                break;
            int ptr = preptr;
            while (preptr >= 0 && s.charAt(preptr) != ' ') {
                preptr--;
            }
            if (ans.length() > 0)
                ans.append(' ');

            for (int i = preptr + 1; i <= ptr; i++) {
                ans.append(s.charAt(i));
            }

        }
        return ans.toString();
    }
}

//there is another solution in which you reverse the whole string then individual word in the string