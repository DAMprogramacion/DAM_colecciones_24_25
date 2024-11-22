package videos.listas;

import java.util.Objects;

public record Persona(String nombre, String apellidos, String dni) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        Persona persona = (Persona) o;
        return Objects.equals ( dni, persona.dni );
    }

    @Override
    public int hashCode() {
        return Objects.hashCode ( dni );
    }

    @Override
    public String toString() {
        return String.format ( "%s: %S, %s", dni, apellidos, nombre );
    }
}
