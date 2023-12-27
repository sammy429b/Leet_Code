public class ADD_TWO_NUMBERS {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l3 = new ListNode(0); // Create a dummy head for the result list
            ListNode tempHead = l3; // Use a temporary head to build the list
            int carry = 0; // Initialize carry to 0

            while (l1 != null || l2 != null || carry != 0) {
                int sum = 0;

                // Add values from l1 and l2, if they exist
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                // Add the carry from the previous addition
                sum += carry;

                // Update carry and create a new node for the current digit
                carry = sum / 10;
                tempHead.next = new ListNode(sum % 10);
                tempHead = tempHead.next;
            }

            return l3.next;
        }
    }
}
