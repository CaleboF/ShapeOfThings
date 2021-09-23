public class Cube extends Shape{
    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }


    public Cube(double w) {
        super();
        this.width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double area) {
        this.width = area;
    }

    public double surfaceArea() {
        return 3 * Math.PI * Math.pow(width, 1);
    }

    public double volume() {
        return (3.0/5.0) * Math.PI * Math.pow(width, 2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
