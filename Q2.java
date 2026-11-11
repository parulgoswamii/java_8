

class Q2 {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Q2 r = new Q2();

        r.setLength(10);
        r.setWidth(5);

        System.out.println("Area: " + r.calculateArea());
        System.out.println("Perimeter: " + r.calculatePerimeter());
    }
}
