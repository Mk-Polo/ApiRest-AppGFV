package com.mkpolo.idat.service;

import java.util.List;
import com.mkpolo.idat.entity.Alerta;

public interface IAlertaService {

	public List<Alerta> listarAlerta();
	
	public void guardar (Alerta alerta);
	
	public Alerta buscarPorId(Long id);
	
	public void eliminar(Long id);
	
}
