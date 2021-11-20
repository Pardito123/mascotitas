package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dueno")
public class Dueno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDueno;
	
	@Column(name="nombrePropietario", length=60, nullable=false)
	private String nameMaster;

	public Dueno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dueno(int idDueno, String nameMaster) {
		super();
		this.idDueno = idDueno;
		this.nameMaster = nameMaster;
	}

	public int getIdDueno() {
		return idDueno;
	}

	public void setIdDueno(int idDueno) {
		this.idDueno = idDueno;
	}

	public String getNameMaster() {
		return nameMaster;
	}

	public void setNameMaster(String nameMaster) {
		this.nameMaster = nameMaster;
	}

}
