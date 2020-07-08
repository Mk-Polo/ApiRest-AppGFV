package com.mkpolo.idat.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Marca")
public class Marca implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMarca;
	
	private String marca;
	
	public Marca() {
		// TODO Auto-generated constructor stub
	}

	public Marca(Long idMarca, String marca) {
		super();
		this.idMarca = idMarca;
		this.marca = marca;
	}

	public Long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Marca [idMarca=" + idMarca + ", marca=" + marca + "]";
	}

}
