
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
    System.out.println("Null");
  }

  static Linkedlist delete(int data, Linkedlist list) {
    Node prev = null;
    Node curr = list.root;
    if (list.root.data == data) {

      list.root = list.root.next;

      return list;
    } else {

      while (curr.data != data) {
        prev = curr;
        curr = curr.next;
      }
      prev.next = curr.next;
      return list;
    }

  }

  public static void main(String[] args) {
    Linkedlist list = new Linkedlist();
    list = create(12, list);
    list = create(45, list);
    list = create(67, list);
    list = create(11, list);
    list = create(17, list);
    list = create(15, list);
    list = create(65, list);
    show(list);
    list = delete(67, list);
    show(list);
    list = delete(12, list);
    show(list);

  }

}
