package t104;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 菠萝赛东
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * 递归
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

/**
 * 循环
 * 理解循环方法之前先把递归原理搞懂
 */
class Solution2 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //父节点数
        int preCount = 1;
        //这一层的节点数
        int pCount = 0;
        //深度
        int level = 0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            preCount--;
            if (temp.left != null) {
                queue.offer(temp.left);
                pCount++;
            }
            if (temp.right != null) {
                queue.offer(temp.right);
                pCount++;
            }
            if (preCount == 0) {
                preCount = pCount;
                pCount = 0;
                level++;
            }
        }
        return level;
    }
}