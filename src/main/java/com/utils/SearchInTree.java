package com.utils;

import com.ed2.TreeNode;

public class SearchInTree<T extends Comparable<T>> {

    public void search(TreeNode<T> root, T valueToSearch) {
        double startedAt = System.nanoTime();
        
        if (root == null) {
            return;
        }

        if (root.getValue().equals(valueToSearch)) {
            System.out.println(
                    "Value " + root.getValue() + " found in " + ((System.nanoTime() - startedAt)/1000000) + " milliseconds the Binary Search Tree.");
            return;
        }

        search(root.getLeft(), valueToSearch);
        search(root.getRight(), valueToSearch);
    }
}
