public class Alumno {
    String nombre, apellidos, dni;
    int matricula;

    @Override
    public String toString() {
        return "Alumno{}";
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {this.nombre = nombre; }
    public String getApellidos() {return apellidos; }
    public void setApellidos(String apellidos) {this.apellidos = apellidos; }
    public String getDni() {return dni; }
    public void setDni(String dni) {this.dni = dni; }
    public int getMatricula() {return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public Alumno(String nombre, String apellidos, String dni, int matricula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.matricula = matricula;
    }
}

