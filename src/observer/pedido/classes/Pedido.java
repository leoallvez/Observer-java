package observer.pedido.classes;

public class Pedido {
  
    private int  senhaPedido;
    
    private String itensPedido;
    
    private String statusPedido;

    public int getSenhaPedido() {
        return senhaPedido;
    }

    public void setSenhaPedido(int senhaPedido) {
        this.senhaPedido = senhaPedido;
    }

    public String getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(String itensPedido) {
        this.itensPedido = itensPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }
}
