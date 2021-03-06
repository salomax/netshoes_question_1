/**
 * 
 */
package br.com.netshoes.question1.service.cep;

import br.com.netshoes.question1.entity.cep.EnderecoEntity;
import br.com.netshoes.question1.exception.cep.CEPInvalidoException;

/**
 * interface de negócio responsável ao CEP.
 * 
 * @author salomao.marcos@gmail.com
 *
 */
public interface CEPService {

	/**
	 * Buscar endereço por um CEP válido.
	 * 
	 * @param cep CEP.
	 * @throws CEPInvalidoException Erro ao buscar CEP.
	 */
	public EnderecoEntity buscarEnderecoPorCEP(String cep) throws CEPInvalidoException;
	
}
