//(Подобную задачу решали на семинаре. Здесь так же нужно создать класс, который будет реализовывать указанные методы)
public class T2HW4 {
    public static void main(String[] args) {
        MyMethod queue = new MyMethod();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.get());



    }
}
