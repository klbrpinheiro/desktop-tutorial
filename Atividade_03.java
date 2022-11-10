import java.util.*;

public class Atividade3 {

   public static void main(String[] args) {
       
       //Criando objetos para uso posterior
       ArrayList<Integer> lista = new ArrayList<Integer>();
       Stack<Integer> pilha = new Stack<>(); 
       Queue<Integer> fila = new LinkedList<>();
       
       //Inserindo números de 1..5 na lista
       for (int i = 1; i < 6; i++) {
           lista.add(i);
       }       

       //Removendo da lista e tranferindo para a pilha
       while(!lista.isEmpty()) {
           int elemento = lista.get(0);
           lista.remove(0);
           pilha.push(elemento);
       }

       //Removendo da pilha e tranferindo para a fila
       while(!pilha.isEmpty()) {
           int elemento = pilha.get(0);
           pilha.remove(0);
           fila.add(elemento);
       }       

       //Inserindo números de 6..10 na lista
       for (int i = 6; i < 11; i++) {
           lista.add(i);
       }       

       //Removendo da lista e tranferindo para a pilha
       while(!lista.isEmpty()) {
           int elemento = lista.get(0);
           lista.remove(0);
           pilha.push(elemento);
       }

       //Removendo da pilha e tranferindo para a fila
       while(!pilha.isEmpty()) {
           int elemento = pilha.get(0);
           pilha.remove(0);
           fila.add(elemento);
       }       

       //Mostrando fila final
       System.out.println("Fila final: " + fila);
   }
}