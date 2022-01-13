package com.jb.api.logistica.entidad;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="terres")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Terrestre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer guia;
	private String nombre;
	private String celular;
	private String tipo;
	private int cantidad;
	 private Calendar fechaRegistro;
	 private Calendar fechaEntrega;
	 private String BodegaEntrega;
	 private int precio;
	 private String placa;
	
	 public Terrestre() {
		 
	 }

	public Integer getGuia() {
		return guia;
	}

	public void setGuia(Integer guia) {
		this.guia = guia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Calendar getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Calendar fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Calendar getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Calendar fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getBodegaEntrega() {
		return BodegaEntrega;
	}

	public void setBodegaEntrega(String bodegaEntrega) {
		BodegaEntrega = bodegaEntrega;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Terrestre [guia=" + guia + ", nombre=" + nombre + ", celular=" + celular + ", tipo=" + tipo
				+ ", cantidad=" + cantidad + ", fechaRegistro=" + fechaRegistro + ", fechaEntrega=" + fechaEntrega
				+ ", BodegaEntrega=" + BodegaEntrega + ", precio=" + precio + ", placa=" + placa + "]";
	}

}
