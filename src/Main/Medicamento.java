package Main;
//@author Anizio Barbosa
public class Medicamento {
    private int id;	
	private String nome;
	
	
	public Medicamento(int id, String nome) {
		this.id = id;
		this.nome = nome;

	}
	
	
	
	public Medicamento() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
