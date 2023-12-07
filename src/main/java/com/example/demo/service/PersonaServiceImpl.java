package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaDao;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    PersonaDao personaDao;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    public Persona verUno(Long id) {
        return personaDao.findById(id).orElse(null);
    }

    @Override
    public Persona registrar(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    public Persona actualizar(Persona object, Long id) {
        Optional<Persona> objectExistenteOptional = personaDao.findById(id);

        if (objectExistenteOptional.isPresent()) {
            Persona personaExistente = objectExistenteOptional.get();
            personaExistente.setGenero(object.getGenero());
            personaExistente.setNombre(object.getNombre());
            personaExistente.setTipo_documento(object.getTipo_documento());
            personaExistente.setNum_documento(object.getNum_documento());
            personaExistente.setDireccion(object.getDireccion());
            personaExistente.setTelefono(object.getTelefono());
            personaExistente.setEmail(object.getEmail());

            return personaDao.save(personaExistente);
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long id) {
        personaDao.deleteById(id);
    }
    
}
