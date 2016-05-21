package com.example.repositorio;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;



import com.example.dominio.Alumno;

public class AlumnoRepositorio {
	Alumno[] data = {
		new Alumno("Juan", "Perez", 16),
		new Alumno("Maria", "Castro", 14),
		new Alumno("Jose", "Ruiz", 18),
	};
	
	public List<Alumno> listar() {
		return Arrays.asList(data);
	}
	
	public List<Alumno> listar_nombre() {
		List<String> name = new ArrayList<String>();
		for(int i = 0;i<data.length;i++)
		{
		  name.add(data[i].nombres);
		}
		String[] sa = new String[ data.length ];
		name.toArray( sa );
		Arrays.sort(sa);
		
		List<Alumno> newal = new ArrayList<Alumno>();
		for(int i =0;i<data.length ; i++)
		{
			for(int j=0;j<data.length;j++)
			{
				if(sa[i]==data[j].nombres)
				{
					newal.add(data[j]);
				}
			}
		}
		
		return newal;	
	}
	
	public List<Alumno> listar_apellido() {
		List<String> name = new ArrayList<String>();
		for(int i = 0;i<data.length;i++)
		{
		  name.add(data[i].apellidoPaterno);
		}
		String[] sa = new String[ data.length ];
		name.toArray( sa );
		Arrays.sort(sa);
		
		List<Alumno> newal = new ArrayList<Alumno>();
		for(int i =0;i<data.length ; i++)
		{
			for(int j=0;j<data.length;j++)
			{
				if(sa[i]==data[j].apellidoPaterno)
				{
					newal.add(data[j]);
				}
			}
		}
		
		return newal;	
	}
	public List<Alumno> listar_promedio() {
		List<Integer> name = new ArrayList<Integer>();
		for(int i = 0;i<data.length;i++)
		{
		  name.add(data[i].promedio);
		}
		Integer[] sa = new Integer[ data.length ];
		name.toArray( sa );
		Arrays.sort(sa);
		
		List<Alumno> newal = new ArrayList<Alumno>();
		for(int i =0;i<data.length ; i++)
		{
			for(int j=0;j<data.length;j++)
			{
				if(sa[i]==data[j].promedio)
				{
					newal.add(data[j]);
				}
			}
		}
		
		return newal;	
	}
}