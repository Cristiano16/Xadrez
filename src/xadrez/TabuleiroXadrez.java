package xadrez;

public class TabuleiroXadrez {
	//Cria uma matriz de paças
    private Peca[][] tab;
    //Construtor para tabuleiro
    TabuleiroXadrez(){
        //Define tamanho do tabuleiro
        tab = new Peca[8][8];
        //Percorre a matriz posicionando a peça correta em cada posição
        int x, y;
        for(y = 0; y<8; y++){
            for(x = 0; x<8;x++){
                if(y==0 && (x==0 || x==7)){
                    tab[y][x] = new Torre('T', convertVet(x,y));
                    tab[y+7][x] = new Torre('t', convertVet(x,(y+7))); 
                }
                if(y==0 && (x==1 || x==6)){
                    tab[y][x] = new Cavalo('H', convertVet(x, y));
                    tab[y+7][x] = new Cavalo('h', convertVet(x,(y+7))); 
                }
                if(y==0 && (x==2 || x==5)){
                    tab[y][x] = new Bispo('B', convertVet(x, y));
                    tab[y+7][x] = new Bispo('b', convertVet(x,(y+7))); 
                }
                if(y==0 && x==3){
                    tab[y][x] = new Rei('K', convertVet(x, y));
                    tab[y+7][x] = new Rainha('q', convertVet(x, (y+7))); 
                }
                if(y==0 && x==4){
                    tab[y][x] = new Rainha('Q', convertVet(x, y));
                    tab[y+7][x] = new Rei('k', convertVet(x, (y+7))); 
                }
                else if(y==1){
                    tab[y][x] = new Peao('P', convertVet(x, y)); 
                } 
                else if(y==6){
                    tab[y][x] = new Peao('p', convertVet(x, y)); 
                }
            }
        }
    }
	//Metodo para recuperar uma peça do tabuleiro
    public Peca getPeca(int x, int y){
        return tab[x][y];
    }
	//Olha o polimorfismo aí
	public String convertVet(int x, int y){
        String pos=""+((char)('a'+ x))+((char)((7-y)+'1'));
		return pos;
    }

	public String convertVet(int[] vet){
		String pos=""+((char)('a'+vet[1]))+((char)((7-vet[0])+'1'));
		return pos;
	}

	int[] convertString(String pos) {
		int a=7-(int)(pos.charAt(1)-'1');
		int b=(int)(pos.charAt(0)-'a');
		int[] vet= {a,b};
		return vet;
	}
	
	//Metodo para imprimir o tabuleiro
    public void imprimir(){
        //Percorre a matriz imprimindo as peças
        int x, y;
        for(y = 0; y<8;y++){
            System.out.print((8-y) + "  ");
            for(x = 0; x<8; x++){
                if(tab[y][x]!=null)
                    System.out.print(tab[y][x].getTipo() + "  ");
                else
                    System.out.print('-' + "  ");
            }
            System.out.println("\n");
        }
        System.out.println("   a  b  c  d  e  f  g  h");
    }
}

