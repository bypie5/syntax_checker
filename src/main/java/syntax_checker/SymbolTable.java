package syntax_checker;

class Bucket {
    Symbol key;
    Binder binding;
    Bucket next;

    Bucket(Symbol k, Binder b, Bucket n) {
        key = k;
        binding = b;
        next = n;
    }
}

class HashT {
    final int SIZE = 256;
    Bucket table[] = new Bucket[SIZE];

    private int hash(Symbol k) {
        String s = k.toString();
        int h = 0;
        for (int i = 0; i < s.length(); i++)
            h = h*65599+s.charAt(i);
        return h;
    }

    void insert(Symbol s, Binder b) {
        int index=hash(s)%SIZE;
        table[index] = new Bucket(s, b, table[index]);
    }

    Object lookup(Symbol s) {
        int index=hash(s)%SIZE;
        for (Object b = table[index]; b != null; b = ((Bucket) b).next) {
            if (s.eq(((Bucket) b).key)) {
                return ((Bucket) b).binding;
            }
        }

        return null;
    }

    void pop(Symbol s) {
        int index = hash(s)%SIZE;
        table[index] = table[index].next;
    }
}

public class SymbolTable {

    HashT hashT;

    public SymbolTable() {
        hashT = new HashT();
    }

    public void put(Symbol key, Binder value) {
        hashT.insert(key, value);
    }

    public Object get(Symbol key) {
        return hashT.lookup(key);
    }
}
