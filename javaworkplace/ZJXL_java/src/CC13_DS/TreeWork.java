//package CC13_DS;
//
//import java.util.spi.CurrencyNameProvider;
//
///*
// * ¶þ²æÊ÷µÄ±éÀú
// */
//public class TreeWork {	
//	public static void main(String[] args) {
//		Tree tree=new Tree();
//		tree.setRoot(new TreeNode("A"));
//		tree.root.setLchild(new TreeNode("B"));
//		tree.root.setRchild(new TreeNode("C",new TreeNode("D"),new TreeNode("E")));
//		Tree tree
//	}
//}
//
//class TreeNode {
//	
//	Object data;
//	TreeNode lchild;
//	TreeNode rchild;
//	
//	TreeNode(Object o) {
//		this(o, null,null);
//	}
//
//	
//	TreeNode(Object o, TreeNode lchild,TreeNode rchild) {
//		data = o; // this node refers to Object o
//		this.lchild=lchild; // set next to refer to next
//		this.rchild=rchild;
//	}
//
//	Object getObject() {
//		return data;
//	}
//
//	public Object getData() {
//		return data;
//	}
//
//
//	public void setData(Object data) {
//		this.data = data;
//	}
//
//
//	public void setLchild(TreeNode lchild) {
//		this.lchild = lchild;
//	}
//
//
//	public void setRchild(TreeNode rchild) {
//		this.rchild = rchild;
//	}
//
//
//	TreeNode getLchild() {
//		return this.lchild;
//	}
//	TreeNode getRchild() {
//		return this.rchild;
//	}
//}
//
//class Tree{
//	 TreeNode root;
//	 String name; // String like "list" used in printing
//
//	// Constructor: Construct an empty List with s as the name
//	public Tree(String s) {
//		name = s;
//		root= null;
//	}
//
//	// Constructor: Construct an empty List with
//	// "list" as the name
//	public Tree() {
//		this("tree");
//	}
//
//	public TreeNode getRoot() {
//		return root;
//	}
//
//	public void setRoot(TreeNode root) {
//		this.root = root;
//	}
//
//	public void preOder() {
//		while (root.lchild!=null) {
//			System.out.println(root.getData());
//			root.lchild=root;
//			
//		}
//		System.out.println(root.lchild.getData());
//		
//		while (root.rchild!=null) {
//			System.out.println(root.getData());
//			root.rchild=root;
//		}
//		root.rchild=root;
//		
//		
//		
//	}
//}