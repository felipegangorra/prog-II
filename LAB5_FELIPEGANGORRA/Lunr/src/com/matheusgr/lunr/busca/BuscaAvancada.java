package com.matheusgr.lunr.busca;

import java.util.HashMap;
import java.util.Map;

import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoService;

/**
 * Classe de buscas avançadas.
 * 
 * @author Felipe Gangorra
 *
 */
public class BuscaAvancada implements Busca {
	
	private Map<String, String> metadados;
	
	/**
	 * Construtor da classe avançada com os metodos.
	 * 
	 * @param metadados a serem pesquisados
	 */
	public BuscaAvancada(Map<String, String> metadados) {
		(new ValidadorBusca()).valida(metadados);
		this.metadados = metadados;
	}
	
	/**
	 * Realiza a busca a partir de uma verificação na classe DocumentoService, onde
	 * é feita a busca avançada do sistema. Não há ordem.
	 * 
	 * @param ds DocumentoService utilizado na busca
	 * @return um mapa com os documentos encontrados e selecionados.
	 */
    public Map<Documento, Integer> busca(DocumentoService ds) {
        Map<Documento, Integer> respostaDocumento = new HashMap<>();
        
        for (String metaKey : this.metadados.keySet()) {
            if (metaKey.isBlank()) {
                continue;
            }
            for (Documento d : ds.busca(metadados)) {
                respostaDocumento.put(d, respostaDocumento.getOrDefault(d, 0) + 1);
            }
        }
        return respostaDocumento;
    }

    /**
     * Descreve e explicar uma consulta feita.
     *
     * @return Descrição da busca.
     */
    
	@Override
	public String[][] descreverConsulta() {
        String[][] resultado = new String[this.metadados.size()][];
        int i = 0;

        for (String metadado : metadados.keySet()) {
            resultado[i] = new String[] {"Metadado: ", metadado};
            i++;
        }
        return resultado;
	}
}
