package exercícioGS;

public class NovoAluno {
	  String nome;
	  int codigo;
	  double nota1;
	  double nota2;
	  
	  private NovoAluno(String nome, int codigo, double nota1, double nota2){
		  this.nome = nome;
		  this.codigo = codigo;
		  this.nota1 = nota1;
		  this.nota2 = nota2;
	  }
	  public void setNome(String nome) {
		  this.nome = nome;
	  }
	  public String getNome() {
		  return nome;
	  }
	  public void setCodigo(int codigo) {
		  this.codigo = codigo;
	  }
	  public int getCodigo() {
		  return codigo;
	  }
	  public void setNota1(double nota1) {
		  this.nota1 = nota1;
	  }
	  public double getNota1() {
		  return nota1;
	  }
	  public void setNota2(double nota2) {
		  this.nota2 = nota2;
	  }
	  public double getNota2() {
		  return nota2;
	  }
	  
	  
}
