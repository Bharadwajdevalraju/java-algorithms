package org.bd.blind50.set3.extra;

import org.bd.tree.Tree;

public class SameTree {

    public static boolean isSameTree(Tree p, Tree q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.value != q.value) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
