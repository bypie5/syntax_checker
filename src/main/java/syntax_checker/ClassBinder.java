package syntax_checker;

public class ClassBinder extends Binder {

    MethodsBinder methods;

    public ClassBinder() {

    }

    public boolean addSymbol(Symbol key, Binder b) {
        return false;
    }
}
