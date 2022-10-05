package entities;

public class Load {
    private double height;
    private double width;
    private double weight;

    public Load(int height, int width, int weight) {
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laad{" +
                "height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}
