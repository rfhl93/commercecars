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
import br.univel.model.Compra;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import br.univel.model.Venda;

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
   private String nome;

   @Column(length = 100, name = "sobrenome", nullable = false)
   private String sobrenome;

   @Column(name = "email", nullable = false)
   private String email;

   @Column(length = 32, name = "senha", nullable = false)
   private String senha;

   @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
   private Set<Compra> compras = new HashSet<Compra>();

   @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
   private Set<Venda> vendas = new HashSet<Venda>();

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
      return nome;
   }

   public void setNome(String Nome)
   {
      this.nome = Nome;
   }

   public String getSobrenome()
   {
      return sobrenome;
   }

   public void setSobrenome(String Sobrenome)
   {
      this.sobrenome = Sobrenome;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String Email)
   {
      this.email = Email;
   }

   public String getSenha()
   {
      return senha;
   }

   public void setSenha(String Senha)
   {
      this.senha = Senha;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (nome != null && !nome.trim().isEmpty())
         result += "Nome: " + nome;
      if (sobrenome != null && !sobrenome.trim().isEmpty())
         result += ", Sobrenome: " + sobrenome;
      if (email != null && !email.trim().isEmpty())
         result += ", Email: " + email;
      if (senha != null && !senha.trim().isEmpty())
         result += ", Senha: " + senha;
      return result;
   }

   public Set<Compra> getCompras()
   {
      return this.compras;
   }

   public void setCompras(final Set<Compra> compras)
   {
      this.compras = compras;
   }

   public Set<Venda> getVendas()
   {
      return this.vendas;
   }

   public void setVendas(final Set<Venda> vendas)
   {
      this.vendas = vendas;
   }
}