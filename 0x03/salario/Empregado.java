public class Empregado {
    double salarioFixo;

    public double calcularBonus(Departamento departamento){
        if (departamento.alcancouMeta()){
            return salarioFixo * 0.1;
        }
        return 0;
    }

    public double calcularSalarioTotal(Departamento departamento){
        return (salarioFixo + calcularBonus(departamento));
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
