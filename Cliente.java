 public class Cliente{
	  private String nome;
	  private String cpf;
	  private Data dataNascimento;
	  
	  public Cliente(String nome, String cpf, Data datanascimento) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.data= dataNascimento;     
	  } 
	   public String getNome() {
	        return nome;
	    }
	   
	   public String getCpf() {
	        return cpf;
	    }
	   
	   public void setNome(String nome) {
	      this.nome=nome;
	   }
	   
	   public void setCpf(String cpf) {
		      this.cpf=cpf;
       }
	   public void setDataNascimento(Data d) {
		      this.dataNascimento=d;
	   }
