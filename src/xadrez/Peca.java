package xadrez;

public class Peca {
    //Teste 29/04
    private char tipo;
    private String posicao;

	//Construtar para peca
	Peca(char tipo, String posicao){
        this.tipo = tipo;
        this.posicao = posicao;
    }

	public char getTipo(){
        return tipo;
    }

    public String getPosicao(){
        return posicao;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

	void mover() {
		;
	}
	
}

