package pe.edu.upc.spring.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.spring.model.Pet;

public interface IPetService {
	public boolean grabar(Pet pet);
	//public boolean modificar(Race race);
	public void eliminar(int idPet);
	public Optional<Pet> listarId(int idPet);
	public Optional<Pet> buscarId(int idPet);
	public List<Pet> listar();
	public List<Pet> buscarNombre(String namePet);	
	public List<Pet> buscarRaza(String nameRaza);
	public List<Pet> buscarPropietario(String nameMaster);
	
}
