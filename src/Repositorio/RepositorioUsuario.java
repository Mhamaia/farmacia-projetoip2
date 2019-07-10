package Repositorio;

import java.util.ArrayList;

import Main.Medicamento;
import Main.Usuario;

//@author Marcelo Henrique

	public class RepositorioUsuario {
		ArrayList <Usuario> nomes=new ArrayList();
	    Usuario u = new Usuario ();
	    
	    public boolean AddUsuario (Usuario usu){  
	    try{
	        nomes.add(usu);
	        return true;
	    }catch (Exception e){
	        return false;
	    } 
	}
	    
	    public Usuario buscar(int id){
	        Usuario achei=null;
	        
	        for(Usuario u:this.nomes){
	            
	            if(u.getId()==id){
	                achei=u;
	                System.out.println(" Usuario " +u.getNome() + " Encontrado ");
	            }
	         
	          
	        }
	        return achei; 
	    }
	    
	    public Usuario delet(int id) {
	        Usuario delet = null;
	        for (Usuario usu : this.nomes) {
	            if (u.getId() == id) {
	                nomes.remove(u);
	            }
	            break;
	        }
	        return delet;
	    }

	    
	    public boolean alterarUsuario (Usuario usu){
	        
	        for (Usuario usua:this.nomes){
	            if (u.getId() == u.getId()){
	                
	                nomes.remove(u);
	                nomes.add(u);
	                return true;
	            }
	        }
	        return false;
	    }
	}



