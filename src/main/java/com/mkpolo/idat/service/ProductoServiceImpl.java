package com.mkpolo.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkpolo.idat.entity.Producto;
import com.mkpolo.idat.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> listartodos() {
		
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public void guardar(Producto producto) {
		productoRepository.save(producto);
	}

	@Override
	public Producto buscarPorId(Long id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {		
		productoRepository.deleteById(id);
	}

}
