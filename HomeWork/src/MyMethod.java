import java.util.LinkedList;

public class MyMethod {
    LinkedList<Integer> array = new LinkedList<Integer>();

    public void enqueue(int num) {
        array.add(num);
    }

    public int dequeue() {
        int num = array.get(0);
        array.remove();
        return num;
    }
    public int first() {
        int num = 0;
        num = array.get(0);
        return num;
    }
    public LinkedList<Integer> get() {
        return array;
    }
}


