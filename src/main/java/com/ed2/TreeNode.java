package com.ed2;

import java.util.ArrayList;

public class TreeNode<T extends Comparable<T>> {

    private final T value;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return this.value;
    }

    public TreeNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(TreeNode<T> node) {
        this.left = node;
    }

    public TreeNode<T> getRight() {
        return this.right;
    }

    public void setRight(TreeNode<T> node) {
        this.right = node;
    }

    private TreeNode<T> insert(T value) {
        if (value.compareTo(this.value) < 0) { // Compara o valor com o valor do nó atual
            if (left == null) {
                setLeft(new TreeNode<>(value));
            } else {
                setLeft(getLeft().insert(value)); // Recursivamente insere o valor no nó esquerdo
            }
        } else if (value.compareTo(this.value) > 0) { // Compara o valor com o valor do nó atual
            if (right == null) {
                setRight(new TreeNode<>(value));
            } else {
                setRight(getRight().insert(value)); // Recursivamente insere o valor no nó direito
            }
        } else {
            return this;
        }
        return this; // Retorna o nó atual
    }

    public void insertArray(ArrayList<T> numbers) {
        for (T number : numbers) {
            insert(number);
        }
    }

}
