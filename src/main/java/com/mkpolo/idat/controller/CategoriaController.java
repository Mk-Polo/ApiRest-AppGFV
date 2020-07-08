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
import com.mkpolo.idat.service.ICategoriaService;

@RestController
@RequestMapping(value="/api/categorias/")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	ICategoriaService categoriaService;
	
	@GetMapping(value="/all")
	public List<Categoria> getAll(){
		return categoriaService.listarCategoria();
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<Categoria> guardar(@RequestBody Categoria categoria){
		categoriaService.guardar(categoria);
		return new ResponseEntity<Categoria>(categoria,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<Categoria> delete(@PathVariable Long id){
		Categoria categoria = categoriaService.buscarPorId(id);
		
		if(categoria != null) {
			categoriaService.eliminar(id);
		} else {
			return new ResponseEntity<Categoria>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Categoria>(categoria,HttpStatus.OK);
	}

}
