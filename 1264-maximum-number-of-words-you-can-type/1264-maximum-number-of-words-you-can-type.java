class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int count=0;
        for(String word: words)
        {
            boolean canTyped=true;
            for(char ch:brokenLetters.toCharArray())
            {
                if(word.indexOf(ch)!=-1)
                {
                    canTyped=false;
                    break;
                }
            }
            if(canTyped){
                count++;
            }
        }
        return count;
    }
}