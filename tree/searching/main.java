Node insert(Node node,int el)
{
    
     if(el>node.data)
    {
        return insert(node.right,el);
    }
    else if(el<node.data)
    {
        return insert(node.left,el);
    }
    else if(node==null)
    {
        Node new_node=new Node(el);
        node=new_node;
    }
    return node;
    
}
int max(Node node)
{
    if(node.right!=null)
    {
        return max(node.right);
    }
    else{
        return node.data;
    }
    
}