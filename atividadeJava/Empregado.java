public class Empregado{
    private String nome;
    private int idade;
    private int tipo;
    private double comissao;
    private double salario;
    private double bonus;

    public double CalculoSalario(){
            return salario;
        

    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getComissao() {
        return comissao;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

}