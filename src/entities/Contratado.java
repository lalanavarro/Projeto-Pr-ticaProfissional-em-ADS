package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.pag.ContaBancaria;

public class Contratado extends Usuario {
	
	private String cnpj;
	private Double notaMedia;
	private ContaBancaria contaBancaria;
	private List<Servico> servicos = new ArrayList();
	private List<PesquisaSatisfacao> pesquisas = new ArrayList();
	
	

	public Contratado(String nome, String cpf, String tipoPessoa, String endereco, String telefone, String email, Date dataNascimento, String cnpj, Double notaMedia, ContaBancaria contaBancaria) {
		super(nome, cpf, tipoPessoa, endereco, telefone, email, dataNascimento);
		this.cnpj = cnpj;
		this.notaMedia = notaMedia;
		this.contaBancaria = contaBancaria;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(Double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public ContaBancaria getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(ContaBancaria contaBancaria) {
		this.contaBancaria = contaBancaria;
	}
	
	
	public Double calculaMedia(PesquisaSatisfacao pesquisa) {
		Double media = 0.0;
		Double i = 0.0;
		for(PesquisaSatisfacao x : pesquisas) {
			i++;
			media += x.getNota();
		}
		return media/i;
		
	}
	
}
