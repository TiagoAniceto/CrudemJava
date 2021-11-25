package br.com.agenda.aplicacao;

import java.util.Date;


import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {
	
	public static void main(String[] args) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
	
	   Contato contato = new Contato();
	   contato.setNome("Maria Isabel");
	   contato.setIdade(56);
	   contato.setDataCadastro(new Date());
	   
	   
	   //contatoDAO.save(contato);
	   
	   //Atualizar contato
	   Contato c1 = new Contato();
	   c1.setNome("Maria Gabriela Dias Orlando");
	   c1.setIdade(37);
	   c1.setDataCadastro(new Date());
	   c1.setId(1);//É o numero que está no banco de dados da PK
	   
	    // contatoDAO.update(c1);
	   
	   // Deletar o contato pelo seu número de ID
	   contatoDAO.deletebyID(6);
	   		System.out.println("Contato deletado com sucesso !");
	   
	   
	   //Visualização dos registros do banco de dados TODOS
	   
	   for(Contato c : contatoDAO.getContatos()) {
		   System.out.println("Contato: "+c.getNome());
	   }
	   
	   
     }
}