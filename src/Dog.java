public class Dog {

    boolean isSpotted;
    String name;
    int id;
    double height;

    public Dog(boolean isSpotted, String name, int id, double height) {
        this.isSpotted = isSpotted;
        this.name = name;
        this.id = id;
        this.height = height;
    }

    public boolean isSpotted() {
        return isSpotted;
    }

    public void setSpotted(boolean spotted) {
        isSpotted = spotted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
