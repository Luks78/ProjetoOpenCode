package entites;

public class usuario extends publicacoes {
        
       private String nome;
       private String nivel; 

    public usuario (){
        super();
    }
    
    public usuario (String titulo, String descricao, String dataUpload, String nome, String nivel){
        super(titulo, descricao, dataUpload);
        this.nome = nome;
        this.nivel = nivel;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
       
       
	@Override
	 public void exibicaoUsuario (){
            super.exibicaoPublicacoes();
             System.out.println("Nome: " + nome);
             System.out.println("Nivel: " + nivel);
        }
}