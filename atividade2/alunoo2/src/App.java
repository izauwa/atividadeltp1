public class App {
    
        public static void main(String[]  args) {

            
            Autor autor =  new  Autor("Guilhermo del Toro", "deltoro@gmail.com", 'm');
            Autor autor2 = new Autor( "Bianca Barros", "biancabrr@gmail.com", 'f');
            
            Livro livro =  new Livro("O Labirinto do Fauno", autor, 45,90);
            Livro livro2 = new Livro("Sunkissed", autor2, 29.99, 12);
            
            livro.setQuantidade(27);
    
            System.out.println("\nAutor\nNome: "+autor.getNome()+"\nEmail: "+autor.getEmail()+"\nGênero (f ou m): "+autor.getGenero());
            System.out.println("\nTestando o método toString()\n");
            System.out.println(autor.toString());
    
            System.out.println("Autor\nNome: "+autor2.getNome()+"\nEmail: "+autor2.getEmail()+"\nGênero (f ou m): "+autor2.getGenero());
            System.out.println("\nTestando o método toString()\n");
            System.out.println(autor2.toString());
    
            System.out.println("\nLivro\nTítulo: "+livro.getNome()+"\n"+livro.getAutor()+"\nPreço: "+livro.getPreço()+"\nQuantidade: "+livro.getQuantidade());
            System.out.println("\nTestando o método toString()\n");
            System.out.println(livro.toString());
    
            System.out.println("\nLivro\nTítulo: "+livro2.getNome()+"\n"+livro2.getAutor()+"\nPreço: "+livro2.getPreço()+"\nQuantidade: "+livro2.getQuantidade());
            System.out.println("\nTestando o método toString()\n");
            System.out.println(livro2.toString());
        }

     
 

}
