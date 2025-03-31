package entites;

public class midias extends publicacoes {
    
	private String formato;
	private int duracao;

     public midias (){
        super();
    }
     
     public midias (String titulo, String descricao, String dataUpload, String formato, int duracao){
        super(titulo, descricao, dataUpload);
        this.formato = formato;
        this.duracao = duracao;
    }
        
        
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
	
	@Override
	 public void exibicaoMidias (){
            super.exibicaoPublicacoes();
             System.out.println("Formato: " + formato);
             System.out.println("Duração: " + duracao);
        }
	
         
}