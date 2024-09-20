package com.API.senai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("receita")
public class Controller {
	@GetMapping
	public String receita() {
		return "Ingredientes\r\n"
				+ "1 xícara de açúcar\r\n"
				+ "1/2 xícara de manteiga\r\n"
				+ "2 ovos\r\n"
				+ "1 xícara de leite\r\n"
				+ "1 xícara de farinha de trigo\r\n"
				+ "1/2 xícara de cacau em pó\r\n"
				+ "1 colher de sopa de fermento em pó\r\n"
				+ "1 pitada de sal\r\n"
				+ "Opcional: chocolate granulado para decorar\r\n"
				+ "Passo a Passo\r\n"
				+ "Preparar o forno: Preaqueça o forno a 180°C e unte uma forma de bolo com manteiga e farinha.\r\n"
				+ "\r\n"
				+ "Misturar os ingredientes secos: Em uma tigela, peneire a farinha, o cacau, o fermento e o sal. Reserve.\r\n"
				+ "\r\n"
				+ "Bater a manteiga e o açúcar: Em outra tigela, bata a manteiga com o açúcar até obter um creme claro e fofo.\r\n"
				+ "\r\n"
				+ "Adicionar os ovos: Incorpore os ovos um a um, batendo bem após cada adição.\r\n"
				+ "\r\n"
				+ "Adicionar os ingredientes secos: Gradualmente, adicione a mistura de ingredientes secos à mistura de manteiga e açúcar, alternando com o leite. Comece e termine com os ingredientes secos. Misture até ficar homogêneo.\r\n"
				+ "\r\n"
				+ "Assar o bolo: Despeje a massa na forma untada e leve ao forno por cerca de 30-35 minutos, ou até que um palito inserido no centro saia limpo.\r\n"
				+ "\r\n"
				+ "Esfriar: Retire o bolo do forno e deixe esfriar na forma por 10 minutos. Depois, desenforme e deixe esfriar completamente em uma grade.\r\n"
				+ "\r\n"
				+ "Decorar (opcional): Se desejar, decore o bolo com chocolate granulado ou cobertura de chocolate.\r\n"
				+ "\r\n"
				+ "Dicas\r\n"
				+ "Para um bolo ainda mais saboroso, você pode adicionar nozes ou chocolate em pedaços à massa.\r\n"
				+ "Sirva com uma bola de sorvete de creme ou chantilly!\r\n"
				+ "Bom apetite!";
	}
}
