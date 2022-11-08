import java.util.Collection;
import java.util.LinkedList;

public class Manager <T extends IManagerable> {
    private LinkedList<T> List;

    Manager(){
        List = new LinkedList<T>();
    }

    public void addItem(T item){
        List.add(item);
    }

    public void deleteItem(int index){
        List.remove(index);
    }

    public void printItem(T item){
        System.out.println(item);
    }

    public LinkedList<T> getLinkedList(){
        return List;
    }

    public void addCollection(Collection<T> collection){
        for (T item : collection)
            List.add(item);
    }

    public LinkedList<T> getList(){
        LinkedList<T> newList = new LinkedList<T>();
        for(int i = 0; i < List.size(); i += 2)
            newList.add(List.get(i));
        return newList;
    }
}
