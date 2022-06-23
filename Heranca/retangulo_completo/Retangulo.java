public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public double area(){
        return (altura * largura);
    }

    @Override
    public String toString(){
        return String.format("[Retangulo] %.2f / %.2f", getLargura(), getAltura());
    }

    public void setAltura(double altura) {
        if(altura < 0){
            throw new IllegalArgumentException ("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }

    public void setLargura(double largura) {
        if (largura < 0){
            throw new IllegalArgumentException ("Largura deve ser maior ou igual a 0");
        }
        this.largura = largura;
    }
}
