package ca.sheridancollege.diclemed.beans;

import java.io.Serializable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game implements Serializable{

	private Long id;
	private String title;
	private String publisher;
	private String platform;
	private final String[] platforms = {"PC", "PS5", "XBOX1"};
	private double price;
	
}
