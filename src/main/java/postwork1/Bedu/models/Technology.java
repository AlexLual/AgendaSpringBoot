package postwork1.Bedu.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name ="technology")
@Getter
@Setter
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private double salario;

    private String descripcion;

    private String imagen;

    @ManyToOne
    private Usuario usuario;

    //GetterAndSetter


    public Technology(Integer id, String nombre, double salario, String descripcion, String imagen, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technology that = (Technology) o;
        return Double.compare(that.salario, salario) == 0 && Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && Objects.equals(descripcion, that.descripcion) && Objects.equals(imagen, that.imagen) && Objects.equals(usuario, that.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, salario, descripcion, imagen, usuario);
    }

    //Constructor
    public Technology() {




    }


    @Override
    public String toString() {
        return "Technology{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
