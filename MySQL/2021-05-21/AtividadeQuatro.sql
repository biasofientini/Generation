CREATE DATABASE  db_cidade_das_frutas; -- criando novo banco de dados

USE db_cidade_das_frutas;
CREATE TABLE tb_categoria(
	id BIGINT NOT NULL AUTO_INCREMENT,
	descricao VARCHAR(255),
	preco FLOAT NOT NULL,
    tipo VARCHAR(255),
    PRIMARY KEY(id)
);

USE db_cidade_das_frutas;
CREATE TABLE tb_produtos(
	id BIGINT NOT NULL AUTO_INCREMENT,
    id_categoria BIGINT NOT NULL,
    quantidade INT NOT NULL,
    observacao VARCHAR(255),
	nome_cliente VARCHAR(255),
	nome_produto VARCHAR(255),
    peso FLOAT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(id_categoria) references tb_categoria(id)
);

INSERT INTO tb_categoria(descricao, preco, tipo) VALUES('Banana prata', 20.0, 'Fruta'), ('Banana nanica', 1000.0, 'Fruta'), ('Maçã gala', 50.0, 'Fruta'), ('Batata doce', 1000.0, 'Legume'), ('Abacate fortuna', 90.0, 'Fruta'); -- inserindo novos objetos na tabela categoria

SELECT * FROM tb_categoria; -- visualizar tabela de categoria

INSERT INTO tb_produtos(id_categoria, quantidade, observacao, nome_cliente, peso, nome_produto) 
	VALUES(1, 2, 'Venda paga no cartão', 'Catarina', 70.0, 'Banana'), (2, 3, 'Venda paga no dinheiro', 'Carlos', 80.0, 'Banana'), (3, 6, 'Venda paga por PIX', 'Luiz', 40.0, 'Maçã'), (4, 1, 'Venda paga por cartão', 'Fabrício', 60.0, 'Batata doce'), (5, 8, 'Venda paga no dinheiro', 'Julia', 90.0, 'Abacate'), (1, 1, 'Venda paga no cartão', 'Karina', 70.0, 'Banana'), (2, 2, 'Venda paga no dinheiro', 'Amélia', 80.0, 'Banana'), (4, 2, 'Venda paga por PIX', 'Bianca', 90.0, 'Batata doce'); -- inserindo novos objetos na tabela produtos

SELECT * FROM tb_produtos; -- visualizar tabela de produtos

SELECT * FROM tb_categoria WHERE preco > 50.0; -- filtrar tabela de categoria por preco

SELECT * FROM tb_categoria WHERE preco BETWEEN 3.0 AND 60.0; -- filtrar tabela de categoria por preco

SELECT * FROM tb_produtos WHERE nome_produto like "%c%"; -- filtrar tabela de produtos por nome

SELECT * FROM tb_produtos
	INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.id_categoria; -- inner join entre tabelas categoria e produtos

SELECT * FROM tb_produtos
	INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.id_categoria WHERE tb_categoria.tipo = 'Legume'; -- inner join com busca por tipo de produto 'Legume'