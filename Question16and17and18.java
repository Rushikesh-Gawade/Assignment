import java.util.*;

class Student implements Comparable<Student> {
    private int rollno;
    private String name;
    private double percentage;
    private Set<String> skillset;

    public Student(int rollno, String name, double percentage, Set<String> skillset) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        this.skillset = skillset;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String toString() {
        return rollno + " " + name + " " + percentage + " " + skillset;
    }

    public int compareTo(Student s) {
        return Double.compare(this.percentage, s.percentage);
    }
}

class UtilityList {
    private List<Student> list = new ArrayList<>();

    public void createList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll no: ");
            int rollno = Integer.parseInt(sc.nextLine());
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter percentage: ");
            double percentage = Double.parseDouble(sc.nextLine());
            System.out.print("Enter skills (comma separated): ");
            String[] skills = sc.nextLine().split(",");
            Set<String> skillset = new HashSet<>(Arrays.asList(skills));
            list.add(new Student(rollno, name, percentage, skillset));
        }
    }

    public void printList() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public List<Student> getList() {
        return list;
    }
}

class UtilityReport {
    public void showReport(List<Student> list) {
        for (Student s : list) {
            System.out.println(s.getName() + "-->" + s.getPercentage());
        }
    }
}

class PercentageComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getPercentage(), s2.getPercentage());
    }
}

public class Question16and17and18 {
    public static void main(String[] args) {
        UtilityList ul = new UtilityList();
        ul.createList();

        System.out.println("Original List:");
        ul.printList();

        List<Student> list = ul.getList();

        Collections.sort(list, new PercentageComparator());
        System.out.println("Sorted by Comparator:");
        ul.printList();

        Collections.sort(list);
        System.out.println("Sorted by Comparable:");
        ul.printList();

        UtilityReport ur = new UtilityReport();
        System.out.println("Report:");
        ur.showReport(list);
    }
}

