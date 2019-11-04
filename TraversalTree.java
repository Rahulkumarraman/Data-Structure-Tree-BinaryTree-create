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
	public void inorder(Node node)
	{
		if(node==null)
			return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	public void preorder(Node node)
	{
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	public void postorder(Node node)
	{
		if(node ==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
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
    	 System.out.print("inorder: ");
    	 a.inorder(root);
    	 System.out.println();
    	 System.out.print("preorder: ");
    	 a.preorder(root);
    	 System.out.println();
    	 System.out.print("postorder: ");
    	 a.postorder(root);
    	 System.out.println();
     }
}
