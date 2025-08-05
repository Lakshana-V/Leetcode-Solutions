class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int n=s.length();
        int i,r=0, l=0;
        int max=Integer.MIN_VALUE;
        if(n==0){
            return 0;
        }
        while(r<n)
        {
            if(!set.contains(s.charAt(r)))
            {
                set.add(s.charAt(r));
                max=Math.max(max,r-l+1);
                r++;
            }
            else
            {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return (max==Integer.MAX_VALUE?0:max);
    }
}