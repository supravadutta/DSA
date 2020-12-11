import java.util.LinkedList;

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
      System.out.print(temp.data + "-->");
      temp = temp.next;
    }
    System.out.println("Null");
  }

  public static void main(String[] args) {
    Linkedlist list = new Linkedlist();
    list = create(12, list);
    list = create(23, list);
    list = create(45, list);
    show(list);
  }
}
