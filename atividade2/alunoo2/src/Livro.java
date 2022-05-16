public class Livro {
  
  private String nome;
  private Autor autor;  
  private double preço;
  private int quantidade = 0;

  
  public Livro(String nome, Autor autor, double preço, int quantidade) {
    this.nome = nome;
    this.autor = autor;
    this.preço = preço;
    this.quantidade = quantidade;
}

public Livro(String name, Autor author, double price) {
    this.nome = nome;
    this.autor = autor;
    this.preço = preço;
}


public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public Autor getAutor() {
    return autor;
}


public void setAutor(Autor autor) {
    this.autor = autor;
}


public double getPreço() {
    return preço;
}


public void setPreço(double preço) {
    this.preço = preço;
}


public int getQuantidade() {
    return quantidade;
}


public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}

@Override
public String toString() {
    return "Livro [autor=" + autor + ", nome=" + nome + ", preço=" + preço + ", quantidade=" + quantidade + "]";
}



}

  
    

