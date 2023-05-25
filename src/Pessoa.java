public class Pessoa extends Animal {
    // atributo da classe

    String sobrenome;
    // metodos da classe
    public void falar(){
        System.out.println("falei");
    }

    public String falar(String volume){
        return "falei" + volume;
    }
    public void comer(){
        System.out.println("pessoa comeu");
    }
}

