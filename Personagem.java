package app;

public class Personagem {

    private int id;
    private String nome;
    private int pontos;

    public Personagem(int id, String nome, int pontos) {
        this.id = id;
        this.nome = nome;
        this.pontos = pontos;
    }

    public void receberGolpe(int aceleracao) {
       this.pontos -= 1 * aceleracao;
    }
    public void receberGolpe(char tipoArma, int aceleracao ) {
        if(tipoArma == 'm'){
            this.pontos -= 2 * aceleracao;
        } else if(tipoArma == 'M'){
            this.pontos -= (2 * aceleracao) * 1.4;
        } else if (tipoArma == 'E'){
            this.pontos -= (2 * aceleracao * 1.4) * 1.4;
        }
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getPontos() {
        return pontos;
    }
    public String toString() {
        return "ID: "
                + getId()
                +", Nome: "
                +getNome()
                +", Pontos: "
                +getPontos();
    }


}