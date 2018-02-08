package org.pointpowerservices.business;

public class PointPowerBC {

	private static String registra = "N", 
			              email = "mariano.thiago@gmail.com", 
			              senha = "19thiago", 
			              cpf = "00588041530", 
			              senhaRegistra = "pequena14!", 
			              periodo = "rdPer1pe", 
			              altera = "N", 
			              bate = "S", 
			              minuto = "47",
			              cap = "VAZIO";

	public String getRegistra() {
		return registra;
	}

	public void setRegistra(String registra) {
		this.registra = registra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenhaRegistra() {
		return senhaRegistra;
	}

	public void setSenhaRegistra(String senhaRegistra) {
		this.senhaRegistra = senhaRegistra;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getAltera() {
		return altera;
	}

	public void setAltera(String altera) {
		this.altera = altera;
	}

	public String getBate() {
		return bate;
	}

	public void setBate(String bate) {
		this.bate = bate;
	}

	public String getMinuto() {
		return minuto;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCap() {
		return this.cap;
	}
}