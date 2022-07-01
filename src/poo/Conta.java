package poo;

public class Conta extends ContaCorrente {

    public Conta(String nomeDoportador, int numConta, float saldo) {
        super(nomeDoportador, numConta, saldo);

    }

    @Override
    public void depositar(float valor) {
        this.Saldo+=valor;
        float desconto=(float) (0.1*Saldo)/100;
        this.Saldo-=desconto;
    }

    @Override
    public void sacar(float valor) {
        this.Saldo-=valor;
        float desconto=(float) (0.1*Saldo)/100;
        this.Saldo-=desconto;
    }
    public String Consultar(){

        return "Nome do Cliente:\t"+getNomeDoportador()+"\nNumero da conta:\t"+getNumConta()
                +"\nSaldo:\t"+getSaldo()+"$";
    }
}
