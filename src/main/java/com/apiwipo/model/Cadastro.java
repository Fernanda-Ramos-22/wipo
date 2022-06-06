package com.apiwipo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastro implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 20)
	private String numpub;
	@Column(length = 20)
	private String pedido;
	@Column(length = 10)
	private String dtpub;
	private String requerentes; // deixar criar caracteres máximos
	@Column(length = 40)
	private String titulode;
	@Column(length = 40)
	private String tituloen;
	@Column(length = 40)
	private String titulofr;
	
	
	
	public Cadastro() {
		super();
	}



	public Cadastro(Integer id, String numpub, String pedido, String dtpub, String requerentes, String titulode,
			String tituloen, String titulofr) {
		super();
		this.id = id;
		this.numpub = numpub;
		this.pedido = pedido;
		this.dtpub = dtpub;
		this.requerentes = requerentes;
		this.titulode = titulode;
		this.tituloen = tituloen;
		this.titulofr = titulofr;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNumpub() {
		return numpub;
	}



	public void setNumpub(String numpub) {
		this.numpub = numpub;
	}



	public String getPedido() {
		return pedido;
	}



	public void setPedido(String pedido) {
		this.pedido = pedido;
	}



	public String getDtpub() {
		return dtpub;
	}



	public void setDtpub(String dtpub) {
		this.dtpub = dtpub;
	}



	public String getRequerentes() {
		return requerentes;
	}



	public void setRequerentes(String requerentes) {
		this.requerentes = requerentes;
	}



	public String getTitulode() {
		return titulode;
	}



	public void setTitulode(String titulode) {
		this.titulode = titulode;
	}



	public String getTituloen() {
		return tituloen;
	}



	public void setTituloen(String tituloen) {
		this.tituloen = tituloen;
	}



	public String getTitulofr() {
		return titulofr;
	}



	public void setTitulofr(String titulofr) {
		this.titulofr = titulofr;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		return Objects.hash(dtpub, id, numpub, pedido, requerentes, titulode, tituloen, titulofr);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return Objects.equals(dtpub, other.dtpub) && Objects.equals(id, other.id)
				&& Objects.equals(numpub, other.numpub) && Objects.equals(pedido, other.pedido)
				&& Objects.equals(requerentes, other.requerentes) && Objects.equals(titulode, other.titulode)
				&& Objects.equals(tituloen, other.tituloen) && Objects.equals(titulofr, other.titulofr);
	}
	
	
}
