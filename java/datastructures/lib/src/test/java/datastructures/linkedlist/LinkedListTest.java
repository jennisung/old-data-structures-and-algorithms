package datastructures.linkedlist;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LinkedListTest
{

  @Test public void emptyLinkedList() {
    LinkedList linkedList = new LinkedList();
    assertEquals("null", linkedList.toString());
  }

  @Test void insertLinkedList() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(5);
    linkedList.insert(10);
    assertEquals("{ 10 } -> { 5 } -> null", linkedList.toString());
  }




}
