package observer.pedido.classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import observer.pedido.interfaces.PedidoObserver;

public class FilasPedido {
    
    private Pedido pedidaAtual;
    private Queue<Pedido> pedidosFila;
    private List<PedidoObserver> observers ;
    
    public FilasPedido() {
        pedidosFila = new LinkedList<>();
        observers = new LinkedList<>();
    }
    
    public int finalizarPedido() {
      Pedido pedido = pedidosFila.remove(); 
      return pedido.getSenhaPedido();
    }
    
    public void proximoPedido() {
        pedidaAtual = pedidosFila.peek();
    }
    
    public void registrarObserver(PedidoObserver po) {
        observers.add(po);
    }
    
    
}
