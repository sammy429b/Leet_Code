public package LinkedList;

class Middle_of_the_Linked_List {
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
    
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
    
            return slow;
        }
    }
}