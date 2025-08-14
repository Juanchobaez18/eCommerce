package com.sena.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.sena.ecommerce.model.Orden;


public interface IOrdenService {
	
	public Orden save(Orden orden);

	public Optional<Orden> get(Integer id);
	
	public void update(Orden orden);
	
	public void delete(Integer id);
	
	public List<Orden> findAll();
}
