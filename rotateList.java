// Given the head of a linked list, rotate the list to the right by k places.

 

// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]

// Input: head = [0,1,2], k = 4
// Output: [2,0,1]
 

// Constraints:

// The number of nodes in the list is in the range [0, 500].
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 109

//CODE: 

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)//this will return the head as it is if the size of list is 0 or 1;
            return head;
      // creating 3 pointers.
        ListNode first;
        ListNode p=head;
        ListNode q=head;
//       calculating the length of list.
        int count=1;
        while(head.next!=null){
            count++;
            head=head.next;
        }
//       calculating the mod so that we dont unnecessarily reverse the list.
        int mod=k%count;
        for(int i=0;i<mod;i++){
            first=q;
            p=first;
            q=first.next;
            while(q.next!=null){
                q=q.next;
                p=p.next;
            }
            q.next=first;
            p.next=null;
        }
        return q;
    }
}
