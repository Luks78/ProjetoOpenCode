package entites;

// Classe 'avaliacao' herda de 'publicacoes'
public class avaliacao extends publicacoes implements Exibivel{

// Atributos específicos da classe avaliacao
        private int data;
        private int nota;

// Construtor sem parâmetros
    public avaliacao (){
        super(); // Chama o construtor da super
    }
    
 // Construtor com parâmetros (inclui os da superclasse e os próprios)
    public avaliacao (String titulo, String descricao, String dataUpload, int data, int nota){
        super(titulo, descricao, dataUpload); //  Inicializa os atributos herdados
        this.data = data;
        this.nota = nota;
    }

// Getters e Setters 
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

// Sobrescrita de método: redefinimos o comportamento do método da superclasse
        @Override
	 public void exibicaoAvaliacao (){
            super.exibicaoPublicacoes(); //Exibe as informações comuns da publicação
             System.out.println("Data: " + data);
             System.out.println("Nota: " + nota);
        }

// Sobrecarga de método: Permite controlar se a nota será exibida ou não
        public void exibicaoAvaliacao(boolean mostrarNota) {
            super.exibicaoPublicacoes(); // Exibe título, descrição e data do upload (Herdado da super)
            System.out.println("Data: " + data);
            if (mostrarNota) {
                System.out.println("Nota: " + nota);
            } else {
                System.out.println("Nota: [oculta]");
            }
        }

            @Override
            public void exibir() {
                exibicaoAvaliacao();
            }
}
