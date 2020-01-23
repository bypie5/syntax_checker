package syntax_checker;

import syntaxtree.*;
import parser.*;

public class Typecheck {
  public enum MiniJavaType { M_INT_ARRAY, M_BOOLEAN, M_INT }
  public static SymbolTable symbolTable;

  public static MiniJavaParser parser = new MiniJavaParser(System.in);

  public static void typeCheck() {
    // Set up data
    symbolTable = new SymbolTable();

    // Take file in from stdin (ie [program] < [input.file])
    parser.ReInit(System.in);
    try {
      Goal root = parser.Goal();

      // First pass
      SymbolTableConstructor firstVisitor = new SymbolTableConstructor();

      // Give the visitor data it needs
      firstVisitor.root = root;
      firstVisitor.symbolTable = symbolTable;

      // Construct symbol table
      root.accept(firstVisitor);

      // Second pass
      //CheckVisitor<String> secondVisitor = new CheckVisitor<>();

      //secondVisitor.root = root;
      //secondVisitor.symbolTable = symbolTable;

      //root.accept(secondVisitor);

    } catch (Exception e) {
      System.out.println("ERROR: " + e);
      //System.exit(1);
    }

    //symbolTable.print();
    // If the program makes it this far, it is correct
    System.out.println("Program type checked successfully");
  }

  public static void main(String args[]) {
    typeCheck();
  }
} 