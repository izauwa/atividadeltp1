public class Autor {
    
private String nome;
private String email;
private Character genero;  {
    
}

public Autor(String nome, String email, Character genero) {
    this.nome = nome;
    this.email = email;
    this.genero = genero;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public Character getGenero() {
    return genero;
}

public void setGenero(Character genero) {
    this.genero = genero;
}

@Override
public String toString() {
    return "Autor [email=" + email + ", genero=" + genero + ", nome=" + nome + "]";
}


}





