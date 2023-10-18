import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
    //open file using scanner
    //declare and create a tree object
    //read the first line and insert it into tree
    public static void main(String[] args) throws IOException {
        Tree tr = new Tree();
        BufferedReader br = new BufferedReader(new FileReader("src/bTree.txt"));
        String line;
        while((line= br.readLine())!=null) {
            tr.insert(line);
        }
        tr.preOrder();
        System.out.println("--------------");
        tr.postOrder();
        System.out.println("The number of leaves in the Tree is: "+ tr.numLeaves());
    }
}
