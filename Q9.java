
class CarBean {
    private String make;
    private String model;
    private int year;

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        CarBean car = new CarBean();

        car.setMake("Toyota");
        car.setModel("Fortuner");
        car.setYear(2025);

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
