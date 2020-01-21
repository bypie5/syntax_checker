package syntax_checker;

import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;


/*
Your main file should be called Typecheck.java, and if P.java contains a program to be type checked, then:

java Typecheck < P.java

should print either Program type checked successfully or Type error.
 */
public class TypecheckTest {
    void passFileToMain(String name) throws IOException {
        String[] args = null;
        final InputStream original = System.in;
        final FileInputStream fips =  new FileInputStream(new File("src/test/resources/input_files/"+name));
        System.setIn(fips);
        Typecheck.main(args);
        System.setIn(original);
    }

    String testFile(String name) throws IOException {
        // Setup
        final PrintStream originalOut = System.out;
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        passFileToMain(name);

        // Clean up
        System.setOut(originalOut);

        return myOut.toString();
    }

    @Test
    public void basic() throws IOException {
        assertEquals(testFile("Basic.java"), "Program type checked successfully\n");
    }

    @Test
    public void basicError() throws IOException {
        assertEquals(testFile("Basic-error.java"), "Type error\n");
    }

    @Test
    public void binaryTree() throws IOException {
        assertEquals(testFile("BinaryTree.java"), "Program type checked successfully\n");
    }

    @Test
    public void binaryTreeError() throws IOException {
        assertEquals(testFile("BinaryTree-error.java"), "Type error\n");
    }

    @Test
    public void bubbleSort() throws IOException {
        assertEquals(testFile("BubbleSort.java"), "Program type checked successfully\n");
    }

    @Test
    public void bubbleSortError() throws IOException {
        assertEquals(testFile("BubbleSort-error.java"), "Type error\n");
    }

    @Test
    public void factorial() throws IOException {
        assertEquals(testFile("Factorial.java"), "Program type checked successfully\n");
    }

    @Test
    public void factorialError() throws IOException {
        assertEquals(testFile("Factorial-error.java"), "Type error\n");
    }

    @Test
    public void linearSearch() throws IOException {
        assertEquals(testFile("LinearSearch.java"), "Program type checked successfully\n");
    }

    @Test
    public void linearSearchError() throws IOException {
        assertEquals(testFile("LinearSearch-error.java"), "Type error\n");
    }

    @Test
    public void linkedList() throws IOException {
        assertEquals(testFile("LinkedList.java"), "Program type checked successfully\n");
    }

    @Test
    public void LinkedListError() throws IOException {
        assertEquals(testFile("LinkedList-error.java"), "Type error\n");
    }

    @Test
    public void moreThan() throws IOException {
        assertEquals(testFile("MoreThan4.java"), "Program type checked successfully\n");
    }

    @Test
    public void moreThanError() throws IOException {
        assertEquals(testFile("MoreThan4-error.java"), "Type error\n");
    }

    @Test
    public void quickSort() throws IOException {
        assertEquals(testFile("QuickSort.java"), "Program type checked successfully\n");
    }

    @Test
    public void quickSortError() throws IOException {
        assertEquals(testFile("QuickSort-error.java"), "Type error\n");
    }

    @Test
    public void treeVisitor() throws IOException {
        assertEquals(testFile("TreeVisitor.java"), "Program type checked successfully\n");
    }

    @Test
    public void treeVisitorError() throws IOException {
        assertEquals(testFile("TreeVisitor-error.java"), "Type error\n");
    }
}
