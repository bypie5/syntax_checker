# CS179E Phase 1: Type-Checking
by Brandon Yi

## Requirements and Specifications

​	Phase 1 of this project is required to type check a MiniJava program. Given a MiniJava program, the type-checker must print out `Program type checked successfully` if there is no type error. However, if there is a type error, the program must print out `Type error`. The program takes the MiniJava program in from standard input.

​	Phase 1 uses JTB and JavaCC to create a syntax tree and visitor classes. The generated visitor classes allow easy traversal of the aforementioned syntax tree. My program uses modified versions of the generated `DepthFirstVisitor` and `GJDepthFirst` visitors.

## Design

### Overview

​	My implementation does two passes over the source code: the first pass constructs the symbol table and the second pass uses the symbol table to type check the expressions and statements. The details of these structures will be described below.

### Symbol Table Design

![](stdesign.png)





### First Pass: SymbolTableConstructor

​	The class `SymbolTableConstructor`, as the name implies, constructs the symbol table. 



## Testing and Verification

