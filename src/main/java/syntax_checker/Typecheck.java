package syntax_checker;

import syntaxtree.*;
import parser.*;

public class Typecheck {
  public enum MiniJavaType { M_INT_ARRAY, M_BOOLEAN, M_INT }
  public static SymbolTable symbolTable;

  public static void main(String args[]) {
    // Set up data
    symbolTable = new SymbolTable();

    // Take file in from stdin (ie [program] < [input.file])
    new MiniJavaParser(System.in);

    try {
      Goal root = MiniJavaParser.Goal();
      SymbolTableConstructor visitor = new SymbolTableConstructor();
      visitor.root = root;
      root.accept(visitor);
    } catch (Exception e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
} 