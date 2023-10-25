import org.w3c.dom.*;

import java.util.StringTokenizer;

public class Tree {
    Node root;
    Node firstLeaf;

    public Tree() {
        root = null;
        firstLeaf=null;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(String line) {
        String valueAtTheNode;
        String valueAtLeft;
        String valueAtRight;
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
    public String getNames(char c){

        if(!isEmpty()){
            return  root.getNames(c);
        }
        return null;
    }

    public int getHeight() {

        if(!isEmpty()){
            return root.getHeight();
        }
        return 0;
    }

    public Node getFirstLeaf(){
        return firstLeaf;
    }
    public Node getNextLeaf(Node n){
        if(n.nextLeaf==null){
            return null;
        }else{
          return   n.nextLeaf;
        }
    }


    public void setUpLeafIterator() {
        if(!isEmpty()){
            firstLeaf=root.setUpLeafIterator(firstLeaf);
        }
    }
//    public void setUpIterator(){
//        if(!isEmpty()){
//            firstLeaf=root.setUpLeaf2(null);
//        }else{
//            return;
//        }
//    }

    public void bstInsert(String s){
        if(root==null){
            root = new Node(s);
        }else{
            root.bstInsert(s);
        }
    }

    public void bstFind(String s){
        if(root==null){
            root = new Node(s);
        }else{
            root.bstFind(s);
        }
    }

    public void findTheSmallest(String s){

    }

}
