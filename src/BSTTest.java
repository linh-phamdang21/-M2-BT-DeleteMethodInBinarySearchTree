import java.util.Iterator;

public class BSTTest {
    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;
        // 8,3,6,10,4,7,1,14,13

        root = a.insert(root,8);
        root = a.insert(root,3);
        root = a.insert(root,6);
        root = a.insert(root,10);
        root = a.insert(root,4);
        root = a.insert(root,7);
        root = a.insert(root,1);
        root = a.insert(root,14);
        root = a.insert(root,13);
        root = a.delete(root,1);
    }
}
