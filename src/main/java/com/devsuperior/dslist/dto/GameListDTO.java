
package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO() {  //construtor
		
	}

	public GameListDTO(GameList entity) {
		
		/* poderia fazer com o BeanUtils, mas como ele é pequeno faremos com o metodo tradicional e como não usei
		 *o BeamUtils posso só usar os getters*/
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	

}
