package com.cplsys.aisa.dao;

import java.util.List;

import com.cplsys.aisa.domain.Modulo;

public interface ModuloDAO {

	void save(Modulo modulo);

	void delete(Modulo modulo);

	List<Modulo> getAll();

}
