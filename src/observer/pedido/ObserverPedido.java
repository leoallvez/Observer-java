package observer.pedido;

import JFrame.Display;
import JFrame.Pager;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JList;
import observer.pedido.classes.DisplayClass;
import observer.pedido.classes.FilasPedido;
import observer.pedido.classes.PagerClass;
import observer.pedido.classes.Pedido;

public class ObserverPedido {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        List<Pedido> pedidosList = Arrays.asList(
            new Pedido(1000, "Duplo Quarterão, Coca-cola, batata", "solicitado"),
            new Pedido(1001, "McFritas Cheddar Bacon, batata", "solicitado"),
            new Pedido(1002, "McFlurry e McShake Prestígio Mini", "solicitado"),
            new Pedido(1003, "McFlurry KitKat Milk & White", "solicitado"),
            new Pedido(1004, "Signature Quattro Formaggi, Coca-cola", "solicitado"),
            new Pedido(1005, "Coca-cola, BIG TASTY", "solicitado")
        );
        
        FilasPedido filaPedidos = new FilasPedido(pedidosList);
        
        DisplayClass display = new DisplayClass();
        PagerClass pager = new PagerClass();
        
        filaPedidos.registrarObserver(display);
        filaPedidos.registrarObserver(pager);

        
        JFrame f = new JFrame("Lista Pedidos");
       
        f.add(new JList(filaPedidos.toArray()));
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        
        Pager pagerJFrame = new  Pager();
        pagerJFrame.setVisible(true);
        pagerJFrame.setPagerClass(pager);
        
        
        Display displayJFrame = new Display();
        displayJFrame.setVisible(true);
        displayJFrame.setFilasPedido(filaPedidos);
        displayJFrame.setDiplayClass(display);
  
  
    } 
}
