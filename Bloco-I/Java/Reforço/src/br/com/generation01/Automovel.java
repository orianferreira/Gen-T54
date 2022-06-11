package br.com.generation01;

public class Automovel {

	private String nomeProprietario, modelo, placa, cor;
	private int ano;
	private boolean licenciado;

	public Automovel(String nomeProprietario, String modelo, String placa, String cor, int ano, boolean licenciado) {

		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.licenciado = licenciado;
	}

	public void imprimirInfo() {
		System.out.println("\n" + nomeProprietario + " possui um " + modelo + " com placa " + placa + " ano " + ano
				+ " licenciado " + licenciado);
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isLicenciado() {
		return licenciado;
	}

	public void setLicenciado(boolean licenciado) {
		this.licenciado = licenciado;
	}
	
	
}
