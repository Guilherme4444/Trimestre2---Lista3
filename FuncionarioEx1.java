package Ex1;

public class FuncionarioEx1 {

    private String Nome;
    private float ValorHora;
    private int horasTrabalhadas;

    public FuncionarioEx1(String Nome, float VlrHora, int horasTrabalhadas) {
        this.Nome = Nome;
        this.ValorHora = VlrHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void pagamento() {
        float pagamento = this.ValorHora * this.horasTrabalhadas;

        System.out.printf("O pagamento para %s deve ser %.2f reais", this.Nome, pagamento);
    }
}