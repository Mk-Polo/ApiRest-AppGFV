package com.mkpolo.idat.service;

import java.util.List;

import com.mkpolo.idat.entity.Marca;


public interface IMarcaService {
	
	public List<Marca> listarMarca();
	
	public void guardar (Marca marca);
	
	public Marca buscarPorId(Long id);
	
	public void eliminar(Long id);
	
}
