package space.bumtiger.sd_jdbc_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import space.bumtiger.sd_jdbc_demo.domain.ChessGame;
import space.bumtiger.sd_jdbc_demo.domain.ChessMove;
import space.bumtiger.sd_jdbc_demo.domain.ChessMove.MoveColor;
import space.bumtiger.sd_jdbc_demo.repository.ChessGameRepository;

@SpringBootApplication
public class SdjdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdjdbcDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx,
			ChessGameRepository gameRepo) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");
			ChessGame game = new ChessGame();
			game.setPlayerWhite("Thorben Janssen");
			game.setPlayerBlack("A strong player");

			ChessMove move1white = new ChessMove();
			move1white.setMoveNumber(1);
			move1white.setColor(MoveColor.WHITE);
			move1white.setMove("e4");
			game.getMoves().add(move1white);

			ChessMove move1Black = new ChessMove();
			move1Black.setMoveNumber(2);
			move1Black.setColor(MoveColor.BLACK);
			move1Black.setMove("e5");
			game.getMoves().add(move1Black);

			gameRepo.save(game);
		};
	}
}
