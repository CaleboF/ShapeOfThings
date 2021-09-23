public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder() {
        super();
        this.radius = 0.0;
        this.height = 0.0;

    }
    public Cylinder(double r, double h) {
        super();
        this.radius = r;
        this.height = h;
    }

    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return radius;
    }

    public void getRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return (4.0 * Math.PI * radius * height) + (1 * Math.PI);
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 1) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("Height=").append(height);
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
