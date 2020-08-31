package com.mkpolo.idat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mkpolo.idat.entity.Alerta;

@Repository
public interface AlertaRepository extends CrudRepository<Alerta, Long>{

}
