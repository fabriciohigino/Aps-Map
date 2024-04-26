package Restaurante;

class Estoque implements Observador {
 private String nome;

 public Estoque(String nome) {
     this.nome = nome;
 }

 @Override
 public void atualizar(String mensagem) {
     System.out.println(nome + " recebeu atualização: " + mensagem);
 }
}
