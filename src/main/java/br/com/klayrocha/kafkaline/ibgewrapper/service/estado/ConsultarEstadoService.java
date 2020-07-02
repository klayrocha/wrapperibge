package br.com.klayrocha.kafkaline.ibgewrapper.service.estado;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.klayrocha.kafkaline.ibgewrapper.gateway.feign.EstadoClient;
import br.com.klayrocha.kafkaline.ibgewrapper.gateway.json.EstadoJson;
import feign.Feign;
import feign.gson.GsonDecoder;

@Service
public class ConsultarEstadoService {

	public List<EstadoJson> consultar() {
		EstadoClient estadoClient = Feign.builder()
				.decoder(new GsonDecoder())
				.target(EstadoClient.class,"https://servicodados.ibge.gov.br");
		return estadoClient.get();
	}
}
