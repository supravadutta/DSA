class Node{
  int data;
  Node next;
  Node(int value)
  {
    data=value;
    next=null;
  }
}
class circularLinkedlist{
  Node root;
  Node last;
  circularLinkedlist create(int data,circularLinkedlist list)
  {
    Node new_node = new Node(data);
    
    if(list.root==null)
    {
      list.root=new_node;
      list.root.next=list.root;
      list.last=list.root;
      
    }
    else{
      list.last.next=new_node;
      new_node.next=list.root;
      list.last=list.last.next;

    }
    return list;
  }
  void show(circularLinkedlist list)
  { 
    Node temp=list.root;
    do{
      System.out.print(temp.data + "->");
      temp=temp.next;
    } while(temp!=list.root);

  }
  public static void main(String[] args) {
    circularLinkedlist list = new circularLinkedlist();
    list=list.create(12, list);
    list=list.create(44, list);
    list=list.create(78, list);
    list=list.create(31, list);
    list.show(list);
    System.out.println(list.last.next.data);
  }
}
