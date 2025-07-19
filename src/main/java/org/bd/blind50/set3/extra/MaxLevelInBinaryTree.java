package org.bd.blind50.set3.extra;

import org.bd.tree.Tree;

public class MaxLevelInBinaryTree {

    public int solve(Tree root) {
        return traverse(root, 0);
    }

    private int traverse(Tree root, int level) {
        if(root == null) {
            return level;
        }
        int left = traverse(root.left,level+1);
        int right = traverse(root.right, level+1);
        return Math.max(left, right);
    }
    
}
