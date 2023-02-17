// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
  
// Example 1:
// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
  
// Example 2:
// Input: l1 = [0], l2 = [0]
// Output: [0]

// Example 3:
// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]
 
// Constraints:

// The number of nodes in each linked list is in the range [1, 100].
// 0 <= Node.val <= 9
// It is guaranteed that the list represents a number that does not have leading zeros.

// CODE:

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead=new ListNode (0);// creating new List.
        ListNode curr=newHead;// using curr we will traverse this new List.
        int carry=0;
        int x,y;
        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null)
                x=l1.val;
            else
                x=0;
            if(l2!=null)
                y=l2.val;
            else
                y=0;
            int sum=x+y+carry;
            carry=sum/10;//calculating carry
            curr.next=new ListNode(sum%10);// creating a new node and adding that node in the last of the new List.
            curr=curr.next;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return newHead.next;
    }
}
