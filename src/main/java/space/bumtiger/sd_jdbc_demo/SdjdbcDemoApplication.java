package space.bumtiger.sd_jdbc_demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;
import space.bumtiger.sd_jdbc_demo.domain.ChessGame;
import space.bumtiger.sd_jdbc_demo.domain.ChessMove;
import space.bumtiger.sd_jdbc_demo.domain.ChessMove.MoveColor;
import space.bumtiger.sd_jdbc_demo.repository.ChessGameRepository;

@Slf4j
@SpringBootApplication
public class SdjdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdjdbcDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ApplicationContext ctx,
			ChessGameRepository gameRepo) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");
			ChessGame game = new ChessGame();
			game.setPlayerWhite("Thorben Janssen");
			game.setPlayerBlack("A weak player");

			ChessMove move1white = new ChessMove();
			move1white.setColor(MoveColor.WHITE);
			move1white.setMove("e4");
			game.getMoves().add(move1white);

			ChessMove move1Black = new ChessMove();
			move1Black.setColor(MoveColor.BLACK);
			move1Black.setMove("e5");
			game.getMoves().add(move1Black);

			gameRepo.save(game);

			List<ChessGame> games = gameRepo.findByPlayerBlack("A weak player");
			games.forEach(g -> log.info(g.toString()));
		};
	}
}
