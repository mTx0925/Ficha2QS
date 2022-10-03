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
        this.IMC = CalcIMC(altura, peso);
    }

    public String toString(){
    return nome + " | " + genero + " | " + idade + " | " + altura + " | " + peso + " | " + IMC;
}

    public float CalcIMC(float altura, int peso){
    return peso / (altura * altura);
}

    public String GrauIMC(float IMC){ //Retorna Descricao do IMC
    if (IMC < 0.0) return "Erro, valor negativo";
    if(IMC <= 19){
        return "IMC <= 19: Abaixo do peso normal";
    } else if(IMC <= 25){
        return "19 < IMC <= 25: Peso normal";
    } else if(IMC <= 30){
        return "25 < IMC <= 30: Exceso de peso";
    } else{
        return "30 < IMC: Obeso";
    }
}

    public String UtenteSaudavel(float altura, int peso){ //Verifica se o utente e saudavel e quais o pesos para ser saudavel
    float IMC = CalcIMC(altura, peso);
    int pesoLimI = (int) (25 * altura * altura);
    int pesoLimS = (int) (19 * altura * altura);

    if(IMC < 0) return "Erro IMC menor que 0";

    if(19 < IMC && IMC <=25){ //Peso normal
        return "Limites de peso para manter: " + pesoLimI + " - " + pesoLimS;
    } else{
        return "Deve alcancar a faixa de peso de: " + pesoLimI + " - " + pesoLimS;
    }
}

    public String getNome(){
    return nome;
}
}
