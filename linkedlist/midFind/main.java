
class Node {
  int data;
  Node next;

  Node(int value) {
    data = value;
    next = null;
  }

}

class Linkedlist {
  Node root;

  static Linkedlist create(int data, Linkedlist list) {
    Node new_node = new Node(data);
    if (list.root == null) {
      list.root = new_node;

    } else {
      Node temp = list.root;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new_node;
    }
    return list;
  }

  static void show(Linkedlist list) {
    Node temp = list.root;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

  static int count(Linkedlist list) {
    int count = 0;
    Node temp = list.root;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;

  }

  static int mid(Linkedlist list) {
    Node fast_point = list.root;
    Node slow_point = list.root;
    while (fast_point != null && fast_point.next != null) {
      slow_point = slow_point.next;
      fast_point = fast_point.next.next;

    }
    return slow_point.data;
  }

  public static void main(String[] args) {
    Linkedlist list = new Linkedlist();
    list = create(12, list);
    list = create(78, list);
    list = create(90, list);
    list = create(55, list);
    list = create(11, list);
    list = create(22, list);
    list = create(44, list);
    show(list);
    int result = count(list);
    System.out.println(result);
    int value = mid(list);
    System.out.println("value of middle node is " + value);

  }
}