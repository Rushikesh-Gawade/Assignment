class Vehicle implements Cloneable {
    private int number;
    private String name;
    private double price;

    public Vehicle(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Vehicle v = (Vehicle) obj;
        return number == v.number && name.equals(v.name) && price == v.price;
    }

    public int hashCode() {
        return number + name.hashCode() + (int) price;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Number: " + number + ", Name: " + name + ", Price: " + price);
    }
}

public class Question13and14
 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle v1 = new Vehicle(101, "Car", 500000);
        Vehicle v2 = new Vehicle(101, "Car", 500000);

        System.out.println("v1 equals v2: " + v1.equals(v2));
        System.out.println("v1 hashcode: " + v1.hashCode());
        System.out.println("v2 hashcode: " + v2.hashCode());

        Vehicle v3 = (Vehicle) v1.clone();
        System.out.print("Cloned Vehicle: ");
        v3.display();
    }
}
