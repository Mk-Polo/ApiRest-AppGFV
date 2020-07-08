package com.mkpolo.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkpolo.idat.entity.Marca;
import com.mkpolo.idat.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements IMarcaService{

	@Autowired
	private MarcaRepository marcaRepository;
	
	@Override
	public List<Marca> listarMarca() {
		// TODO Auto-generated method stub
		return (List<Marca>) marcaRepository.findAll();
	}

	@Override
	public void guardar(Marca marca) {
		// TODO Auto-generated method stub
		marcaRepository.save(marca);
	}

	@Override
	public Marca buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return marcaRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		marcaRepository.deleteById(id);
	}

}
