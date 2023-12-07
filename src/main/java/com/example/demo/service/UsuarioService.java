package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;


@Service
public interface UsuarioService {
    public List<Usuario> listar();
	
	public Usuario verUno(Long id);

    public Usuario registrar(Usuario usuario);

    public Usuario actualizar(Usuario usuario, Long id);

    public void eliminar(Long id);

}
