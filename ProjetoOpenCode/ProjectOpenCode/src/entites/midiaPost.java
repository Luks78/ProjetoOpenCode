package entites;

public class midiaPost extends publicacoes{

   
    private String conteudo;
    private String AdicaoDeMidia;
    
    public midiaPost (){
        super();
    }
    public midiaPost(String titulo, String descricao, String dataUpload, String conteudo, String AdicaoDeMidia) {
        super(titulo, descricao, dataUpload);
        this.conteudo = conteudo;
        this.AdicaoDeMidia = AdicaoDeMidia;
    }
    
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

     public String getAdicaoDeMidia() {
        return AdicaoDeMidia;
    }

    public void setAdicaoDeMidia(String AdicaoDeMidia) {
        this.AdicaoDeMidia = AdicaoDeMidia;
    }

    
    public void exibirPublicacao() {
        System.out.println("\nPublicação Criada:");
        System.out.println("Conteúdo: " + conteudo);
        if (getAdicaoDeMidia() != null) {
            System.out.println(getAdicaoDeMidia() + "Mídia Adicionada: Vídeo");
        } else {
            System.out.println("Nenhuma mídia adicionada.");
        }
    }
}
