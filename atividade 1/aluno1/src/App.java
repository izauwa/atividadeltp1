public class App {
    public static void main(String[] args) throws Exception {
        
        
        Livro livro1;
        livro1= new Livro ("O labirinto do Fauno", 2019,  "Guilhermo del Toro");

        
        System.out.println(livro1.getAno());
        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getAutor());
    }
}

