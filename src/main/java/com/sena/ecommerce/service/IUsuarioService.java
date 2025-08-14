package com.sena.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.sena.ecommerce.model.Usuario;

public interface IUsuarioService {
	
	//CRUD
	
	public Usuario save(Usuario usuario); // create
	
	public Optional<Usuario> get(Integer id); //read
	
	public void update(Usuario usuario); //update
	
	public void delete(Integer id); //delete

	 Optional<Usuario> findById(Integer id);
	
	 Optional<Usuario> findByEmail(String email);
	 
	 List<Usuario> findAll();
	
}
