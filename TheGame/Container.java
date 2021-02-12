public class Container extends GameObject { // extends ger Container allt som GameObject innehåller, den ärver

    private Inventory inventory;
    private boolean locked;

    public Container(String name, boolean movable, boolean locked) {
        super(name, movable); //super betyder att köra super classens konstruktor
        this.inventory = new Inventory(3);
        this.locked = locked;
    }

// lägga till något getContainer, kolla vida vid 11.45 ish



    public boolean isLocked() {
        return this.locked;
    }
    // vad händer om den är låst/ inte låst?


}
