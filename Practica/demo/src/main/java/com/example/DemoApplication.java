package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dominio.Alumno;
import com.example.repositorio.AlumnoRepositorio;

@EnableAutoConfiguration
@Controller
public class DemoApplication {

	AlumnoRepositorio repositorio = new AlumnoRepositorio();

	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping("/alumnos")
	@ResponseBody
	public List<Alumno> alumnos(String ordenarPor) {
		
		List<Alumno> prueba=new ArrayList<Alumno>();;
		
		if(ordenarPor.equals("nombre"))
		{
			prueba=repositorio.listar_nombre();
		}
		if(ordenarPor.equals("apellido"))
		{
			prueba=repositorio.listar_apellido();
		}
		if(ordenarPor.equals("promedio"))
		{
			prueba=repositorio.listar_promedio();
		}
		
		return prueba;
	}
	
	@RequestMapping("/alumnos_n")
	@ResponseBody
	public List<Alumno> alumnos_n(String ordenarPor) {
		
		return repositorio.listar_nombre();
	}	
	@RequestMapping("/alumnos_a")
	@ResponseBody
	public List<Alumno> alumnos_a(String ordenarPor) {
		
		return repositorio.listar_apellido();
	}
	@RequestMapping("/alumnos_p")
	@ResponseBody
	public List<Alumno> alumnos_p(String ordenarPor) {
		
		return repositorio.listar_promedio();
	}
}