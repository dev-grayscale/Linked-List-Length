import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void lengthV1() {
    Assertions.assertEquals(0, Main.lengthV1(null));
    Assertions.assertEquals(1, Main.lengthV1(build(1)));
    Assertions.assertEquals(2, Main.lengthV1(build(1,2)));
    Assertions.assertEquals(3, Main.lengthV1(build(1,2,3)));
    Assertions.assertEquals(6, Main.lengthV1(build(1,2,3,4,5,6)));
    Assertions.assertEquals(32, Main.lengthV1(build(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32)));
  }

  @Test
  void lengthV2() {
    Assertions.assertEquals(0, Main.lengthV2(null));
    Assertions.assertEquals(1, Main.lengthV2(build(1)));
    Assertions.assertEquals(2, Main.lengthV2(build(1,2)));
    Assertions.assertEquals(3, Main.lengthV2(build(1,2,3)));
    Assertions.assertEquals(6, Main.lengthV2(build(1,2,3,4,5,6)));
    Assertions.assertEquals(32, Main.lengthV2(build(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32)));
  }

  private static Node build(Integer... values) {
    Node prev = null;
    Node head = null;

    for (Integer value : values) {
      Node n = new Node(value);

      if (prev == null) {
        head = n;
      } else {
        prev.next = n;
      }

      prev = n;
    }

    return head;
  }
}
