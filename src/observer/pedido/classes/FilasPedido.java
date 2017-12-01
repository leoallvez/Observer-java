package observer.pedido.classes;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import observer.pedido.interfaces.PedidoObserver;

public class FilasPedido {
    
    private static Pedido pedidoAtual;
    private final Queue<Pedido> pedidosFila;
    private final List<PedidoObserver> observers ;
    
    public FilasPedido( List<Pedido> pedidosList ) {
        this.pedidosFila = new LinkedList<>(pedidosList);
        observers = new LinkedList<>();
    }
    
    public int finalizarPedido() {
      Pedido pedido = pedidosFila.remove(); 
      return pedido.getSenhaPedido();
    }
    
    public void proximoPedido() {
        pedidosFila.remove();
        pedidoAtual =  pedidosFila.peek();
        pedidoAtual.setStatusPedido("PRONTO");
        observers.stream().forEach((p) -> {
            p.update(pedidoAtual.getSenhaPedido());
        });
    }
    
    public void registrarObserver(PedidoObserver po) {
        observers.add(po);
    }

    public Pedido getPedidaAtual() {
        return pedidoAtual;
    }

    public void setPedidaAtual(Pedido pedidaAtual) {
        pedidoAtual = pedidaAtual;
    }
    
    @SuppressWarnings("empty-statement")
    public String[] toArray() {
    
        String[] data = new String[pedidosFila.size()];
        int i = 0;
        for(Pedido p : pedidosFila) {
            data[i] = p.toString();
            i++;
        }; 
       
        return data;
    }

    public Queue<Pedido> getPedidosFila() {
        return pedidosFila;
    }
    
    
}
