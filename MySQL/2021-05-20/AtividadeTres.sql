CREATE DATABASE db_escola; -- criando novo banco de dados

USE db_escola; 
CREATE TABLE tb_alunos(
	id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) DEFAULT 'nome',
    sobrenome VARCHAR(255) DEFAULT 'sobrenome',
    nota FLOAT NOT NULL,
    idade INT NOT NULL,
    email VARCHAR(255),
    PRIMARY KEY(id)
);

INSERT INTO tb_alunos(nome, sobrenome, nota, idade, email)
	VALUES('Adriano', 'Santos', 2.5, 16, 'adriano@email'), ('Bianca', 'Luz', 7.5, 14, 'bianca@email'), ('Amélia', 'Moura', 10.0, 15, 'amelia@email'), ('Fernanda', 'Ferreira', 7.0, 4, 'fernanda@email'), ('Giovana', 'Soares', 4.0, 10, 'giovana@email');

SELECT * FROM tb_alunos; -- visualiza tabela

SELECT * FROM tb_alunos WHERE nota > 7.0; -- seleciona notas maiores que 7.0

SELECT * FROM tb_alunos WHERE nota < 7.0; -- seleciona menores que 7.0

UPDATE tb_alunos
SET nota = 5.0
WHERE id=1; -- atualiza a nota do aluno de id = 1

SELECT * FROM tb_alunos; -- visualiza tabela atualizada