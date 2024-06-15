public class Usuario {
    public static void main(String[] args) throws Exception {
        
        Cliente walter = new Cliente();
        walter.setNome("Walter");

        Conta corrente = new ContaCorrente(walter);
        Conta poupanca = new ContaPoupanca(walter);

        corrente.depositar(100);
        corrente.transferir(75, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
