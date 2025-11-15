public class Profesor extends Usuario {
    private int Salario;

    public Profesor(String nombre, int edad, int salario) {
        super(nombre, edad);
        this.Salario = salario;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }
}
