package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mappers.AnagrafeDisciplinaMapper;
import com.model.AnagrafeDisciplina;

@Service("anagrafeService")
public class AnagrafeServiceImpl implements AnagrafeService{

	@Autowired
	AnagrafeDisciplinaMapper anagrafeMapper;
	
	@Transactional
	public void insertDisciplina(AnagrafeDisciplina dis) {
		anagrafeMapper.insert(dis);
	}

}
