package Testes;

class Pedido extends Central {
 private String status;
 private String descricao;

 public Pedido(String descricao) {
     this.descricao = descricao;
     this.status = "Pendente";
 }

 public void definirStatus(String status) {
     this.status = status;
     notificarObservadores("Status do pedido atualizado para: " + status);
 }

 public String getDescricao() {
     return descricao;
 }
}