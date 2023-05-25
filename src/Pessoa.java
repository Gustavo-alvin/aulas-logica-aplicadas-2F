public class Pessoa {
    // atributo da classe
    String nome;
    String sobrenome;
    // metodos da classe
    public void falar(){
        System.out.println("falei");
    }

    public String falar(String volume){
        return "falei" + volume;
    }
}
