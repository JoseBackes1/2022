package classes;

public class Aluno extends Pessoa{
    private String matr;
    private String curso;


    public void cancelarMatricula(){
        System.out.println("matricula sera cancelada");
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
