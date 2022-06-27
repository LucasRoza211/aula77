import java.util.Deque;
import java.util.ArrayDeque;

public class Deque01 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>(5);
        deque.add("Ronaldinho Gaucho");
        deque.add("Romario");
        deque.add("Neymar");
        deque.add("Pelé");
        deque.add("Alisson");

        for (String pic : deque){
            System.out.println(pic);
        }
        System.out.println(deque.getLast());
        System.out.println(deque);
        deque.addFirst("Coutinho");
        System.out.println(deque);
        deque.addLast("Paquetá");
        System.out.println(deque);
    }
}
