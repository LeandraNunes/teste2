package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Produto;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluno
 */
public class ProdutoDAO extends AbstractDAO<Produto> {

    public List obterTodos() {
        //JPQL
        //Sempre pensar em classe esquece tabela
        //SELECT p FROM Produto p
        TypedQuery query = getEntityManager().createQuery("SELECT p FROM Produto p", Produto.class);

        return query.getResultList();
    }
}
