package learn.dsa.linkedList;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn Sep 15, 2021
 * 
 * Reversing a linked list
 * 
 * Problem Description
Given the elements of a linked list, reverse it.


You’ll have to implement the given method, which has the original list’s head pointer as an argument, and return the head of the updated list.

Input format
There are two lines of input.

First line contains N, the number of elements in the linked list.

Second line contains N space separated integers.

Output format
Only line contains N space separated integers

Sample Input 1
5

1 2 3 4 5

Sample Output 1
5 4 3 2 1

Explanation 1
1->2->3->4->5->NULL

5->4->3->2->1->NULL

Constraints
0 <= N <= 10^5

-10^9 <= A[i] <= 10^9
 */
public class ReverseLinkedList {

	static ListNode head;

	public static ListNode reverseLinkedList(ListNode head) {
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;

		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			insertAtEnd(sc.nextInt());
		}
		sc.close();

		reverseLinkedList(head);
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
