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

        /*
2 -> 4 -> 3
5 -> 6 -> 4
7    0    8
*/
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode fake = new ListNode(0);
    ListNode p = fake;
 

 //initialize the nodes of the two lists
    ListNode p1 = l1;
    ListNode p2 = l2;
 
    int carry = 0;
    while(p1!=null || p2!=null){

        int sum = carry;
        if(p1!=null){
            //put the value in the first node into the sum
            sum += p1.val;
            //change the location of the pointer to the next node
            p1 = p1.next;
        }
 
        if(p2!=null){
            //put the value in the second node into the sum
            sum += p2.val;
           //change the location of the pointer to the next node
            p2 = p2.next;
        }
        //check if the value of the sum 15
        if(sum>9){
            //so, carry equals 1
            carry=1;
            //value of sum equals 5
            sum = sum-10;
        }else{
            carry = 0;
        }
         
         //create node to hold the sum
        ListNode l = new ListNode(sum);
        //determine the pointers
        p.next = l;
        p = p.next;
    }
 
    //don't forget check the carry value at the end
    if(carry > 0){
        ListNode l = new ListNode(carry);
        p.next = l;
    }
    return fake.next;
}
        
    }
