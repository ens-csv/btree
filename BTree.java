/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

/**
 *
 * @author Tecmilenio
 */
public class BTree <E> {
    private E data;
    private BTree <E> left;
    private BTree <E> right;
    
    public BTree(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public boolean isEmpty(){
        return(this.data==null);
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public BTree<E> getLeft() {
        return left;
    }

    public void setLeft(BTree<E> left) {
        this.left = left;
    }

    public BTree<E> getRight() {
        return right;
    }

    public void setRight(BTree<E> right) {
        this.right = right;
    }
    
    public static String preOrder(BTree myTree){
        String result ="";
        if (myTree.isEmpty()){
            result = "";
        }
        else{
            result = myTree.getData().toString() +
                     preOrder(myTree.getLeft()) + 
                     preOrder(myTree.getRight());
        }
        return result; 
    }
    
    public static String inOrder(BTree myTree){
        String result ="";
        if (myTree.isEmpty()){
            result = "";
        }
        else{
            result = inOrder(myTree.getLeft()) +
                     myTree.getData().toString()+ 
                     inOrder(myTree.getRight());
        }
        return result; 
    }
    
    public static String postOrder(BTree myTree){
        String result ="";
        if (myTree.isEmpty()){
            result = "";
        }
        else{
            result = postOrder(myTree.getLeft()) +
                     postOrder(myTree.getRight())+ 
                     myTree.getData().toString();
        }
        return result; 
    }
}
