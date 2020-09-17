package com.mkpolo.idat.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Productos")
public class Producto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProducto;
	
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;

	@ManyToOne
	@JoinColumn(name="marca_id")
	private Marca marca;
	
	@Column
	private String producto;
	
	@Column
	private Long barra;
	
	@Column
	private String peso;
	
	@Column
	private String acciones;
	
	@Column
	private int dias;
	
	@Column
	private String imagen;

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(Long idProducto, Categoria categoria, Marca marca, String producto, Long barra, String peso,
			String acciones, int dias, String imagen) {
		super();
		this.idProducto = idProducto;
		this.categoria = categoria;
		this.marca = marca;
		this.producto = producto;
		this.barra = barra;
		this.peso = peso;
		this.acciones = acciones;
		this.dias = dias;
		this.imagen = imagen;
	}

	public Long getBarra() {
		return barra;
	}

	public void setBarra(Long barra) {
		this.barra = barra;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getAcciones() {
		return acciones;
	}

	public void setAcciones(String acciones) {
		this.acciones = acciones;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", categoria=" + categoria + ", marca=" + marca + ", producto="
				+ producto + ", peso=" + peso + ", acciones=" + acciones + ", dias=" + dias + ", imagen=" + imagen
				+ "]";
	}

}
