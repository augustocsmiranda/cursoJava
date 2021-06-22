package entities;

public class accountAula82Exercicio {
    
    private int number;
    private String holder;
    private double balance;

    public accountAula82Exercicio(int number, String holder){
        //super();
        this.number = number;
        this.holder = holder;
    }

    public accountAula82Exercicio(int number, String holder, double initialDeposit) {
        
        //super();
        this.number = number;
        this.holder = holder;
        //this.balance = balance; //Vai mudar para a de baixo
        deposit(initialDeposit);
    }

    public int getHumber(){
        return number;
    }

    //Número da Conta não muda, não necessário, vou deixar apenas para aprendizado
    // public void setNumber(int number){
    //     this.number = number;
    // }

    public String getHolder(){
        return holder;
    }
    
    public void setHolder(String holder){
        this.holder = holder;
    }

    public double getBalance(){
        return balance;
    }
    //Valor em conta, só pode ser alterar por saque ou depósito.não necessário, vou deixar apenas para aprendizado
    //public void setBalance(double balance){
    //    this.balance = balance;
    //}

    //Deposito de dinheiro em conta
    public void deposit(double amount){
        balance += amount;
    }

    //Saque de dinheiro em conta. Débitar também 5,00 pelo serviço.
    public void withdraw(double amount){
        //No Exercicio Original, não tinha o IF, então mesmo se digitasse o valor 0 para desistir do saque, o valor de 5 reais era cobrado, sem a pessoa retirar nada.
        if (amount > 0){
        balance -= amount + 5.0;
        }
    }

    //ToString para impressão correta

    public String toString(){
        return "Account "
            + number
            + ", Holder: "
            + holder
            + ", Balance: R$ "
            + String.format("%.2f", balance);

    }
}
