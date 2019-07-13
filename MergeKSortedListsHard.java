public ListNode mergeKLists(ListNode[] lists) {
       	 /* A priority queue in Java is a special type of queue wherein all the elements are ordered as per 
		  * their natural ordering or based on a custom Comparator supplied at the time of creation. */
		 // Use a prioirty queue
		 
		 PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.val, b.val));
		 for(ListNode node:lists) {
			 if(node!=null) {
				 /*
				  * The two functions come from two different interfaces that PriorityQueue implements:
						1. add() comes from Collection.
						2. offer() comes from Queue.
						For a capacity-constrained queue, the difference is that add() always returns true and throws an exception if it can't add the element, 
						whereas offer() is allowed to return false if it can't add the element.
				  **/
				 pq.offer(node);
			 }
		 }
		 
		 ListNode result = new ListNode(-1);
		 ListNode head = result;
		 while (!pq.isEmpty()) {
			 ListNode removed =  pq.remove();
			 ListNode node = new ListNode(removed.val);
			 result.next = node;
			 result = result.next;
			 if(removed.next!=null) {
				 pq.offer(removed.next);
			 }
		 }
		 return head.next;
    }
