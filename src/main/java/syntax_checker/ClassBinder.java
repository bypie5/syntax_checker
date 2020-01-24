package syntax_checker;

public class ClassBinder extends Binder {

    String classname;
    SymbolTable methods;

    public ClassBinder(String c) {
        classname = c;
        methods = new SymbolTable();
    }
}
