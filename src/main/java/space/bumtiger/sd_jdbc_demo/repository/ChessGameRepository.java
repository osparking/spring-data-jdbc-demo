package space.bumtiger.sd_jdbc_demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import space.bumtiger.sd_jdbc_demo.domain.ChessGame;

// @formatter:off
public interface ChessGameRepository 
				extends CrudRepository<ChessGame, Long> {
	List<ChessGame> findByPlayerBlack(String playerBlack);
// @formatter:on
}
