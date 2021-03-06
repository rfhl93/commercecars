package br.univel.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.lang.Override;
import br.univel.model.Modelo;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@Entity
@Table(name = "marca")
public class Marca implements Serializable
{

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   @Column(name = "id", updatable = false, nullable = false)
   private Long id;
   @Version
   @Column(name = "version")
   private int version;

   @Column(length = 50, name = "nome", nullable = false)
   private String nomoe;

   @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
   private Set<Modelo> modelos = new HashSet<Modelo>();

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (!(obj instanceof Marca))
      {
         return false;
      }
      Marca other = (Marca) obj;
      if (id != null)
      {
         if (!id.equals(other.id))
         {
            return false;
         }
      }
      return true;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
   }

   public String getNomoe()
   {
      return nomoe;
   }

   public void setNomoe(String nomoe)
   {
      this.nomoe = nomoe;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (nomoe != null && !nomoe.trim().isEmpty())
         result += "nomoe: " + nomoe;
      return result;
   }

   public Set<Modelo> getModelos()
   {
      return this.modelos;
   }

   public void setModelos(final Set<Modelo> modelos)
   {
      this.modelos = modelos;
   }
}