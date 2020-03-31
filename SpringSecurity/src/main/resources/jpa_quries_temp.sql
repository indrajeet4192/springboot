SELECT * FROM spring_security.users;
INSERT INTO spring_security.users (username,password,enabled) values ("user","pass",true);
INSERT INTO spring_security.users (username,password,enabled) values ("admin","admin",true);

CREATE TABLE `users` (
  `username` varchar(20) NOT NULL,
  `password` varchar(45) NOT NULL,
  `enabled` tinyint(4) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



SELECT * FROM spring_security.authorities;
INSERT INTO spring_security.authorities(username,authority) values ("user","ROLE_USER");
INSERT INTO spring_security.authorities(username,authority) values ("admin","ROLE_ADMIN");


CREATE TABLE `authorities` (
  `username` varchar(20) NOT NULL,
  `authority` varchar(20) DEFAULT NULL,
  KEY `fk_authorities_users_idx` (`username`),
  CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
