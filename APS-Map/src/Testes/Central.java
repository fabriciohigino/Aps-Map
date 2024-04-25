package Testes;

import java.util.ArrayList;
import java.util.List;

class Central {
 private List<Observador> observadores = new ArrayList<>();

 public void adicionarObservador(Observador observador) {
     observadores.add(observador);
 }

 public void removerObservador(Observador observador) {
     observadores.remove(observador);
 }

 protected void notificarObservadores(String mensagem) {
     for (Observador observador : observadores) {
         observador.atualizar(mensagem);
     }
 }
}
