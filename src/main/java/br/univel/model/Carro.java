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
@Table(name = "carro")
public class Carro implements Serializable
{

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   @Column(name = "id", updatable = false, nullable = false)
   private Long id;
   @Version
   @Column(name = "version")
   private int version;

   @Column(length = 100, name = "descricao", nullable = false)
   private String descricao;

   @Column(length = 4, name = "ano", nullable = false)
   private int ano;

   @Column(length = 7, name = "km", nullable = false)
   private String km;

   @Column(length = 50, name = "cor", nullable = false)
   private String cor;

   @Column(length = 2, name = "portas", nullable = false)
   private String portas;

   @Column(length = 50, name = "combustivel", nullable = false)
   private String combustivel;

   @Column(length = 50, name = "cambio", nullable = false)
   private String cambio;

   @Column(length = 1, name = "finalPlaca", nullable = false)
   private String finalPlaca;

   @Column(length = 50, name = "carroceria", nullable = false)
   private String carroceria;

   @Column(length = 10, name = "dataAnuncio", nullable = false)
   private String dataAnuncio;

   @Column(length = 100, name = "cidade", nullable = false)
   private String cidade;

   @Column(length = 15, name = "valor", nullable = false)
   private Double valor;

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
      if (!(obj instanceof Carro))
      {
         return false;
      }
      Carro other = (Carro) obj;
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

   public String getDescricao()
   {
      return descricao;
   }

   public void setDescricao(String Descricao)
   {
      this.descricao = Descricao;
   }

   public int getAno()
   {
      return ano;
   }

   public void setAno(int ano)
   {
      this.ano = ano;
   }

   public String getKm()
   {
      return km;
   }

   public void setKm(String km)
   {
      this.km = km;
   }

   public String getCor()
   {
      return cor;
   }

   public void setCor(String cor)
   {
      this.cor = cor;
   }

   public String getPortas()
   {
      return portas;
   }

   public void setPortas(String portas)
   {
      this.portas = portas;
   }

   public String getCombustivel()
   {
      return combustivel;
   }

   public void setCombustivel(String combustivel)
   {
      this.combustivel = combustivel;
   }

   public String getCambio()
   {
      return cambio;
   }

   public void setCambio(String cambio)
   {
      this.cambio = cambio;
   }

   public String getFinalPlaca()
   {
      return finalPlaca;
   }

   public void setFinalPlaca(String finalPlaca)
   {
      this.finalPlaca = finalPlaca;
   }

   public String getCarroceria()
   {
      return carroceria;
   }

   public void setCarroceria(String carroceria)
   {
      this.carroceria = carroceria;
   }

   public String getDataAnuncio()
   {
      return dataAnuncio;
   }

   public void setDataAnuncio(String dataAnuncio)
   {
      this.dataAnuncio = dataAnuncio;
   }

   public String getCidade()
   {
      return cidade;
   }

   public void setCidade(String cidade)
   {
      this.cidade = cidade;
   }

   public Double getValor()
   {
      return valor;
   }

   public void setValor(Double valor)
   {
      this.valor = valor;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (descricao != null && !descricao.trim().isEmpty())
         result += "descricao: " + descricao;
      result += ", ano: " + ano;
      if (km != null && !km.trim().isEmpty())
         result += ", km: " + km;
      if (cor != null && !cor.trim().isEmpty())
         result += ", cor: " + cor;
      if (portas != null && !portas.trim().isEmpty())
         result += ", portas: " + portas;
      if (combustivel != null && !combustivel.trim().isEmpty())
         result += ", combustivel: " + combustivel;
      if (cambio != null && !cambio.trim().isEmpty())
         result += ", cambio: " + cambio;
      if (finalPlaca != null && !finalPlaca.trim().isEmpty())
         result += ", finalPlaca: " + finalPlaca;
      if (carroceria != null && !carroceria.trim().isEmpty())
         result += ", carroceria: " + carroceria;
      if (dataAnuncio != null && !dataAnuncio.trim().isEmpty())
         result += ", dataAnuncio: " + dataAnuncio;
      if (cidade != null && !cidade.trim().isEmpty())
         result += ", cidade: " + cidade;
      if (valor != null)
         result += ", valor: " + valor;
      return result;
   }
}