
class Q1 {
    private int id;
    private String name;
    private double grade;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Q1 s = new Q1();

        s.setId(101);
        s.setName("XYZ");
        s.setGrade(90.5);

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Grade: " + s.getGrade());
    }
}
