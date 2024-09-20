package com.API.senai;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name= "bolo")
public class bolo_model {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String receita;
	private String nome;
	private double preco;
	
	public String getreceita() {
		return receita;
	}
	public void setreceita(int id) {
		this.receita= receita;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getpreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}



