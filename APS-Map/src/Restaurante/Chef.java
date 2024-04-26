package Restaurante;

class Chef implements Observador {
 private String nome;

 public Chef(String nome) {
     this.nome = nome;
 }

 @Override
 public void atualizar(String mensagem) {
     System.out.println(nome + " recebeu atualização: " + mensagem);
 }
}