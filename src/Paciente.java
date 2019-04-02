public class Paciente implements Comparable {
    String nombre;
    String sintoma;
    String codigo; //A a E

    Paciente (String nombre, String sintoma, String codigo) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigo = codigo;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return nombre + " " + sintoma + " " + codigo;
    }
}
