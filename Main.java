/**
 * For this challenge, we'll assume the following simple singly linked list:
 *
 * public class Node {
 *   public Node next;
 *   public int data;
 *
 *   public Node(int data) {
 *     this.data = data;
 *   }
 *
 *   @Override
 *   public String toString() {
 *     StringBuilder sb = new StringBuilder();
 *
 *     Node nextNode = next;
 *
 *     sb.append(data);
 *
 *     while (nextNode != null) {
 *       sb.append("->");
 *
 *       sb.append(nextNode.data);
 *
 *       nextNode = nextNode.next;
 *     }
 *
 *     return sb.toString();
 *   }
 * }
 */
public class Main {
  /**
   * The 1st approach will use recursion.
   *
   * We will run through the <b>next</b> chain, once it points to null -> we start counting from 0
   * and as we get back to the head node, passing through each already allocated frame - increment by 1.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static int lengthV1(Node node) {
    if (node == null) {
      return 0;
    }

    return lengthV1(node.next) + 1;
  }

  /**
   * 2nd approach is an iterative version. While current node is not null -> increment count by 1 and update the reference to point to next node.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int lengthV2(Node node) {
    int count = 0;

    while (node != null) {
      count++;
      node = node.next;
    }

    return count;
  }
}
