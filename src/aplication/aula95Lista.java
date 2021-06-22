package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import javax.naming.spi.DirStateFactory.Result;

public class aula95Lista {
    public static void main(String[] args) {
        //Lista de numeros inteiros

        //Não posso usar tipos primitivos tipo int ou double, tenho que usar wrapper class, Integer, Double e etc.
        //Para instancear usei ArrayList
        List<String> list = new ArrayList<>(); 

        //Adicionar na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Augusto");
        list.add("João");
        list.add("Ana");
        list.add("Adalberto");
        list.add("Alvaro");
     
        //ver tamanho da lista
        System.out.println(list.size());

        //Listar laço for each, para mostrar toda a lista.
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------------");
        //Inserir entre o Alex e o Bob, no caso posição 2.
        list.add(2, "Marcos");

        //Listar
        //ver tamanho da lista  
        System.out.println(list.size());

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------------");
        //Remover ana
        list.remove("Ana");
        //Remover na posição 1
        list.remove(1);

    //Remover todos com Letra M, usando predicado
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println(list.size());
        for(String x : list){
             System.out.println(x);
        }
        System.out.println("------------------------------");

        System.out.println("Index of Bob: "+ list.indexOf("Bob"));
        System.out.println("Index of Augusto: "+ list.indexOf("Augusto"));
        //Procurar quem nao esta na lista
        System.out.println("Index of Carlos: "+ list.indexOf("Carlos"));


        System.out.println("------------------------------");
        //Pegar outra lista e listar apenas quem começa com Letra A. o lista do suporta stream entao tenho que converter numa collect.
        //x -> x.chatAt(0) == 'A', vai pegar o x for forma acima ver o char 0 em cada vez e procurar quem inicia com Letra A.
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
       }
       System.out.println("------------------------------");

       //Encontrar o primeiro elemento com letra A;
       //Usando o findFirst com orelse, caso nao ache o orElse, retorna nulo.
       String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
       System.out.println(name);
        //Agora com Z.
       String name2 = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
       System.out.println(name2);

    }
}
