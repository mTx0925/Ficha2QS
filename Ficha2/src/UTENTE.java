public class UTENTE {
    String nome;
    String genero;
    int idade;
    float altura;
    int peso;
    float IMC;

    public UTENTE(String nome, String genero, int idade, float altura, int peso){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
       // this.IMC = CalcIMC(altura, peso);
    }

}
