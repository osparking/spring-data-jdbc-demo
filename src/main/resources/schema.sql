-- `spring-data-jdbc`.chess_game definition

CREATE TABLE `chess_game` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `player_white` varchar(100) DEFAULT NULL,
  `player_black` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;