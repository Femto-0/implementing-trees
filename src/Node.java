public class Node {
    String value;
    Node left;
    Node right;

    public Node(String s) {
        value = s;
        left = null;
        right = null;
    }

    public Node find(String valueAtNode) {
        if (value.equals(valueAtNode)) {
            return this;
        } else {
            if (left != null) {
                Node l = left.find(valueAtNode);
                if (l != null) {
                    return l;
                }
            }
            if (right != null) {
                Node r = right.find(valueAtNode);
                if (r != null) {
                    return r;
                }
            }
        }
        return null;
    }

    public Node insert(String valueAtLeft, String valueAtRight) {
        if (valueAtLeft != null) {
            this.left = new Node(valueAtLeft);
        }
        if (valueAtRight != null) {
            this.right = new Node(valueAtRight);
        }
        return null;
    }


    public void preOrder() {
        System.out.println(value + " ");
        if (left != null) {
            left.preOrder();
        }
        if (right != null) {
            right.preOrder();

        }
    }

    public void postOrder() {
        if (left != null) {
            left.preOrder();
        }
        if (right != null) {
            right.preOrder();

        }
        System.out.println(value + " ");
    }

    public int numLeaves() {
        int numLeft=0;
        int numRight=0;
        if(left==null && right ==null){
            return 1;
        }
        if(left!=null){
            numLeft=left.numLeaves();
        }
        if(right!=null){
            numRight=right.numLeaves();
        }
        return numLeft+numRight;
    }
}