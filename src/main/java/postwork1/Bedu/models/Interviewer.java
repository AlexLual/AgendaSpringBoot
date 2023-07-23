package postwork1.Bedu.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name ="Interviewer")
public class Interviewer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   private String name;

   private String lastName;

   private String email;

   private boolean isActivate;

   private boolean isAdmin;

   //GetterAndSetter


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

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public boolean isActivate() {
      return isActivate;
   }

   public void setActivate(boolean activate) {
      isActivate = activate;
   }

   public boolean isAdmin() {
      return isAdmin;
   }

   public void setAdmin(boolean admin) {
      isAdmin = admin;
   }
   //Constructor

   public Interviewer(Integer id, String name, String lastName, String email, boolean isActivate, boolean isAdmin) {
      this.id = id;
      this.name = name;
      this.lastName = lastName;
      this.email = email;
      this.isActivate = isActivate;
      this.isAdmin = isAdmin;
   }


   //ToString

   @Override
   public String toString() {
      return "Interviewer{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", lastName='" + lastName + '\'' +
              ", email='" + email + '\'' +
              ", isActivate=" + isActivate +
              ", isAdmin=" + isAdmin +
              '}';
   }
   //Equals


   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Interviewer that = (Interviewer) o;
      return isActivate == that.isActivate && isAdmin == that.isAdmin && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, lastName, email, isActivate, isAdmin);
   }



}
