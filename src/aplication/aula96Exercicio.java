package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.aula96Employee;

public class aula96Exercicio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Importando Lista dos Employee, usando ArrayList, poderia ser também LinkedList.
        List<aula96Employee> list = new ArrayList<>();

        System.out.print("How Many Employees will be registered? ");
        int n = sc.nextInt();

        //Pegar os dados
       for(int i = 0; i < n; i++){
           System.out.println("");
           System.out.print("Employee #"+(i + 1)+": ");
           System.out.print("ID: ");
           Integer id = sc.nextInt();

            //Veririfcar se ID ja existe
           while(hasId(list, id)){
                System.out.println("ID already Takken! Try Again!");
                id = sc.nextInt();
           }

           System.out.print("Name: ");
           sc.nextLine(); // limpar buffer de entrada do teclado.
           String name = sc.nextLine();
           System.out.print("Salary: ");
           Double salary = sc.nextDouble();

            aula96Employee employee = new aula96Employee(id, name, salary);

            list.add(employee);

       }
       System.out.println("");
       System.out.print("Enter the Employee ID that will have salary increase: ");
       int idVerify = sc.nextInt(); //Verificar ID para aumentar salário
       
       //forma 1 de achar o funcionario
      /// Integer pos = positionId(list, idVerify); //no IF linha 47 é: if (pos ==null)

       //Forma 2 de achar o funcionario
       aula96Employee employee = list.stream().filter(x -> x.getId() == idVerify).findFirst().orElse(null); // Linha 47 na forma 2 é if (employee ==null)
       //Se esse IF nao achar o pos é nulo, ou seja, ID nao encontrada.

       if (employee ==null){
           System.out.println("This id does not exist!");
       }else{
           //Se o ID existir, aumentar o salário na porcentagem
           System.out.print("Enter the percentage: ");
           double percent = sc.nextDouble();

           //Acessar a lista para procurar o funcionario e aumentar o salario
         // list.get(pos).increaseSalary(percent); // forma 1:  list.get(pos) - forma 2  list.get(employee)
         employee.increaseSalary(percent); //Para forma 2

       }

       System.out.println("");
       System.out.println("List of Employees: ");

       //imprimir usando for Each Forma 1
       /*for(aula96Employee employee2 : list){
           System.out.println(employee);
       }*/

       //Forma 2
       for(aula96Employee e : list){ //usei 'e' como exemplo, não pode ser igual.
        System.out.println(e);
    }

       //Será feito de duas formas, pecorrendo a lista com lambda, ou de forma normal.
        sc.close();
    }
    //Função Auxiliar para procurar elemento na Lista. Forma 1.
    //O public tem que ser static, pois O MAIN é Static.
    public static Integer positionId(List<aula96Employee> list, int id){
        //Se o list.get(i).getid for igual ao id dado acima, ele acha o valor na lita.
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        //Se nao achar nada retorna NULL
        return null;
    }

    //Função para ver se o numero ID ja foi adicionado
    public static boolean hasId(List<aula96Employee> list, int id){
        aula96Employee emp2 = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp2 != null;

    }

}