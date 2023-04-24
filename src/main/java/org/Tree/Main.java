package org.Tree;

public class Main {
    public static void main(String[] args) {
        RBTree rbTree = new RBTree();
        rbTree.add(10);
        rbTree.add(12);
        rbTree.add(15);
        rbTree.add(10);
        rbTree.add(13);
        rbTree.add(22);
        rbTree.add(28);
        rbTree.add(28);
        rbTree.add(33);
        rbTree.add(34);
        rbTree.add(35);
        rbTree.add(36);
        rbTree.add(37);
        System.out.println(rbTree.toString());
    }
}