package com.solo.leetcode;

public class ReverseLinkedList {

  public ListNode reverseLinkedList(ListNode head) {
    ListNode currentNode = head;
    ListNode prevNode = null;
    while (currentNode != null) {
      ListNode nextNode = currentNode.next;
      currentNode.next = prevNode;
      prevNode = currentNode;
      currentNode = nextNode;
    }
    return prevNode;
  }



  static class ListNode {

    int value;
    ListNode next;

    public ListNode(int value, ListNode next) {
      this.value = value;
      this.next = next;
    }

    public ListNode(int value) {
      this.value = value;
    }

    public ListNode() {
    }
  }

}
