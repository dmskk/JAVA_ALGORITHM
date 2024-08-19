import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       Queue<Integer> cards = IntStream.rangeClosed(1,n)
                                        .boxed()
                                        .collect(Collectors.toCollection(LinkedList::new));

       while(cards.size() > 1) {
           cards.poll();
           cards.add(cards.poll());
       }

        System.out.println(cards.peek());
    }
}