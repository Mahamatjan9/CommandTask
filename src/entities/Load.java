package entities;

public class Load {
    private int height;
    private int width;
    private int weight;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Load(int height, int width, int weight, int length) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
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
