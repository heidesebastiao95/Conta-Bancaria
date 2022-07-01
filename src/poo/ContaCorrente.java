package poo;

public class ContaCorrente {
    protected String NomeDoportador;
    protected int NumConta;
    protected float Saldo;

    public ContaCorrente(String nomeDoportador, int numConta, float saldo) {
        NomeDoportador = nomeDoportador;
        NumConta = numConta;
        Saldo = saldo;
    }

    public String getNomeDoportador() {
        return NomeDoportador;
    }

    public void setNomeDoportador(String nomeDoportador) {
        NomeDoportador = nomeDoportador;
    }

    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int numConta) {
        NumConta = numConta;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = (float) saldo;
    }

    public void depositar(float valor){
        this.Saldo+=valor;
        float desconto= (float) ((0.5*Saldo)/100);
        this.Saldo-=desconto;
    }

    public void sacar(float valor){

        this.Saldo-=valor;
        float desconto= (float) ((0.5*Saldo)/100);
        this.Saldo-=desconto;
    }
}
