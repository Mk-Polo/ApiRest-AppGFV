package com.mkpolo.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkpolo.idat.entity.Categoria;
import com.mkpolo.idat.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<Categoria> listarCategoria() {
		// TODO Auto-generated method stub
		return (List<Categoria>) categoriaRepository.findAll();
	}

	@Override
	public void guardar(Categoria categoria) {
		categoriaRepository.save(categoria);		
	}

	@Override
	public Categoria buscarPorId(Long id) {
		return categoriaRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		categoriaRepository.deleteById(id);
	}

}
