package Repositorio;

import java.util.ArrayList;

import Main.Medicamento;
//@author Anizio Barbosa
public class RepositorioMedicamento {
ArrayList <Medicamento> nomes= new ArrayList();
	Medicamento m = new Medicamento ();

	public boolean AddMedicamento (Medicamento med){  
try{
    nomes.add(med);
    return true;
}catch (Exception e){
    return false;
} 
}
//find = achou traduzido
public Medicamento buscar(int id){
    Medicamento find=null;
    
    for(Medicamento p:this.nomes){
        
        if(p.getId()==id){
            find=m;
            System.out.println(" Seu Medicamento " +p.getNome() + " Foi Encontrado ");
        }
     
      
    }
    return find; 
}

public Medicamento delet(int id) {
    Medicamento delet = null;
    for (Medicamento med : this.nomes) {
        if (m.getId() == id) {
            nomes.remove(m);
        }
        break;
    }
    return delet;
}


public boolean alterarMedicamento (Medicamento med){
    
    for (Medicamento med1:this.nomes){
        if (m.getId() == m.getId()){
            
            nomes.remove(m);
            nomes.add(m);
            return true;
        }
    }
    return false;
}
/**
if(m == null){
    throw new  MedicamentoNaoExisteException(m);
 
}
*/
}


