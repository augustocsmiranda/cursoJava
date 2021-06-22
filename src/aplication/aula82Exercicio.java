/*
Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, 
o nome do titular a conta, e o valor de depósito inicial que o tituler depositou ao abrir a conta. 
Este valor de depósito inicial, entrentando, é opcional, ou seja: se o títular não tiver dinheiro a d
epositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: Uma vez que a conta bancária foi aberta, o número da conta nunca poderá ser alterado. 
Já o nome do titular pode ser alterado(pois uma pessoa pode mudar o nome por ocasião de casamento, por exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para protever isso. O saldo só 
aumenta por meio de depósitos, e só diminui por meio de saques. para cada Sague realizado, o banco cobra uma taxa de $ 5,00. 
Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. 
Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.

exemplo 1:
Enter account number: 8532
Enter account holder: Alex Green
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500,00

Account data: 
Account 8532, Holder: Alex Green, Balance: $ 500,00

Enter a deposit value: 200,00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700,00

Enter a Withdraw value: 300,00
Updated account Data:
Account 8532, Holder: Alex Green, Balance: $ 395,00
==========================================================
Exemplo 2:
Enter account number: 7801
Enter account holder: Maria Brown
Is there an initial deposit (y/n)? n

Account data: 
Account 7801, Holder: Maria Brown, Balance: $ 0,00

Enter a deposit value: 200,00
Updated account data:
Account 7801, Holder: Maria Brown, Balance: $ 200,00

Enter a Withdraw value: 198,00
Updated account Data:
Account 7801, Holder: Maria Brown, Balance: $ -3,00
*/
package aplication;

import java.util.Scanner;

import entities.accountAula82Exercicio;

public class aula82Exercicio {
    public static void main(String[] args) {

        accountAula82Exercicio accountAula82Exercicio;

        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter Account number: ");
        int number = sc.nextInt();
        System.out.print("Enter Account Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            accountAula82Exercicio = new accountAula82Exercicio(number, holder, initialDeposit);
        }else{
            accountAula82Exercicio = new accountAula82Exercicio(number, holder);
        };
        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(accountAula82Exercicio);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        accountAula82Exercicio.deposit(depositValue);
        System.out.println("Updated Account Data: ");
        System.out.println(accountAula82Exercicio);

        System.out.println();
        System.out.print("Enter a Withdraw value: ");
        double withdrawValue = sc.nextDouble();
        accountAula82Exercicio.withdraw(withdrawValue);
        System.out.println("Updated Account Data: ");
        System.out.println(accountAula82Exercicio);

        sc.close();
    }
}
