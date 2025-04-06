package entites;

// Classe associativa entre 'publicacoes' e 'midias'
// Representa uma relação onde uma publicação pode ou não conter uma mídia
public class midiaPost{

    // Referência para a publicação (superclasse)
    private publicacoes publicacao;

    // Referência para a mídia associada
    private midias midia;

    // Indica se há ou não uma mídia vinculada à publicação
    private boolean possuiMidia;

    // Construtor padrão
    public midiaPost() {}

    // Construtor com parâmetros
    public midiaPost(publicacoes publicacao, midias midia, boolean possuiMidia) {
        this.publicacao = publicacao;
        this.midia = midia;
        this.possuiMidia = possuiMidia;
    }

    // Getters e setters

    public publicacoes getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(publicacoes publicacao) {
        this.publicacao = publicacao;
    }

    public midias getMidia() {
        return midia;
    }

    public void setMidia(midias midia) {
        this.midia = midia;
    }

    public boolean isPossuiMidia() {
        return possuiMidia;
    }

    public void setPossuiMidia(boolean possuiMidia) {
        this.possuiMidia = possuiMidia;
    }

    // Método para exibir os dados da publicação e, se existir, da mídia associada
    public void exibirMidiaPost() {
        System.out.println("=== PUBLICAÇÃO ===");
        publicacao.exibicaoPublicacoes();

        if (possuiMidia && midia != null) {
            System.out.println("=== MÍDIA ASSOCIADA ===");
            midia.exibicaoMidias();
        } else {
            System.out.println("Nenhuma mídia associada.");
        }
    }

    // Sobrecarga: opção de exibir ou não os dados da mídia, mesmo que esteja associada
    public void exibirMidiaPost(boolean mostrarMidia) {
        System.out.println("=== PUBLICAÇÃO ===");
        publicacao.exibicaoPublicacoes();

        if (mostrarMidia && possuiMidia && midia != null) {
            System.out.println("=== MÍDIA ASSOCIADA ===");
            midia.exibicaoMidias();
        } else {
            System.out.println("Mídia: [oculta ou inexistente]");
        }
    }
}



