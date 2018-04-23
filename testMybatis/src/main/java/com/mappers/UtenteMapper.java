package com.mappers;

import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.model.testForm.Utente;

public interface UtenteMapper extends GenericMapper<Utente>{

	public HashMap<String,Object> selectEmail(@Param("email") String email);
	public void register(Utente u);
	
}
