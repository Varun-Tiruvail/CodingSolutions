class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
                return "";
            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length - 1];
            int c = 0;
            while(c < first.length())
            {
                if (first.charAt(c) == last.charAt(c))
                    c++;
                else
                    break;
            }
            String a = strs[0];
            if (c == 0)
                a = "";
            else
                a = first.substring(0, c);
            return a;
    }
}