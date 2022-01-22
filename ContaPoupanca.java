package dio.com.joaonunodev;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String cliente, CodigoGerenteAgencia codigoGerenteAgencia) {
        super(cliente, codigoGerenteAgencia);
    }


    public void imprimirExtrato() {
        System.out.println("\n*********** Extrato Conta Poupança ***********");
        super.imprimirInfoComum();
    }

}
