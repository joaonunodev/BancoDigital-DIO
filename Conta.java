package dio.com.joaonunodev;

import static dio.com.joaonunodev.CodigoGerenteAgencia.aaa;
import static dio.com.joaonunodev.CodigoGerenteAgencia.bbb;

public abstract class Conta {

    private int conta = 0;
    private String cliente;
    private float saldo;
    private int agencia;
    private CodigoGerenteAgencia codigoGerenteAgencia;


    public Conta( String cliente, CodigoGerenteAgencia codigoGerenteAgencia) {
        this.conta = ++conta;
        this.cliente = cliente;
        this.saldo = 0;
        this.agencia = setAgencia(codigoGerenteAgencia);
    }


    public int getConta() {
        return conta;
    }

    public String getCliente() {
        return cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int setAgencia(CodigoGerenteAgencia codigoGerenteAgencia) {
        if (codigoGerenteAgencia.equals(aaa)) return 100;
        else if (codigoGerenteAgencia.equals(bbb)) return 200;
        else return 0;
    }

    public void sacar(float valor) {
        saldo -= valor;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void transferir(float valor, Conta conta) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    protected void imprimirInfoComum() {
        System.out.println("\n   Conta Número: " + conta +
                "\n   Agência Número: " + this.agencia +
                "\n   Nome do Cliente: " + getCliente() +
                "\n   Saldo: " + this.getSaldo());
    }
}
