package learn.dsa.array.stack.queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author Gokul A
 * @createdOn Sep 19, 2021
 * 
 * K most frequent words
 * 
 * Problem Description
You are given a list of words present in a book. Your younger brother is really curious to know the K most frequent words in the book, you have to find them.


Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order should come first.

Input format
There are three lines of input

The first line contains N, which is the number of input strings.

The second line contains N space separated input strings (S).

The third line contains the value of K.

Output format
Print the K most frequent words present inside the book, each in a new line. If two words have the same frequency, then the word with the lower alphabetical order should come first.

Constraints
1 <= N <= 1000

1 <= Length(S) <= 100000

'a' <= S[i] <= 'z'

1 <= K <= Number of Unique Strings

Sample Input 1
1

bus

1

Sample Output 1
bus

Explanation 1
In the given input, the frequency of "bus" is 1 and it is the 1st most frequent word.

Sample Input 2
3

car bus car

2

Sample Output 2
car

bus

Explanation 2
In the given input, the frequency of "car" is 2, frequency of “bus” is 1.

Since K = 2, both words are printed, with "car" being the most frequent, gets printed first.

 */
public class FrequentWords {

	public static Vector<String> frequentWords(Vector<String> vec, int k) {
		Vector<String> result= new Vector<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		Iterator<String> iterator = vec.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			map.put(next, map.getOrDefault(next, 0)+1);
		}

		//		Set<String> keySet = map.keySet();
		//		LinkedList<String> listKeys = new LinkedList<>(keySet);
		//		Iterator<String> descendingIterator = listKeys.descendingIterator();
		//		int count = 0;
		//		while (descendingIterator.hasNext() && count++ <= k) {
		//			result.add(descendingIterator.next());
		//		}

		PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(map.get(o1)!=map.get(o2))
					return map.get(o2)-map.get(o1);
				else
					return o1.compareTo(o2);
			}
		});
		for(Map.Entry<String,Integer> mapEntrySet:map.entrySet()) {
			queue.add(mapEntrySet.getKey());
		}

		int count = 0;
		while(count++ <= k){
			result.add(queue.poll());
		}

		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Vector<String> vec=new Vector<String>();
		for(int i=0;i<n;i++)
			vec.add(sc.next());
		int k=sc.nextInt();
		sc.close();

		Vector<String> ans = frequentWords(vec, k);
		for(int i=0;i<k;i++)
			System.out.println(ans.get(i));
	}

}
