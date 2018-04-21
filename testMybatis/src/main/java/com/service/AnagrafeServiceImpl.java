package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mappers.AnagrafeDisciplinaMapper;
import com.mappers.CorsoMapper;
import com.model.AnagrafeDisciplina;
import com.model.Corso;

@Service("anagrafeService")
public class AnagrafeServiceImpl implements AnagrafeService{

	@Autowired
	AnagrafeDisciplinaMapper anagrafeMapper;
	
	@Autowired
	CorsoMapper corsoMapper;
	
	@Transactional
	public void insertDisciplina(AnagrafeDisciplina dis) {
		anagrafeMapper.insert(dis);
	}
	
	@Transactional
	public void aggiungiCorso(Corso c) {
		corsoMapper.insert(c);
	}

}
