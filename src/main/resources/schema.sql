-- `spring-data-jdbc`.chess_game definition

CREATE TABLE `chess_game` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `player_white` varchar(100) DEFAULT NULL,
  `player_black` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- `spring-data-jdbc`.chess_move definition

CREATE TABLE `chess_move` (
  `move_number` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `color` varchar(20) DEFAULT NULL,
  `move` varchar(10) DEFAULT NULL,
  `chess_game` int(10) unsigned DEFAULT NULL,
  `chess_game_key` smallint(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`move_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;