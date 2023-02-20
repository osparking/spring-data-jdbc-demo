package space.bumtiger.sd_jdbc_demo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class ChessGame {
	@Id
	private Long id;

	private String playerWhite;

	private String playerBlack;

	private List<ChessMove> moves = new ArrayList<>();
}
