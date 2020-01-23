package syntax_checker;

public class ClassBinder extends Binder {

    SymbolTable methods;

    public ClassBinder() {
        methods = new SymbolTable();
    }
}
