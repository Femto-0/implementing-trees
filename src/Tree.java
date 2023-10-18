import org.w3c.dom.*;

import java.util.StringTokenizer;

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(String line) {
        String valueAtTheNode, valueAtLeft, valueAtRight;
        String[] arr = line.split("\\s");
        valueAtTheNode = arr[0];
        valueAtLeft = arr[1];
        valueAtRight = arr[2];

/*
alternate way of assigning value
 */
//        StringTokenizer stk = new StringTokenizer(line);
//        valueAtTheNode = stk.nextToken();
//        if (stk.hasMoreTokens()) {
//            valueAtLeft = stk.nextToken();
//        } else {
//            valueAtLeft = null;
//            valueAtRight = null;
//        }
//        if (stk.hasMoreTokens()) {
//            valueAtRight = stk.nextToken();
//        } else {
//            valueAtRight = null;
//        }
        if (isEmpty()) {
            //
            Node temp = new Node(valueAtTheNode);
            root=temp;
        }
        Node handle= root.find(valueAtTheNode);
        handle.insert(valueAtLeft, valueAtRight);
    }

    public void preOrder() {
        if(!isEmpty()){
            root.preOrder();
        }
    }
    public void postOrder(){
        if(!isEmpty()){
            root.postOrder();
        }
    }

    public int numLeaves() {
        if(!isEmpty()){
            return root.numLeaves();
        }
        return 0;
    }
}
