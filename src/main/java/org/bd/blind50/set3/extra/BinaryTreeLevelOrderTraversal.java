package org.bd.blind50.set3.extra;

import org.bd.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> solve(Tree root) {
        if(root == null) return List.of();
        List<List<Integer>> list = new ArrayList<>();
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            var cur = queue.peek();
            int n = queue.size();
            List<Integer> c = new ArrayList<>();
            for (int i=0;i<n;i++) {
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
                c.add(queue.poll().value);
            }
            list.add(c);
        }
        return list;
    }

}
