package entites;

// Classe base para todas as publicações (como avaliações, mídias, usuários, etc.)
public class publicacoes {

// Atributos protegidos (acessíveis pelas subclasses)
        protected int id;
        protected String titulo;
        protected String descricao;
        protected String dataUpload;

// Construtor padrão (sem parâmetros)
    public publicacoes (){
         // Nenhuma inicialização útil aqui
    }


// Construtor com parâmetros para facilitar a criação de objetos
    public publicacoes (String titulo, String descricao, String dataUpload){
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataUpload = dataUpload;
    }
        
// Getters e setters: usados para acessar e modificar os atributos        
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
//Método padrão: exibir os dados da publicação (pode ser usado por todas as subclasses)     
        public void exibicaoPublicacoes (){
            System.out.println("Titulo: " + titulo);
            System.out.println("Descrição: " + descricao);
            System.out.println("Data do Upload: " + dataUpload);
        }

 //Sobrecarga do método exibicaoPublicacoes: permite controlar se a descrição será exibida ou não
        public void exibicaoPublicacoes(boolean mostrarDescricao) {
            System.out.println("Titulo: " + titulo);
            if (mostrarDescricao) {
                System.out.println("Descrição: " + descricao);
            } else {
                System.out.println("Descrição: [oculta]");
            }
            System.out.println("Data do Upload: " + dataUpload);
        }

 // Métodos "ganchos" que serão sobrescritos nas subclasses, aqui estão vazios, mas em classes como midias, usuario, avaliacao eles são sobrescritos
   
 
 // Método a ser sobrescrito por midias
        public void exibicaoMidias(){
            
        }

 // Método a ser sobrescrito por avaliacao
        public void exibicaoAvaliacao(){
            
        }

 // Método a ser sobrescrito por usuario
	public void exibicaoUsuario(){
            
        }
}