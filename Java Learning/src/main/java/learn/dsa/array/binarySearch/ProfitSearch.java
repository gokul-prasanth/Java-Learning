package learn.dsa.array.binarySearch;

import java.util.Scanner;

/**
 * @author Gokul A
 * @createdOn 
 * 
 * ProfitSearch
 * 
 * Problem Description
The Chefs of the restaurants are asked to prepare Pizzas for their customers. The Restaurant has N chefs and each chef has a rank R(1<=R<=10). A chef with a rank R can cook x Pizzas in F(x) minutes by the given function.

F(x) = R * x * x.

Where F(x) is the time taken in minutes to make x pizzas and R is the rank of the chef.

The waiter has already taken the orders and wants to know the minimum time to get the orders done.

Note: All the chefs can make Pizzas parallelly.

Input format
First line will have two space separated integers representing and N number of Chefs respectively and P number of Pizzas ordered .

The second line will have N space separated integers representing the respective ranks of N chefs.

Output format
Print a single integer which tells the number of minutes needed to get the order done.

Sample Input 1
4 10

1 2 3 4

Sample Output 1
16

Explanation 1
First chef will make 4 pizzas taking 16 minutes, and the rest 2nd, 3rd and 4th chefs will take 2 pizzas each.

Constraints
1<=N<=10000

1<=P<=10000

1<=Rank[i]<=10

 */
public class ProfitSearch {
	
	static int profitSearch(int n, int p, int rank[]) {
		
		//YET TO DO
		
		return 0;
    }
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int rank[] = new int[n];

        for (int i = 0; i < n; i++) {
            rank[i] = sc.nextInt();
        }

        int res = profitSearch(n, p, rank);

        System.out.println(res);
        sc.close();
    }

}
