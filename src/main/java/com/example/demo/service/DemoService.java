package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DemoEntity;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoService {
	
	@Autowired
	private DemoRepository repo;
	
	public List<DemoEntity> getAll()
	{
		return repo.findAll();
	}

	public DemoEntity save(DemoEntity e)
	{
		return repo.save(e);
	}
}
