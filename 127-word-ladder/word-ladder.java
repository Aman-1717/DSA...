class pair{
    String word; int dist;
    public pair(String w,int d){word=w; dist=d;}
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       Queue<pair> q=new LinkedList<>();
       q.add(new pair(beginWord,1));
       int len=wordList.size();
       Set<String> st=new HashSet<String>();
       for(int i=0;i<len;i++){st.add(wordList.get(i));}
       st.remove(beginWord);
       while(!q.isEmpty()){
        String word=q.peek().word;
        int cost=q.peek().dist;
        q.remove();
        if(word.equals(endWord)==true)return cost;
        for(int i=0;i<word.length();i++){
            for(char ch='a';ch<='z';ch++){
                char replacedArray[]=word.toCharArray();
                replacedArray[i]=ch;
                String replacedword=new String(replacedArray);
                if(st.contains(replacedword)==true){
                    q.add(new pair(replacedword,cost+1));
                    st.remove(replacedword);
                }
            }
        }
       } return 0;
    }
}