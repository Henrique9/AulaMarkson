public abstract class Livraria implements ILivraria {
    private String titulo, marca;
    private double preco;
    
    Livraria(String titulo, String marca, double preco){
        this.setMarca(marca);
        this.setPreco(preco);
        this.setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
