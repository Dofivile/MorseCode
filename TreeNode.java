import com.sun.source.tree.Tree;

public class TreeNode<T>  {

    TreeNode<T> left;
    TreeNode<T> right;
    T data;

    public TreeNode( T data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public TreeNode(TreeNode<T> node){
        TreeNode<T> newNode=new TreeNode<T>(node);
    }

    public T getData(){
        return this.data;
    }

}
