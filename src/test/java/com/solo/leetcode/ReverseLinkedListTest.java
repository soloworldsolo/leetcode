package com.solo.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import com.solo.leetcode.ReverseLinkedList.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

  ReverseLinkedList reverseLinkedList;

  @BeforeEach
  void setUp() {
    reverseLinkedList =  new ReverseLinkedList();
  }

  @Test
  void happyPositiveCase() {
    ListNode  head = new ListNode(1);
    ListNode  head1 = new ListNode(2);
    head.next = head1;
    ListNode  head2 = new ListNode(3);
    head1.next = head2;
    ListNode  head3 = new ListNode(4);
    head2.next = head3;
    ListNode  head4 = new ListNode(5);
    head3.next = head4;

    ListNode result = reverseLinkedList.reverseLinkedList(head);
    Assertions.assertEquals(5,result.value);
    Assertions.assertEquals(4,result.next.value);
    Assertions.assertEquals(3,result.next.next.value);
    Assertions.assertEquals(2,result.next.next.next.value);
    Assertions.assertEquals(1,result.next.next.next.next.value);
  }
}