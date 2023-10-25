public class Node {
    String value;
    Node left;
    Node right;
    Node nextLeaf;

    public Node(String s) {
        value = s;
        left = null;
        right = null;
        nextLeaf= null;
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

    public String getNames(char c) {
        String line="";
        if(left!=null){
            line= line+ left.getNames(c);
        }
        if(right!=null){
            line=line+right.getNames(c);
        }
        if(value.charAt(c)==c){
            line=line+value;
        }
        return line;
    }

    public int getHeight() {
        int height;
        if(left==null &&  right==null){
            height=0;
        }else{
            height=1;
        }
        if(left!=null){
            height+=left.getHeight();
        }
        if(right!=null){
            height+= left.getHeight();
        }

        return height;
    }

    public Node setUpLeafIterator(Node previousLeaf) {
        if(left==null && right ==null){
            previousLeaf=this;
            return previousLeaf;
        }else{
              if(left!=null) {
                  previousLeaf = left.setUpLeafIterator(previousLeaf);
              }
              if(right!=null){
                  previousLeaf=right.setUpLeafIterator(previousLeaf);
              }
        }

        return previousLeaf;
    }


    public void bstInsert(String s) {
        if(s.compareTo(value)<0){
            if(left==null){
                left=new Node(s);
            }else{
                left.bstInsert(s);
            }
        }else{
            if(right==null){
                right= new Node(s);
            }else{
                right.bstInsert(s);
            }
        }
    }

    public boolean bstFind(String s) {
        if(s.equals(value)==true){
            return true;
        }else if(s.compareTo(value)<0){
            return left.bstFind(s);
        }else{
            return right.bstFind(s);
        }
    }

}