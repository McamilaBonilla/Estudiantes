public class Main{
    public static void main(String[] args) {
        Estudiante Vanesa = new Estudiante("Vanesa", 16, "Octavo");
        System.out.println("Estudiante: " + Vanesa.getNombre() + ", Edad: " + Vanesa.getEdad() + ", Grado: " + Vanesa.getGrado());

        Profesor Arle = new Profesor("Arle", 49, 4500000);
        System.out.println("Profesor: " + Arle.getNombre() + ", Edad: " + Arle.getEdad() + ", Salario: " + Arle.getSalario());
    }
}