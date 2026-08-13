class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        while (temp != null) {
            if (set.contains(temp.val)) {
                duplicate.add(temp.val);
            } else {
                set.add(temp.val);
            }
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        temp = head;

        while (temp != null) {
            if (duplicate.contains(temp.val)) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}