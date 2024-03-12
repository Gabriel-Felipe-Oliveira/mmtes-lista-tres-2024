import funcionarios.Funcionario;
import empresa.Empresa;
import funcionarios.Desenvolvedor;
import funcionarios.Gerente;
import funcionarios.Suporte;
import utils.Cargo;


public class Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        // Ler dados do funcionário e criar objeto
        Funcionario desenvolvedor = lerDadosFuncionario(1, 5000, Cargo.DESENVOLVEDOR);
        Funcionario gerente = lerDadosFuncionario(2, 8000, Cargo.GERENTE);
        Funcionario suporte = lerDadosFuncionario(3, 3000, Cargo.SUPORTE);

        // Adicionar funcionários à empresa
        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(suporte);

        // Calcular e imprimir folha salarial total
        System.out.println("Folha Salarial Total: R$" + empresa.calcularFolhaSalarial());
    }

    public static Funcionario lerDadosFuncionario(int id, double salarioBase, Cargo Cargo) {
        // Ler dados do funcionário aqui conforme o Cargo
        // Por simplicidade, vamos apenas retornar um novo funcionário com os dados fornecidos
        switch (Cargo) {
            case DESENVOLVEDOR:
                return new Desenvolvedor("João", id, salarioBase);
            case GERENTE:
                return new Gerente("Maria", id, salarioBase);
            case SUPORTE:
                return new Suporte("Pedro", id, salarioBase);
            default:
                return null;
        }
    }
} 

