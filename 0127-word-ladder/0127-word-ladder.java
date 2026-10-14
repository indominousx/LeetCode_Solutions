class Pair{
    int level;
    String str;
    Pair(int level , String str){
        this.level=level;
        this.str=str;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
      Set<String> set = new HashSet<>(wordList);  
      Queue<Pair> q = new LinkedList<>();
      q.add(new Pair(1,beginWord));
      set.remove(beginWord);
      while(!q.isEmpty()){
          Pair curr = q.poll();
          int level=curr.level;
          String str = curr.str;
          if(str.equals(endWord)) return level;
          for(int i=0;i<str.length();i++){
            char[] arr = str.toCharArray();
            for(char ch='a'; ch<='z';ch++){
                arr[i]=ch;
                String newWord = new String(arr);
                if(set.contains(newWord)){
                     set.remove(newWord);
                     q.add(new Pair(level+1,newWord));
                }
            }
          }
      }
  
return 0;
    }
}