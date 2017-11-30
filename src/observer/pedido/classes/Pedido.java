package observer.pedido.classes;

public class Pedido {
  
    private int  senhaPedido;
    private String itensPedido;
    private String statusPedido;

    public Pedido(int senhaPedido, String itensPedido, String statusPedido) {
        this.senhaPedido = senhaPedido;
        this.itensPedido = itensPedido;
        this.statusPedido = statusPedido;
    }
   
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
    
    @Override
    public String toString() {
        return "Senha: " + this.senhaPedido + " Itens pedido: " + this.itensPedido + " Status: "+ statusPedido;
    }
}
