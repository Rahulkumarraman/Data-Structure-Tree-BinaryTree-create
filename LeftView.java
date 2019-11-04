class Node
{
	int data;
	Node left;
	Node right;
	
}
class BinaryTree
{
	public Node createNewNode(int k)
	{
		Node a=new Node();
		a.data=k;
		a.left=null;
		a.right=null;
		return a;
	}
	int maxlevel;
	public void leftview(Node node,int level)
	{
		if(node==null)
			return;
		if(level>=maxlevel)
		{
			System.out.print(node.data+" ");
			maxlevel++;
			
		}
		leftview(node.left,level+1);
		leftview(node.right,level+1);
	}
	
	
}
public class BinaryTreeApp 
{
     public static void main(String[] args)
     {
    	 BinaryTree a=new BinaryTree();
    	 Node root=a.createNewNode(2);
    	 root.left=a.createNewNode(7);
    	 root.right=a.createNewNode(5);
    	 root.left.left=a.createNewNode(2);
    	 root.left.right=a.createNewNode(6);
    	 root.left.right.left=a.createNewNode(5);
    	 root.left.right.right=a.createNewNode(11);
    	 root.right.right=a.createNewNode(9);
    	 root.right.right.left=a.createNewNode(4);
   a.leftview(root,0);
     }
}