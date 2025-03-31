package entites;

public class App {
    public static void main(String[] args) {
        midias myMidia = new midias("Java para iniciantes", "Curso básico de Java", "Mês Agosto", "Videos", 12);
        
        myMidia.exibicaoMidias();
        
        usuario myUsuario = new usuario("Projeto", "Gerenciamento Hospitalar com POO e Java Web", "Mês Janeiro", "Ben", "Dev Sênior");
      
        myUsuario.exibicaoUsuario();
        
        avaliacao myAvaliacao = new avaliacao("Site que armazena dados", "Desenvolvido em Pyhton", "Mês Dezembro", 12, 10);
        
        myAvaliacao.exibicaoAvaliacao();
        
        midiaPost myPost = new midiaPost("Video aula", "Sobre Algoritmos e Lógica de Progamação", "Mês Março", "Lógica de Programação", "");
        
        myPost.exibirPublicacao();
    }
}
