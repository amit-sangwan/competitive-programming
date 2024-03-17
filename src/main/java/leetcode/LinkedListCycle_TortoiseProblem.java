package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class LinkedListCycle_TortoiseProblem {
    /*
    Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached
again by continuously following the next pointer. Internally, pos is used to denote the
index of the node that tail's next pointer is connected to. Note that pos is not passed
as a parameter.
     */


     // Definition for singly-linked list.
      class ListNode {
           int val;
           ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
       }

    public  class Solution {
        public boolean hasCycle(ListNode head) {

            //We will use the tortoise method to solve this problem.

            //Take two pointers slow and fast.

            //Initialize both from the head.
            ListNode slow = head;
            ListNode fast = head;


            //if fast become null or fast.next points to null,
            //that means the list doesn't have a loop.
            while(fast != null && fast.next != null)
            {
                //Increase slow by 1 and fast by 2.
                slow = slow.next;
                fast = fast.next.next;

                // If, at any point, slow and fast becomes equal i.e.
                // if they are pointing to the same node then, we have a loop
                if(slow == fast)
                {
                    //hence, return true.
                    return true;
                }
            }
            //Since the loop doesn't have loop, so return false.
            return false;

        }
    }

    @Test
    public void testDriver(){

          // https://leetcode.com/problems/linked-list-cycle/

    }
}
