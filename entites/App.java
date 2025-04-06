package entites;

public class App {
    public static void main(String[] args) {
   // Publicação com mídia associada
   midias midia1 = new midias("Java para iniciantes", "Curso básico de Java", "05/08/2025", "Vídeo", 120);
   avaliacao avaliacao1 = new avaliacao("Curso", "Muito empolgante!", "06/04/2025", 20250406, 10);
   midiaPost associacaoComMidia = new midiaPost(avaliacao1, midia1, true);
   usuario usuario1 = new usuario("Java para iniciantes", "Comentário: Achei incrível, muito didático!", "06/04/2025", "Ben Afleck de Souza", "Aluno");

   System.out.println("=== PUBLICAÇÃO COM MÍDIA ===");
   associacaoComMidia.exibirMidiaPost(); // Chamada do método padrão

   System.out.println("--- USUÁRIO QUE COMENTOU ---");
   usuario1.exibicaoUsuario();


            // Publicação sem mídia associada
            avaliacao avaliacao2 = new avaliacao("Java para iniciantes", "Preparação do curso", "05/08/2025", 20250805, 4);
            midiaPost associacaoSemMidia = new midiaPost(avaliacao2, null, false);
            usuario usuario2 = new usuario("Java para iniciantes", "Comentário: Espero ansiosamente!", "10/008/2025", "Ben Afleck de Souza", "Aluno");
    
            System.out.println("\n=== PUBLICAÇÃO SEM MÍDIA ===");
            associacaoSemMidia.exibirMidiaPost(); // Chamada do método padrão
    
            System.out.println("--- USUÁRIO QUE COMENTOU ---");
            usuario2.exibicaoUsuario();
    
            // Agora chamando a SOBRECARGA do método: forçar esconder mídia
            System.out.println("\n=== Comentário  ===");
            associacaoComMidia.exibirMidiaPost(false); // usando a versão sobrecarregada
    
            // E agora forçando mostrar mídia mesmo que seja null (teste de segurança)
            System.out.println("\n=== Comentário  ===");
            associacaoSemMidia.exibirMidiaPost(true); // usando a versão sobrecarregada

             // POLIMORFISMO VIA INTERFACE 
             System.out.println("\n=== EXIBIÇÃO VIA INTERFACE Exibivel ===");
             Exibivel[] elementos = {
                 avaliacao1,
                 midia1,
                 usuario1,
                 avaliacao2,
                 usuario2
             };
     
             for (Exibivel elemento : elementos) {
                 elemento.exibir();
                 System.out.println("---------------------------");
             }
     
        }
    }
    
