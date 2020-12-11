import java.util.*;

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
  static int count(Linkedlist list){
    int count = 0;
    Node temp = list.root;
    while(temp!=null)
    {
      count++;
      temp=temp.next;
    }
    return count;
  }
  static Linkedlist insert(Linkedlist list,int data,int pos)
  {
    Node new_node=new Node(data);
    if(pos==1)
    {
      Node temp=list.root;
      new_node.next=temp;
      list.root=new_node;
      return list;
    }
    else{
      int count=1;
      Node prev=null;
      Node curr=list.root;
      while(count!=pos)
      {
        prev=curr;
        curr=curr.next;
        count++;
      }
      prev.next=new_node;
      new_node.next=curr;
      return list;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Linkedlist list = new Linkedlist();
    list = create(12, list);
    list = create(23, list);
    list = create(45, list);
    list = create(89, list);
    show(list);
    System.out.println(count(list));
    int pos=sc.nextInt();
    if(count(list)+1>=pos)
    {
      list=insert(list, 78, pos);
      show(list);
    }
    else{
      System.out.println("invalid pos");
    }
    
  }
}


