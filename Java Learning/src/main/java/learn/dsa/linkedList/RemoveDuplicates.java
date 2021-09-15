package learn.dsa.linkedList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Gokul A
 * @createdOn Sep 15, 2021
 * 
 * Remove duplicates from linked list
 * 
 * Problem Description
Given a linked list(need not be sorted) with duplicates, remove all duplicates, such that only the first occurrence of each element must remain in the LL, and return the head.

Input format
There are 2 lines of input

First-line contains N, the number of elements in the linked list.

The next line contains N space-separated integers, elements of the linked list.

Output format
Print the linked list after removing duplicates. Only the first occurrence of an element should be present in the list.

Function definition
The function you have to complete accepts the head as an argument. You will make the necessary changes, and return the head.

Sample Input 1
5

1 2 2 3 3

Sample Output 1
1 2 3

Explanation 1
Node 2 and 3 have 2 occurrences each.

Sample Input 2
5

3 1 3 1 4

Sample Output 2
3 1 4

Explanation 1
The first occurrence of nodes 3 and 1 remains in the list and 4 has no duplicates.

Constraints
0 <= Number of nodes <= 105

-109 <= ListNode.val <= 10
 */
public class RemoveDuplicates {

	static ListNode head;

	public static void removeDuplicates(ListNode head) {
		Set<Integer> elementSet = new HashSet<>();
		if(head == null) {
			return;
		}
		else {
			ListNode node = head;
			elementSet.add(node.val);
			while(node.next != null) {
				if(elementSet.contains(node.next.val)) {
					removeNextElement(node);
				} else {
					elementSet.add(node.next.val);
					node = node.next;
				}
			}
		}
	}

	private static void removeNextElement(ListNode node) {
		ListNode prev = node;
		ListNode next = node.next;
		if(next.next != null) {
			ListNode secondNext = next.next;
			prev.next = secondNext;
		} else {
			prev.next = null;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			insertAtEnd(sc.nextInt());
		}
		sc.close();

		removeDuplicates(head);
		printElements();
	}

	public static void insertAtEnd(int data) {
		ListNode newTail = new ListNode(data);
		if(head == null) {
			head = newTail;
			return;
		}
		ListNode end = head;
		while(end.next != null) {
			end = end.next;
		}
		end.next = newTail;
	}

	public static void printElements() {
		ListNode element = head;
		if(head == null) {
			return;
		}
		else {
			while(element.next != null) {
				System.out.print(element.val + " ");
				element = element.next;
			}
			System.out.print(element.val + " ");
			System.out.println("");
		}
	}
}
