package observer.pedido.classes;

import observer.pedido.interfaces.PedidoObserver;

public class DisplayClass implements PedidoObserver {
    private int senhaPedido;

    @Override
    public void update(int senhaPedido) {
        this.senhaPedido = senhaPedido;
    }

    public int getSenhaPedido() {
        return senhaPedido;
    }

    public void setSenhaPedido(int senhaPedido) {
        this.senhaPedido = senhaPedido;
    }
}
