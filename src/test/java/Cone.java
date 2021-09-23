public class Cone extends Shape {

    private double radius;
    private double height;

    public Cone() {
        super();
        this.radius = 0.0;
        this.height = 0.0;

    }
    public Cone(double r, double h) {
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
        return  Math.PI * radius * ( radius + Math.sqrt(Math.pow(height, radius)));
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 3) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("Height=").append(height);
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
