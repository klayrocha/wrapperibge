package br.com.klayrocha.kafkaline.ibgewrapper.gateway.http;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.klayrocha.kafkaline.ibgewrapper.gateway.json.EstadoJson;
import br.com.klayrocha.kafkaline.ibgewrapper.service.estado.ConsultarEstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoResource {

	@Autowired
	private ConsultarEstadoService consultarEstadoService;

	@GetMapping("/")
	public List<EstadoJson> consultar() {
		return consultarEstadoService.consultar();
	}

}
