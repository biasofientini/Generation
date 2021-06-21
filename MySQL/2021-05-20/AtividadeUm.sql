CREATE DATABASE db_rh; -- criando novo banco de dados

USE db_rh; 
CREATE TABLE tb_funcionarios(
	id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) DEFAULT 'nome',
    sobrenome VARCHAR(255) DEFAULT 'sobrenome',
    salario FLOAT NOT NULL,
    idade INT NOT NULL,
    email VARCHAR(255),
    PRIMARY KEY(id)
);

INSERT INTO tb_funcionarios(nome, sobrenome, salario, idade, email)
	VALUES('Adriano', 'Santos', 2500.0, 23, 'adriano@email'), ('Bianca', 'Luz', 500.0, 30, 'bianca@email'), ('Amélia', 'Moura', 1000.0, 41, 'amelia@email'), ('Fernanda', 'Ferreira', 7000.0, 35, 'fernanda@email'), ('Giovana', 'Soares', 2000.0, 29, 'giovana@email');

SELECT * FROM tb_funcionarios; -- visualiza tabela

SELECT * FROM tb_funcionarios WHERE salario > 2000.0; -- seleciona salarios maiores que 2000.0

SELECT * FROM tb_funcionarios WHERE salario < 2000.0; -- seleciona salarios menores que 2000.0

SET SQL_SAFE_UPDATES = 0;
UPDATE tb_funcionarios
SET salario = 1000.0 
WHERE salario < 1000.0; -- atualiza os salarios menores que 1000.0

SELECT * FROM tb_funcionarios; -- visualiza tabela atualizada