package com.mkpolo.idat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mkpolo.idat.entity.Marca;

@Repository
public interface MarcaRepository extends CrudRepository<Marca, Long>{

}
