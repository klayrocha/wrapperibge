package br.com.klayrocha.kafkaline.ibgewrapper.gateway.feign;

import java.util.List;

import br.com.klayrocha.kafkaline.ibgewrapper.gateway.json.EstadoJson;
import feign.RequestLine;

public interface EstadoClient {
	
	@RequestLine("/api/v1/localidades/estados")
	List<EstadoJson> get();

}
