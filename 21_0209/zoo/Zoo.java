package zoo;

import java.util.Arrays;

public class Zoo {
    private String name;
    private String addr;

    private  Elephant[] e = new Elephant[0];

    public Zoo() {
        this(null, null);
    }

    public Zoo(String name) {
        this(name, null);
    }

    public Zoo(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return this.name;
    }

    public String getAddr() {
        return this.addr;
    }

    public Elephant[] getElephant() {
        return this.e;
    }
    
    public void addElephant(String name) {
        e = Arrays.copyOf(e, e.length + 1);
        e[e.length - 1] = new Elephant(name);
    }
}
