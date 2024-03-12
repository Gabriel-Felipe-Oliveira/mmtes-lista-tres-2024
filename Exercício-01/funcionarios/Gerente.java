package funcionarios;


public class Gerente extends Funcionario {
    public Gerente(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.20 + 1000; // Bônus de 20% + adicional fixo de R$1000
    }
}
