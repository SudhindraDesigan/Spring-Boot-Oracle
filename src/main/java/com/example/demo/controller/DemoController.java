package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService service;
	
	
	@GetMapping(value = "/getall")
	public List<DemoEntity> findAll() {
		
		return service.getAll();
	}
	
	@PostMapping(value = "/insert")
	public DemoEntity save(@RequestBody DemoEntity entity) {
		
		DemoEntity saved = service.save(entity);
		System.out.println("before---"+entity+"---saved---"+saved);
		return service.save(saved);
		
	}
	@PostMapping(value="/file")
	public void getFile(MultipartHttpServletRequest request) throws IOException
	{
		System.out.println("Request:"+request.getFile("file").toString());
	}

}
