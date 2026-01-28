/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode t=head;
        int len=1;
        while(t.next!=null){
            len++;
            t=t.next;
        }
        k=k%len;
        if(k==0) return head;

        ListNode cur=head;
        for(int i=0;i<len-k-1;i++){
            cur=cur.next;
        }
        ListNode newNode=cur.next;
        cur.next=null;
        t.next=head;
        return newNode;
        
    }
}