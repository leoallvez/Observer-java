package observer.pedido;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ObserverPedido {

    
    public static void main(String[] args) {
        
        List<String> listNames = Arrays.asList("Alice", "Bob", "Cole", "Dale", "Eric", "Frank");
        Queue<String> queueNames = new LinkedList<>(listNames);
        System.out.println(queueNames);
        
        queueNames.add("Mary");
        queueNames.add("John");
        
        System.out.println(queueNames);
        
        queueNames.poll(); //Pega o primeiro elemento
        String teste = queueNames.peek();
        
        System.out.println("Eu sou o primeiro: "+ teste);
        
        System.out.println(queueNames);

    } 
}
