// Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

// You should preserve the original relative order of the nodes in each of the two partitions.

// Example 1:
// Input: head = [1,4,3,2,5,2], x = 3
// Output: [1,2,2,4,3,5]

// Example 2:
// Input: head = [2,1], x = 2
// Output: [1,2]

// Constraints:

// The number of nodes in the list is in the range [0, 200].
// -100 <= Node.val <= 100
// -200 <= x <= 200

// In this ques I am creating two dummyList one contains all the number that are smaller than x and other list contains all the number that is either equal to x or greater than x.
// CODE:

class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)// base condition
            return head;
        ListNode curr=head;
        ListNode small=new ListNode (-1);// creating dummy list one.
        ListNode big=new ListNode (-1);// creating dummy list two.
        ListNode shead=small;
        ListNode bhead=big;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=null;
            ListNode node=curr;

            if(node.val<x){
                shead.next=node;
                shead=shead.next;
            }
            else{
                bhead.next=node;
                bhead=bhead.next;
            }
            curr=nxt;
        }
        shead.next=big.next;
        return small.next;
    }
}
