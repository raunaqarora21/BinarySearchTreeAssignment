package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class


    public void insert(E data) {




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
