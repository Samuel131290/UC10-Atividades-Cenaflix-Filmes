CREATE DATABASE atividade2;
USE atividade2;

CREATE TABLE filmes
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NomeFilme VARCHAR(100),
    DataLancamento VARCHAR(10),
    Categoria VARCHAR(50)
);

SELECT * FROM filmes;