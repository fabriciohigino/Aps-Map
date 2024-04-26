package Restaurante;

public class Sistema {
 public static void main(String[] args) {
     // Criar o pedido e observadores
     Pedido pedido = new Pedido("Pizza e Bebida");
     Chef chef = new Chef("Chef Mario");
     Bartender bartender = new Bartender("Bartender John");
     Estoque estoque = new Estoque("Gerente de Estoque Ana");

     // Adicionar observadores
     // classa maes medotodos 
     pedido.adicionarObservador(chef);
     pedido.adicionarObservador(bartender);
     pedido.adicionarObservador(estoque);

     // Atualizar status do pedido
     pedido.definirStatus("Preparando");

     // Atualizar status do pedido para pronto
     pedido.definirStatus("Pronto para entrega");

     // Pedido foi entregue, notificar gerente de estoque
     pedido.definirStatus("Entregue");
 }
}
