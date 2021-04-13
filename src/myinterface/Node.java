package myinterface;

public class Node<E extends Comparable<E>>{

    private E data;
    private implementation.Node<E> Leftchild;
    private implementation.Node<E> Rightchild;


    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setLeftchild(implementation.Node<E> leftchild) {
        Leftchild = leftchild;
    }

    public implementation.Node<E> getRightchild() {
        return Rightchild;
    }

    public void setRightchild(implementation.Node<E> rightchild) {
        Rightchild = rightchild;
    }

    public implementation.Node<E> getLeftchild() {
        return Leftchild;
    }

    public Node(E data) {
        this.data = data;
        Leftchild = null;
        Rightchild = null;
    }
}

