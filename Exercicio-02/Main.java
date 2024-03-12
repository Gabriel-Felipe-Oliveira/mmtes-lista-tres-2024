public class Main {
    
    public static void main(String[] args) {
        Celular celularBasico = new ModeloBasico();
        Celular celularAvancado = new ModeloAvancado();

        // Testando celular básico
        System.out.println("Celular Básico:");
        celularBasico.ligar();
        celularBasico.fazerLigacao("123456789");
        celularBasico.enviarMensagem("987654321", "Olá!");

        // Testando celular avançado
        System.out.println("\nCelular Avançado:");
        celularAvancado.ligar();
        celularAvancado.fazerLigacao("123456789");
        celularAvancado.enviarMensagem("987654321", "Olá!");

        // Mostrando históricos do celular avançado
        System.out.println("\nHistóricos do Celular Avançado:");
        ((ModeloAvancado) celularAvancado).mostrarHistoricoLigacoes();
        ((ModeloAvancado) celularAvancado).mostrarHistoricoMensagens();
    }
}
