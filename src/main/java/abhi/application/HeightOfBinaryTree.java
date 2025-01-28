package abhi.application;

import abhi.model.BinaryTree;
import abhi.model.TreeNode;

import java.util.Objects;

public class HeightOfBinaryTree {

    public static void main(String[] args) {

        System.out.println(findHeightOfBinaryTree(new BinaryTree().getRoot(), 0));
    }

    private static int findHeightOfBinaryTree(TreeNode root, int height) {
        if(Objects.isNull(root)){
            return height;
        }
        height++;
        return Integer.max(findHeightOfBinaryTree(root.getLeftNode(), height),
                findHeightOfBinaryTree(root.getRightNode(), height));
    }

    private static int findHeightOfBinaryTree(TreeNode root) {
        if(Objects.isNull(root)){
            return -1;
        }
        return Integer.max(findHeightOfBinaryTree(root.getLeftNode()),
                findHeightOfBinaryTree(root.getRightNode())) + 1;
    }
}
