package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.Dristeem;

public interface DricalService {

	List<Dristeem> getdetails();

	Dristeem post(Dristeem dricalc);

	Dristeem change(Dristeem dricalc);

	String delete(Integer id);

	

}
