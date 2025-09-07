class Solution {
    public String longestCommonPrefix(String[] strs) {
        String seq = strs[0];
        for(int i=0; i<strs.length; i++){
            while (!strs[i].startsWith(seq)) {
                seq = seq.substring(0, seq.length() - 1);
                if (seq.isEmpty()) return "";
            }
        }
        return seq;
    }
}