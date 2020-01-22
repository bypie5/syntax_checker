package syntax_checker;


public class MethodsBinder extends Binder {

    ParameterBinder params;
    LocalsBinder locals;

    public MethodsBinder() {

    }

    public boolean addSymbol(Symbol key, Binder b) {
        return false;
    }
}
