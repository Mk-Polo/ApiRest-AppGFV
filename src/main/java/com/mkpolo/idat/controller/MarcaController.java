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
import com.mkpolo.idat.entity.Marca;
import com.mkpolo.idat.service.IMarcaService;

@RestController
@RequestMapping(value="/api/marcas/")
@CrossOrigin("*")
public class MarcaController {

	@Autowired
	private IMarcaService marcaService;
	
	@GetMapping(value="/all")
	public List<Marca> getAll(){
		return marcaService.listarMarca();
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<Marca> guardar(@RequestBody Marca marca){
		marcaService.guardar(marca);
		return new ResponseEntity<Marca>(marca, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<Marca> delete(@PathVariable Long id){
		Marca marca = marcaService.buscarPorId(id);
		
		if (marca != null) {
			marcaService.eliminar(id);
		}else {
			return new ResponseEntity<Marca>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Marca>(marca, HttpStatus.OK);
	}
	
}
