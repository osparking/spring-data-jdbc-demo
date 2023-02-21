package space.bumtiger.sd_jdbc_demo.domain;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class ChessMove {
	public enum MoveColor {
		WHITE, BLACK
	}

	@Id
	private Integer moveNumber;

	private MoveColor color;

	private String move;
}
