public class GameObject {
    private String name;
    boolean movable;

    public GameObject(String name, boolean movable) {
        this.name = name;
        this.movable = movable;
    }

    public boolean isMovable(){
        return this.movable;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
