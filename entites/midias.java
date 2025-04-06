package entites;

// Classe 'midias' herda da superclasse 'publicacoes'
public class midias extends publicacoes implements Exibivel{
    
// Atributos específicos da classe 'midias'
	private String formato;
	private int duracao;

// Construtor padrão (sem parâmetros )
     public midias (){
        super(); // Chama o construtor da superclasse
    }
     
// Construtor com parâmetros (inclui atributos herdados e próprios)
     public midias (String titulo, String descricao, String dataUpload, String formato, int duracao){
        super(titulo, descricao, dataUpload); // Inicializa os atributos da superclasse
        this.formato = formato;
        this.duracao = duracao;
    }
        
// Getters e Setters         
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
	
// Sobrescrita: aqui o método é reescrito para exibir dados específicos de mídias
	@Override
	 public void exibicaoMidias (){
            super.exibicaoPublicacoes(); //Exibe as informações comuns da publicação
             System.out.println("Formato: " + formato);
             System.out.println("Duração: " + duracao);
        }

 // Sobrecarga do método exibicaoMidias: permite exibir ou ocultar a duração com base no parâmetro booleano
       public void exibicaoMidias(boolean mostrarDuracao) {
        super.exibicaoPublicacoes(); // Exibe título, descrição e data do upload (Herdado da super)
        System.out.println("Formato: " + formato);
        if (mostrarDuracao) {
            System.out.println("Duração: " + duracao);
        } else {
            System.out.println("Duração: [oculta]");
        }
    }  
    
    @Override
    public void exibir() {
        exibicaoAvaliacao();
    }
}