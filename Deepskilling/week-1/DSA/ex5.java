class Task {
    int taskId;
    String taskName;
    String status;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }
}
class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
    }
}

public class ex5 {
    Node head;

    void add(Task task) {
        Node n = new Node(task);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = n;
    }

    void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.task.taskName);
            temp = temp.next;
        }
    }
}