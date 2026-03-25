package easy;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
public class FirstUniqueCharacterInAString {

//    public int firstUniqChar(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        Queue<Character> queue = new LinkedList<>();
//
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//            queue.offer(c);
//
//            while (!queue.isEmpty() && map.get(queue.peek()) > 1) {
//                queue.poll();
//            }
//        }
//
//        return queue.isEmpty() ? -1 : s.indexOf(queue.peek());
//    }

    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<n;i++)
        {
            if(freq[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println( new FirstUniqueCharacterInAString().firstUniqChar("leetcode"));
    }
}
