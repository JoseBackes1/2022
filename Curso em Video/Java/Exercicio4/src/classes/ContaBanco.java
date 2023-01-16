package classes;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }
    //methods
    public void abrirConta(String t){
        setStatus(true);
        setTipo(t);
        if(t=="cc"){
            setSaldo(50f);
        }else if(t=="cp"){
            setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso");
        System.out.println("----------------------------------");
    }
    public void fecharConta(){
        if(this.saldo>0.0f){
            System.out.println("Conta com dinheiro");
        }else if(saldo<0){
            System.out.println("Conta em débito");
        }else{
            setStatus(false);
        }
    }
    public void depositar(float valor){
        if(getStatus()){
            setSaldo(getSaldo() + valor);
        }else{
            System.out.println("ERRO! Nao eé possivel depositar");
        }

    }
    public void saque(float valor){
        if(getStatus()) {
            if (getSaldo() < valor) {
                System.out.println("Saldo Insuficiente. Informe um novo valor");
            } else {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque efetuado com sucesso");
            }
        }
    }
    public void pagarMensal(){
        float v = 0;
        if(getTipo()=="cc"){
            v=12f;
        }else if(getTipo()=="cp"){
            v=20f;
        }

        if(getStatus()==true){
            setSaldo(getSaldo()-v);
        }else if(getStatus()==false){

            System.out.println("A conta esta desativada. Impossivel pagar");
        }
    }
    public void estadoDaConta(){
        System.out.println("CONTA: "+ getNumConta());
        System.out.println("TIPO: "+ getTipo());
        System.out.println("DONO: "+ getDono());
        System.out.println("SALDO: "+ getSaldo());
        String estado;
        if(getStatus()==true){
            estado="aberta";
        }else{
            estado="fechada";
        }
        System.out.println("ESTADO: "+ estado);
        System.out.println("-----------------------------");
    }
    //getters and setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getStatus(){

        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

