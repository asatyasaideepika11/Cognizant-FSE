class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}
public class ex4 {
    static Employee[] arr = new Employee[100];
    static int size = 0;

    static void add(Employee e) {
        arr[size++] = e;
    }

    static Employee search(int id) {
        for (int i = 0; i < size; i++) {
            if (arr[i].employeeId == id)
                return arr[i];
        }
        return null;
    }

    static void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].name);
        }
    }

    static void delete(int id) {
        int idx = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i].employeeId == id) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int i = idx; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }
    }
}
