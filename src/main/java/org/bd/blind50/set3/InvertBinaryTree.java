package org.bd.blind50.set3;

import org.bd.tree.Tree;

public class InvertBinaryTree {

    public void solve(Tree root){
        if(root == null){
            return;
        }
        var temp = root.left;
        root.left = root.right;
        root.right = temp;
        solve(root.left);
        solve(root.right);
    }
}
