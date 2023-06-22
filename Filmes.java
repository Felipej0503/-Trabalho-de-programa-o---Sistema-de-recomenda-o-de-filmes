import java.util.Scanner;

public class Filmes
{   
    public static void perguntarGenerosPreferidos() // Método que pergunta os gêneros preferidos do usuário
    {
        Scanner in = new Scanner(System.in);
        
        int qntdDeGenerosPermitidos = 3; // limita a quantidade de gêneros escolhidos.
        String[] generosPreferidos = new String[qntdDeGenerosPermitidos]; // um array que armazena os gêneros que o usuário escolheu.
        String generoDigitado; // variável para guardar o gênero digitado e guarda dentro do array.
        
        System.out.print("Digite alguns dos seus gêneros preferidos com base nesta lista: ");
        System.out.println("\n=============================================\n");
        System.out.println("Gêneros:\n");
        System.out.print(" - Terror\n - Comédia\n - Ação\n - Aventura\n - Suspense\n - Drama\n - Musical\n"); 
        System.out.print(" - Ficção científica\n - Romance\n - Fantasia\n");
        System.out.println("\n=============================================\n");
        for(int i = 0; i < qntdDeGenerosPermitidos; i++) // loop para percorrer o array e preencher os espaços vazios
        {
            generoDigitado = in.nextLine();
            generosPreferidos[i] = generoDigitado;
        }
        System.out.println("\nBoas escolhas!\n");
        System.out.println("\n=============================================");
    }  
    
    public static void perguntarAtoresPreferidos() // Método que pergunta os atores preferidos do usuário
    {
        Scanner in = new Scanner(System.in);
        
        int qntdDeAtoresPermitidos = 3; // limita a quantidade de atores escolhidos.
        String[] atoresPreferidos = new String[qntdDeAtoresPermitidos]; // um array que armazena os atores que o usuário escolheu.
        String atorDigitado; // variável para guardar o ator digitado e guarda dentro do array.
        
        System.out.print("Digite alguns dos seus atores preferidos com base nesta lista: ");
        System.out.println("\n=============================================\n");
        System.out.println("Atores:\n");
        System.out.print(" - Leonardo DiCaprio\n - Cuba Gooding Jr.\n - Ryan Gosling\n - Tom Hanks\n - Bradley Cooper\n - Ryan Reynolds\n");
        System.out.print(" - Johnny Depp\n - Matt Damon\n - Denzel Washington\n - Morgan Freeman\n"); 
        System.out.println("\n=============================================\n");
        
        for(int i = 0; i < qntdDeAtoresPermitidos; i++) // loop para percorrer o array e preencher os espaços vazios
        {
            atorDigitado = in.nextLine();
            atoresPreferidos[i] = atorDigitado;
        }
        System.out.println("\nÓtimo!\n");
        System.out.println("\n=============================================");
    }   
    
    public static void perguntarDiretoresPreferidos() // Método que pergunta os diretores preferidos do usuário
    {
        Scanner in = new Scanner(System.in);
        
        int qntdDeDiretoresPermitidos = 3; // limita a quantidade de diretores escolhidos.
        String[] diretoresPreferidos = new String[qntdDeDiretoresPermitidos]; // um array que armazena os diretores que o usuário escolheu.
        String diretorDigitado; // variável para guardar o diretor digitado e guarda dentro do array.
        
        
        System.out.println("Estamos quase acabando!");
        System.out.print("Digite alguns dos seus diretores preferidos com base nesta lista: ");
        System.out.println("\n=============================================\n");
        System.out.println("Diretores:\n");
        System.out.print(" - Steven Spielberg\n - Quentin Tarantino\n - Martin Scorsese\n - Tim Burton\n - Francis Ford Coppola\n - James Cameron\n"); 
        System.out.printf("- Christopher Nolan\n - David Fincher\n - Woody Allen\n - Spike Lee\n");
        System.out.println("\n=============================================\n");
        for(int i = 0; i < qntdDeDiretoresPermitidos; i++) // loop para percorrer o array e preencher os espaços vazios
        {
            diretorDigitado = in.nextLine();
            diretoresPreferidos[i] = diretorDigitado;
        }
        System.out.println("\n=============================================");
    }
    
     public static void perguntarDuracaoPreferida() // Método que pergunta a duracao preferida do usuário
    {
        Scanner in = new Scanner(System.in);
        
        String duracaoPreferida;
        int duracaoDigitada;
        
        System.out.println("\n=============================================\n");
        System.out.print("Digite a sua duração preferida para filmes:\n");
        duracaoDigitada = in.nextInt();
        
        if(duracaoDigitada <= 40)
        {
            duracaoPreferida = "filmes curtos";
            
        } else if(duracaoDigitada > 40 && duracaoDigitada <= 60) {
            duracaoPreferida = "filmes intermediários";
            
        } else if(duracaoDigitada > 60 && duracaoDigitada <= 130) {
            duracaoPreferida = "longa-metragem";
            
        } else {
            duracaoPreferida = "épicos";            
        }
        System.out.println("\n=============================================");
    } 
}   