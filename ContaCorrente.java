package dio.com.joaonunodev;

public class ContaCorrente extends Conta {

    public ContaCorrente(String cliente, CodigoGerenteAgencia codigoGerenteAgencia) {
        super(cliente, codigoGerenteAgencia);
    }


    public void imprimirExtrato() {
        System.out.println("\n*********** Extrato Conta Corrente ***********");
        super.imprimirInfoComum();
    }

}
