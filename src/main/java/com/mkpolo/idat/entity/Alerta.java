package com.mkpolo.idat.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alerta")
public class Alerta  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String estado;

	public Alerta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alerta(Long id, String estado, Date vencimiento) {
		super();
		this.id = id;
		this.estado = estado;
		this.vencimiento = vencimiento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Alerta [id=" + id + ", estado=" + estado + ", vencimiento=" + vencimiento + "]";
	}

}
