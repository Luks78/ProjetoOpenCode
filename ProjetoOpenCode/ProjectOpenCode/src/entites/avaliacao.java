package entites;

public class avaliacao extends publicacoes{
    
        private int data;
        private int nota;

    public avaliacao (){
        super();
    }
    
    public avaliacao (String titulo, String descricao, String dataUpload, int data, int nota){
        super(titulo, descricao, dataUpload);
        this.data = data;
        this.nota = nota;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
        @Override
	 public void exibicaoAvaliacao (){
            super.exibicaoPublicacoes();
             System.out.println("Data: " + data);
             System.out.println("Nota: " + nota);
        }
	
	
}