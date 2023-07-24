package postwork1.Bedu.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name ="Usuario")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String lastName;

    private String email;

    private String tipo;


    @OneToMany(mappedBy = "usuario")
    private List<Technology> technology;
public Usuario(){

}

    public Usuario(Integer id, String name, String lastName, String email, String tipo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.tipo = tipo;

    }




    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", tipo='" + tipo + '\'' +
                ", technologies=" + technology +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(name, usuario.name) && Objects.equals(lastName, usuario.lastName) && Objects.equals(email, usuario.email) && Objects.equals(tipo, usuario.tipo) && Objects.equals(technology, usuario.technology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, email, tipo, technology);
    }
}

