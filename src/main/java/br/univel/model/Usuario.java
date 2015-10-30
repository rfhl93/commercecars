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

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable
{

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   @Column(name = "id", updatable = false, nullable = false)
   private Long id;
   @Version
   @Column(name = "version")
   private int version;

   @Column(length = 100, name = "nome", nullable = false)
   private String Nome;

   @Column(length = 100, name = "sobrenome", nullable = false)
   private String Sobrenome;

   @Column(name = "email", nullable = false)
   private String Email;

   @Column(length = 32, name = "senha", nullable = false)
   private String Senha;

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
      if (!(obj instanceof Usuario))
      {
         return false;
      }
      Usuario other = (Usuario) obj;
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

   public String getNome()
   {
      return Nome;
   }

   public void setNome(String Nome)
   {
      this.Nome = Nome;
   }

   public String getSobrenome()
   {
      return Sobrenome;
   }

   public void setSobrenome(String Sobrenome)
   {
      this.Sobrenome = Sobrenome;
   }

   public String getEmail()
   {
      return Email;
   }

   public void setEmail(String Email)
   {
      this.Email = Email;
   }

   public String getSenha()
   {
      return Senha;
   }

   public void setSenha(String Senha)
   {
      this.Senha = Senha;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (Nome != null && !Nome.trim().isEmpty())
         result += "Nome: " + Nome;
      if (Sobrenome != null && !Sobrenome.trim().isEmpty())
         result += ", Sobrenome: " + Sobrenome;
      if (Email != null && !Email.trim().isEmpty())
         result += ", Email: " + Email;
      if (Senha != null && !Senha.trim().isEmpty())
         result += ", Senha: " + Senha;
      return result;
   }
}