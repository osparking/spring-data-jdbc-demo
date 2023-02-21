package space.bumtiger.sd_jdbc_demo.domain;

import lombok.Data;

@Data
public class ChessMove {
	public enum MoveColor {
		WHITE, BLACK
	}

	private Integer moveNumber;

	private MoveColor color;

	private String move;
}
