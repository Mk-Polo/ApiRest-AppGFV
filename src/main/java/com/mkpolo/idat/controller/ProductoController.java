package com.mkpolo.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkpolo.idat.entity.Categoria;
import com.mkpolo.idat.entity.Marca;
import com.mkpolo.idat.entity.Producto;
import com.mkpolo.idat.service.ICategoriaService;
import com.mkpolo.idat.service.IMarcaService;
import com.mkpolo.idat.service.IProductoService;

@RestController
@RequestMapping(value="/api/productos/")
@CrossOrigin("*")
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private ICategoriaService categoriaService;

	@Autowired
	private IMarcaService marcaService;
	
	@GetMapping(value="/all")
	public List<Producto> getAll(){
		return productoService.listartodos();
	}
	
	@GetMapping(value="/listaC")
	public List<Categoria> getCategoria(){
		return categoriaService.listarCategoria();
	}
	
	@GetMapping(value="/listaM")
	public List<Marca> getMarca(){
		return marcaService.listarMarca();
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<Producto> save(@RequestBody Producto producto){
		productoService.guardar(producto);
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<Producto> delete(@PathVariable Long id){
		Producto producto = productoService.buscarPorId(id);
		
		if (producto != null) {
			productoService.eliminar(id);
		}else {
			return new ResponseEntity<Producto>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);
	}
}
