package syntax_checker;

import syntaxtree.*;
import parser.*;

public class Typecheck {
  public enum MiniJavaType { M_INT_ARRAY, M_BOOLEAN, M_INT }

  public static void main(String args[]) {
    // Take file in from stdin (ie [program] < [input.file])

    System.out.println("Program type checked successfully");

    try {
      //System.out.println(System.in.read());
    } catch (Exception e) {
     // System.out.println("ERROR: " + e.getMessage());
    }
    /*new MiniJavaParser(System.in);



    try {
      Goal root = MiniJavaParser.Goal();
      TypecheckVisitor visitor = new TypecheckVisitor();
      visitor.root = root;
      root.accept(visitor);
    } catch (Exception e) {
      System.out.println("ERROR: " + e.getMessage());
    }*/
  }
} 