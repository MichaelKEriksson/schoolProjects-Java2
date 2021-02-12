public class Key extends GameObject {
    Container container;
    public Key (String name, boolean movable, Container c) {
        super(name, movable);
        this.container = c;

    }
    public boolean fit (Container c) {
        if(this.container.getName().equals(c.getName())) {
            return true;
        } else {
            return false;
        }
    }

}
