package controller;

public class EmpresaDao {
	
	int idEmpresa;
	String nomeEmpreesa;
	String cnpjEmpresa;
	String enderecoEmpresa;
	String cepEmpresa;
	String foneEmpresa;
	String emailEmpresa;
	
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
		
	}
	
	public void setNomeEmpreesa(String nomeEmpreesa) {
		this.nomeEmpreesa = nomeEmpreesa;
		
		
	}
	
	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}
	
	public void setEnderecoEmpresa(String enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}
	
	public void setCepEmpresa(String cepEmpresa) {
		this.cepEmpresa = cepEmpresa;
	}
	
	public void setFoneEmpresa(String foneEmpresa) {
		this.foneEmpresa = foneEmpresa;
	}
	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}
	
	
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public String getNomeEmpreesa() {
		return nomeEmpreesa;
	}
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}
	public String getEnderecoEmpresa() {
		return enderecoEmpresa;
	}
	public String getCepEmpresa() {
		return cepEmpresa;
	}
	public String getFoneEmpresa() {
		return foneEmpresa;
	}
	public String getEmailEmpresa() {
		return emailEmpresa;
	}
	
	
}
