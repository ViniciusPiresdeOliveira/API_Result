package com.residencia.academia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.academia.entity.Turma;
import com.residencia.academia.repository.TurmaRepository;

@Service
public class TurmaService {
	@Autowired
	TurmaRepository turmaRepository;
	
	public List<Turma> listarTodos(){
		return turmaRepository.findAll();
	}
	
	public Turma listarUma(Integer id) {
		return turmaRepository.findById(id).get();
	}
	
	public Turma saveTurma(Turma turma) {
		return turmaRepository.save(turma);
	}
}