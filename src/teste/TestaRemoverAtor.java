package teste;

import dados.entidades.Ator;
import javax.persistence.EntityManager;
import util.JPAUtil;

public class TestaRemoverAtor {
    
    public static void main(String[] args) {
        //Pegando o gerenciador de acesso ao BD
        EntityManager gerenciador = JPAUtil.getGerenciador();
        //Buscando um ator pelo id (segundo parametro)
        Ator a = gerenciador.find(Ator.class, 1);
        //Iniciar a transação
        gerenciador.getTransaction().begin();
        
        //Remover o ator
        gerenciador.remove(a);
        
        //Commit na transação
        gerenciador.getTransaction().commit();
        //Fechar o gerenciador
        gerenciador.close();
        
    }
    
}
