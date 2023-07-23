package postwork1.Bedu.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name ="technology")
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String slug;

    private String description;

    private String imagen;


    //GetterAndSetter


    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }
    //Constructor


    public Technology(Integer id, String name, String slug, String description, String imagen) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", description='" + description + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technology that = (Technology) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(slug, that.slug) && Objects.equals(description, that.description) && Objects.equals(imagen, that.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, slug, description, imagen);
    }
}
