import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;
 public class TreeDemo extends JFrame {

    TreeDemo() {
        super("JTree Demo");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        child1.add(new DefaultMutableTreeNode("Grandchild 1.1"));
        child1.add(new DefaultMutableTreeNode("Grandchild 1.2"));

        JTree jt = new JTree(root);
        JScrollPane jsp = new JScrollPane(jt);
        add(jsp);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TreeDemo();
    }
}
