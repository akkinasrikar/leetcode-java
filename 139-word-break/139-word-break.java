class Solution {
    public boolean wordBreak(String s, List<String> wordDict)
    {
        HashMap<String,Boolean> memo = new HashMap<>();
        return dp(s,wordDict,memo);
    }
    
    public boolean dp(String s,List<String> words,HashMap<String,Boolean> memo)
    {
        if(s.isEmpty()) { return true; }
        if(memo.containsKey(s)) { return memo.get(s); }
        for(String word : words)
        {
            if(s.startsWith(word))
            {
                if (dp(s.substring(word.length()),words,memo))
                {
                    memo.put(s,true);
                    return true;
                }
            }
        }
        memo.put(s,false);
        return false;
    }
    
}