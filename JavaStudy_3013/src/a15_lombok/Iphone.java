package a15_lombok;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor //전체 생성자
@NoArgsConstructor //기본 생성자
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Iphone {
	private int series;
	private String model;
	private String color;
	private int memorySize;
	private int releaseDate;
	
}
