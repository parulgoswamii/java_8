
class CircleBean {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        CircleBean c = new CircleBean();

        c.setRadius(7);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " +
                           c.getCircumference());
    }
}
