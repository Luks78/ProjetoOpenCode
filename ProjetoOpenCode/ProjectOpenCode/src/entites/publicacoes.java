package entites;

public class publicacoes {
    
        protected int id;
        protected String titulo;
        protected String descricao;
        protected String dataUpload;

    public publicacoes (){
        
    }
    
    public publicacoes (String titulo, String descricao, String dataUpload){
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataUpload = dataUpload;
    }
        
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataUpload() {
        return dataUpload;
    }

    public void setDataUpload(String dataUpload) {
        this.dataUpload = dataUpload;
    }
        
        public void exibicaoPublicacoes (){
            System.out.println("Titulo: " + titulo);
            System.out.println("Descrição: " + descricao);
            System.out.println("Data do Upload: " + dataUpload);
        }
        
        public void exibicaoMidias(){
            
        }
        
        public void exibicaoAvaliacao(){
            
        }
	
	public void exibicaoUsuario(){
            
        }
}