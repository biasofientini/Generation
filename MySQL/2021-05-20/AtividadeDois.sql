CREATE DATABASE db_ecommerce; -- criando novo banco de dados

USE db_ecommerce; 
CREATE TABLE tb_produtos(
	id BIGINT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(255) DEFAULT 'Prato Feito',
    valor FLOAT,
    quantidade INT NOT NULL,
    nome VARCHAR(255),
    descricao VARCHAR(255),
    PRIMARY KEY(id)
);

INSERT INTO tb_produtos(nome, tipo, valor, quantidade, descricao)
	VALUES('Lasanha', 'Massas', 501.0, 1, 'Lasanha ao molho bolonhesa de quatro queijos'), ('Lasanha', 'Massas', 1000.0, 3, 'Lasanha de quatro queijos'), ('Bife Acebolado', 'Prato Feito', 50.0, 5, 'Bife acebolado com ovo, arroz e feijão'), ('Macarrão', 'Massas', 30.0, 9, 'Macarrão ao molho bolonhesa'), ('Coca-Cola', 'Refrigerante', 800.0, 7, 'Refrigerante da Coca-Cola de 500 mL');

SELECT * FROM tb_produtos; -- visualiza tabela

SELECT * FROM tb_produtos WHERE valor > 500.0; -- seleciona valores maiores que 500.0

SELECT * FROM tb_produtos WHERE valor < 500.0; -- seleciona valores menores que 500.0

UPDATE tb_produtos
SET valor = 1000.0 
WHERE id = 4; -- atualiza valor do objeto de id = 4

SELECT * FROM tb_produtos; -- visualiza tabela atualizada