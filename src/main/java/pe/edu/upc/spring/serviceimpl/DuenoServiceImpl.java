package pe.edu.upc.spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.spring.model.Dueno;
import pe.edu.upc.spring.repository.IDuenoRepository;
import pe.edu.upc.spring.service.IDuenoService;

@Service
public class DuenoServiceImpl implements IDuenoService {

	@Autowired
	private IDuenoRepository dDueno;
	
	@Override
	@Transactional
	public boolean grabar(Dueno dueno) {
		Dueno objDueno = dDueno.save(dueno);
		if (objDueno == null)
			return false;
		else
			return true;
	}

	//@Override
	//@Transactional
	//public boolean modificar(Dueno dueno) {
		//boolean flag = false;
		//try {
			//dDueno.save(dueno);
			//flag = true;
		//}
		//catch(Exception ex) {
			//System.out.println("Ocurrio un roche, LUZ ROJA");
	//	}
		//return flag;
	//}

	@Override
	@Transactional
	public void eliminar(int idDueno) {
		dDueno.deleteById(idDueno);		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Dueno> listarId(int idDueno) {
		return dDueno.findById(idDueno);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Dueno> listar() {
		return dDueno.findAll();
	}

	

}
