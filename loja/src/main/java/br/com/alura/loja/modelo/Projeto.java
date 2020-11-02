package br.com.alura.loja.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.XStream;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Projeto {

	private String nome;
	private Long id;
	private int anoDeInicio;

	public Projeto(String nome, Long id, int anoDeInicio) {
		this.nome = nome;
		this.id = id;
		this.anoDeInicio = anoDeInicio;
	}

	public Projeto(long l, String string, int anoDeInicio2) {

	}
	
	public Projeto (){
		
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public int getAnoDeInicio() {
		return anoDeInicio;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String toXML() {
		return new XStream().toXML(this);
	}

}
