package entites;

// Classe 'usuario' herda da superclasse 'publicacoes'
public class usuario extends publicacoes implements Exibivel{
       
// Atributos específicos da classe 'usuario'
       private String nome;
       private String nivel; 

// Construtor padrão (sem parâmetros )
    public usuario (){
        super(); // Chama o construtor da superclasse
    }
    
// Construtor com parâmetros (inclui atributos herdados e próprios)
    public usuario (String titulo, String descricao, String dataUpload, String nome, String nivel){
        super(titulo, descricao, dataUpload);  // Inicializa os atributos da superclasse
        this.nome = nome;
        this.nivel = nivel;
    }
    
// Getters e Setters
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
       
 // Sobrescrita: redefine o comportamento do método herdado para exibir dados do usuário       
	@Override
	 public void exibicaoUsuario (){
            super.exibicaoPublicacoes(); //Exibe as informações comuns da publicação
             System.out.println("Nome: " + nome);
             System.out.println("Nivel: " + nivel);
        }

 // Sobrecarga do método exibicaoUsuario: permite decidir se o nível do usuário será exibido ou não
        public void exibicaoUsuario(boolean mostrarNivel) {
            super.exibicaoPublicacoes(); // Exibe título, descrição e data do upload (Herdado da super)
            System.out.println("Nome: " + nome);
            if (mostrarNivel) {
                System.out.println("Nivel: " + nivel);
            } else {
                System.out.println("Nivel: [oculto]");
            }
        }
        
        @Override
        public void exibir() {
            exibicaoAvaliacao();
        }
}