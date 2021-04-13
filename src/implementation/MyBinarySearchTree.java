package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class


   public void insert( E data){

        implementation.Node node = (implementation.Node) new Node(data);
        if(root == null){
            root = node;
        }
        else{
            //compare and move to subtree(either left or right)
            Node temp = root;
            //keep a parent reference which is used for inserting new child node
            Node parent = null;
            while (temp != null){
                parent = temp;
                //temp will be either left or right child of root or current temp
                //on the basis of comparison
                if(data <= temp.getData()){
                    temp = temp.getLeftchild();
                }
                else{
                    temp = temp.getRightchild();
                }
            }
            if(data <= parent.getData()){
                parent.setLeftchild(node);
            }
            else{
                parent.setRightchild(node);
            }
        }
    }


    public boolean search(E searchElement) {
        return false;
    }

    @Override
    public void inOrder(Node<E> root) {
        if(root!=null)
        {
            inOrder(root.getLeftchild());
            System.out.print(root.getData()+ " ");
            inOrder(root.getRightchild());
        }
    }

    @Override
    public void preOrder(Node<E> root) {
        if(root!=null)
        {
            System.out.print(root.getData()+" ");
            preOrder(root.getLeftchild());
            preOrder(root.getRightchild());
        }
    }

    @Override
    public void postOrder(Node<E> root) {
        if(root!=null)
        {
            System.out.print(root.getData()+" ");
            postOrder(root.getLeftchild());
            postOrder(root.getRightchild());
        }
    }
    
    public void reverseInOrder(Node<E> root) {
        ArrayList<E> l = new ArrayList<>();
        if(root!=null)
        {
            inOrder(root.getLeftchild());
            l.add((root.getData());
            inOrder(root.getRightchild());
        }

        Collections.reverse(l);
        for(E e:l){
            System.out.print(e+" ");
        }
        System.out.println();

    }

    public void delete(E data) {

    }

    @Override
    public int height(implementation.Node<E> node) {
        if(node == null){
            return  -1;
        }
        return 1 + Math.max(height(node.getLeftchild()),height(node.getRightchild()));
    }


    
}
