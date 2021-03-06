/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
import problem1.mybst.MyBinarySearchTree;
// executable class

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        binarySearchTree.insert(50);
        binarySearchTree.insert(35);
        binarySearchTree.insert(90);
        binarySearchTree.insert(15);
        binarySearchTree.insert(45);
        binarySearchTree.insert(33);

        System.out.println("Left children is :");
        binarySearchTree.traverse();
        System.out.println("No. of parents not having left child :");
        System.out.println(binarySearchTree.getCountRight());
    }
}
