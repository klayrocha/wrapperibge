package br.com.klayrocha.kafkaline.ibgewrapper.gateway.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class EstadoJson {
	
	private Long id;
	private String sigla;
	private String nome;
	private RegiaoJson regiao;

}
