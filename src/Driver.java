import java.io.*;
import java.util.Scanner;

public class Driver {
    //open file using scanner
    //declare and create a tree object
    //read the first line and insert it into tree
    public static void main(String[] args) throws IOException {
        Tree tr = new Tree();
        BufferedReader br = new BufferedReader(new FileReader("src/bTree.txt"));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                tr.insert(line);
            }

        }catch (NullPointerException e){
            System.out.println("Null pointer exception");
        }finally {
            br.close();
        }
        tr.preOrder();
        System.out.println("--------------");
        tr.postOrder();
        System.out.println("The number of leaves in the Tree is: "+ tr.numLeaves());
       // System.out.println("Number of names with char 'm' in it: "+ tr.getNames('m'));
        System.out.println("Height of the tree: "+ tr.getHeight());
        tr.setUpLeafIterator();
        Node leafIterator= tr.firstLeaf;
        /*
        iterate through this
        output the string at leafIterator
        then do leafIterator = tr.nextLeaf(leafIterator);
         */
        Scanner sc= new Scanner(new File("src/bstTree.txt"));
        String s;
        while(sc.hasNext()){
            s=sc.next();
            tr.bstInsert(s);
        }
        System.out.println("--------bst tree insert-----------");
        tr.preOrder();

    }
}
