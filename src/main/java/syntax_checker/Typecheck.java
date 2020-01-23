package syntax_checker;

import syntaxtree.*;
import parser.*;

public class Typecheck {
  public enum MiniJavaType { M_INT_ARRAY, M_BOOLEAN, M_INT }
  public static SymbolTable symbolTable;

  // Take file in from stdin (ie [program] < [input.file])
  public static MiniJavaParser parser = new MiniJavaParser(System.in);

  public static void typeCheck() {
    // Set up data
    symbolTable = new SymbolTable();
    SymbolTableConstructor firstVisitor = new SymbolTableConstructor();
    CheckVisitor<String> secondVisitor = new CheckVisitor<>();

    /*
      Use this so automatic testing works
      Probably will work for the final run too
    */
    parser.ReInit(System.in);

    try {
      Goal root = parser.Goal();

      // First pass; Give the visitor data it needs
      firstVisitor.root = root;
      firstVisitor.symbolTable = symbolTable;

      // Construct symbol table
      root.accept(firstVisitor);

      // Second pass
      secondVisitor.root = root;
      secondVisitor.symbolTable = symbolTable;

      // Type check based off items stored in the symbol table
      root.accept(secondVisitor);
    } catch (Exception e) {
      System.out.println("ERROR: " + e);
      e.printStackTrace();
    }

    //symbolTable.print();
    // If the program makes it this far, it is correct
    if (!firstVisitor.foundError && !secondVisitor.foundError) {
      System.out.println("Program type checked successfully");
    }
    else {
      System.out.println("Type error");
    }
  }

  public static void main(String args[]) {
    typeCheck();
  }
} 