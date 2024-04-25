package Testes;

class Bartender implements Observador {
 private String nome;

 public Bartender(String nome) {
     this.nome = nome;
 }

 @Override
 public void atualizar(String mensagem) {
     System.out.println(nome + " recebeu atualização: " + mensagem);
 }
}

