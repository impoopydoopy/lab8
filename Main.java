import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Manager<IManagerable> manager = new Manager<>();
        Unit1 unitA = new Unit1();
        Unit1 unitB = new Unit1();

        Unit2 unitA2 = new Unit2();
        Unit2 unitB2 = new Unit2();

        manager.addItem(unitA);
        manager.addItem(unitB);
        manager.addItem(unitA2);
        manager.addItem(unitB2);

        LinkedList<IManagerable> list = manager.getList();

        System.out.println(manager.getLinkedList());

        System.out.println(list);
    }
}