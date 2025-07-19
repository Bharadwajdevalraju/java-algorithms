package org.bd.blind50.set3;

import org.bd.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromInAndPreOrder {

    public Tree buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            inorderMap.put(inorder[i],i);
        }
        return splitTree(preorder, inorderMap, 0,0,preorder.length-1);
    }


    private Tree splitTree(int[] preorder, Map<Integer,Integer> inorderMap,
                               int root, int left, int right) {
        Tree rootNode = new Tree(preorder[root]);
        int mid = inorderMap.get(preorder[root]);
        if(mid>left)
            rootNode.left = splitTree(preorder, inorderMap, root+1, left, mid-1);
        if(mid<right)
            rootNode.right = splitTree(preorder, inorderMap, root+mid-left+1 , mid+1, right);
        return rootNode;
    }
}
