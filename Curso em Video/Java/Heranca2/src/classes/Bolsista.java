package classes;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada com sucesso");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso");
    }

    public float getBolsa() {
        return  bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
