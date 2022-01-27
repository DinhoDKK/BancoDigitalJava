public class Main {

    public static void main(String [] args){
        Cliente campos = new Cliente();
        campos.setNome("Campos");

        Conta cc = new ContaCorrente(campos);
        Conta poupanca = new ContaPoupanca(campos);

        cc.depositar(100);
        cc.tranferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
