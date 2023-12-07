package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioDao;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    UsuarioDao usuarioDao;

    @Override
    public List<Usuario> listar() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public Usuario verUno(Long id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    public Usuario registrar(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public Usuario actualizar(Usuario object, Long id) {
        Optional<Usuario> objectExisteneteOptional = usuarioDao.findById(id);

        if (objectExisteneteOptional.isPresent()) {
            Usuario usuarioExistente = objectExisteneteOptional.get();

            usuarioExistente.setNombre(object.getNombre());
            usuarioExistente.setEmail(object.getEmail());
            usuarioExistente.setPassword(object.getPassword());

            return usuarioDao.save(usuarioExistente);
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long id) {
        usuarioDao.deleteById(id);
    }


}
