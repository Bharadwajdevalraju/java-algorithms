package org.bd.blind50.set3;

import org.bd.tree.Tree;
import java.util.*;

import java.util.ArrayList;

public class SerializeAndDeserializeBinaryTree {

    public String serialize(Tree root) {
        if(root==null) return "";
        List<String> result = new ArrayList<>();
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            var cur = queue.poll();
            if(cur==null){
                result.add(Integer.MAX_VALUE+"");
                continue;
            }
            result.add(cur.value+"");
            queue.add(cur.left);
            queue.add(cur.right);
        }
        var str =  String.join(",", result);
        System.out.println(str);
        return str;
    }

    // Decodes your encoded data to tree.
    public Tree deserialize(String data) {
        String[] d = data.split(",");
        if(data.equals("") || d[0].equals(""+Integer.MAX_VALUE)) return null;
        Tree root = new Tree(Integer.parseInt(d[0]));
        int i=1;
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            var cur = queue.poll();
            if(i>d.length-1) break;
            if(!d[i].equals(Integer.MAX_VALUE+"")){
                cur.left = new Tree(Integer.parseInt(d[i]));
                queue.add(cur.left);
            }
            i++;
            if(i>d.length-1) break;
            if(!d[i].equals(Integer.MAX_VALUE+"")){
                cur.right = new Tree(Integer.parseInt(d[i]));
                queue.add(cur.right);
            }
            i++;
        }
        return root;
    }
}
