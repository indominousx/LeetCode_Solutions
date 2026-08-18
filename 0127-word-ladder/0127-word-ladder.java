class Pair{
    String str;
    int level;
    Pair(String str , int level){
        this.str=str;
        this.level=level;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> st = new HashSet<>(wordList);
        st.remove(beginWord);
        while(!q.isEmpty()){
            Pair curr = q.poll();
            String str=curr.str;
            int level=curr.level;
            if(str.equals(endWord)) return level;
            for(int i=0;i<str.length();i++){
                char[] arr = str.toCharArray();
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    arr[i] = ch;
                    String newWord = new String(arr);
                    if(st.contains(newWord)) {
                        st.remove(newWord);
                        q.add(new Pair(newWord, level + 1));
                    } 
                }
        }
        }
        return 0;
    }
}