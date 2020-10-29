package alura.model;

public class CursoTipo {
    private String nombre;
    private int horas;
    private int tipo;

    public CursoTipo(String nombre, int horas, int tipo) {
        this.nombre = nombre;
        this.horas = horas;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    @Override
    public String toString() {
        return this.nombre.concat(" - ").concat(String.valueOf(this.getHoras()));
    }
}
