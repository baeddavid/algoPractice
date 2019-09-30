class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode c1 = l1, c2 = l2, current = dummyHead;
        int carry = 0;

        while(c1 != null || c2 != null) {
            int x = (c1 != null) ? c1.val : 0;
            int y = (c2 != null) ? c2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if(c1 != null) c1 = c1.next;
            if(c2 != null) c2 = c2.next;

            if(carry > 0)
                current.next = new ListNode(carry);
        }
        System.out.print("test");
        return dummyHead.next;
    }
}
