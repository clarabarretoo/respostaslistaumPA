public Cliente (String n,int c, String d) {
		this.nome= n;
		this.cpf= c;
		this.dataNascimento = d;
	}
	public void setNome (String n) {
		this.nome = n;
	}
	public void setCpf (int c) {
		this.cpf = c;
	}
	public void setdataNascimento ( String d) {
		this.dataNascimento = d;
	}
	public String getNome () {
		return nome;
	}
	public int getCpf() {
		return cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String toString () {
		return "nome: " + nome + "\ncpf: " + cpf +"\ndataNascimento: " + dataNascimento;
	}
}
