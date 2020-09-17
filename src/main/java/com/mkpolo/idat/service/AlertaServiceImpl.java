package com.mkpolo.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkpolo.idat.entity.Alerta;
import com.mkpolo.idat.repository.AlertaRepository;

@Service
public class AlertaServiceImpl implements IAlertaService{

	@Autowired
	private AlertaRepository alertaRepository;
	
	@Override
	public List<Alerta> listarAlerta() {
		// TODO Auto-generated method stub
		return (List<Alerta>) alertaRepository.findAll();
	}

	@Override
	public void guardar(Alerta alerta) {
		alertaRepository.save(alerta);		
	}

	@Override
	public Alerta buscarPorId(Long id) {
		return alertaRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		alertaRepository.deleteById(id);
	}

	@Override
	public List<Alerta> listarPorEstado(String estado) {
		// TODO Auto-generated method stub
		return (List<Alerta>) alertaRepository.findByEstado(estado);
	}

}
