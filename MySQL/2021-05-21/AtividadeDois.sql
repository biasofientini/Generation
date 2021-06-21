CREATE DATABASE db_pizzaria_legal; -- criando novo banco de dados

USE db_pizzaria_legal;
CREATE TABLE tb_categoria(
	id BIGINT NOT NULL AUTO_INCREMENT,
	descricao VARCHAR(255),
    sabor VARCHAR(255),
    tipo VARCHAR(255),
    PRIMARY KEY(id)
);

USE db_pizzaria_legal;
CREATE TABLE tb_pizza(
	id BIGINT NOT NULL AUTO_INCREMENT,
    id_categoria BIGINT NOT NULL,
    quantidade INT NOT NULL,
    observacao VARCHAR(255),
	nome_cliente VARCHAR(255),
    preco FLOAT NOT NULL,
	extras VARCHAR(255),
    PRIMARY KEY(id),
    FOREIGN KEY(id_categoria) references tb_categoria(id)
);

INSERT INTO tb_categoria(descricao, sabor, tipo) VALUES('Pizza com frango, catupiry, queijo e azeitonas', 'Frango com catupiry', 'Salgada'), ('Pizza com calabresa, queijo, cebolas e azeitonas', 'Calabresa', 'Salgada'), ('Pizza com morangos e chocolate', 'Morango', 'Doce'), ('Pizza com goiabada e queijo', 'Romeu e Julieta', 'Doce'), ('Pizza com milho e queijo', 'Musserela e milho', 'Salgada'); -- inserindo novos objetos na tabela categoria

SELECT * FROM tb_categoria; -- visualizar tabela de categoria

INSERT INTO tb_pizza(id_categoria, quantidade, observacao, nome_cliente, preco, extras) 
	VALUES(1, 2, 'Sem azeitonas', 'Catarina', 70.0, 'Adicionar catupiry extra'), (2, 3, 'Sem cebolas', 'Carlos', 80.0, 'Adicionar catupiry'), (3, 6, 'Retirar morangos', 'Luiz', 40.0, 'Adicionar uvas'), (4, 1, 'Sem queijo', 'Fabrício', 60.0, 'Adicionar goiabada extra'), (5, 8, 'Sem Queijo', 'Julia', 90.0, 'Adicionar catupiry'), (1, 1, 'Sem azeitonas', 'Karina', 70.0, 'Adicionar tomates'), (2, 2, 'Sem azeitonas', 'Amélia', 80.0, 'Adicionar catupiry'), (4, 2, 'Sem goiabada', 'Bianca', 90.0, 'Adicionar chocolate'); -- inserindo novos objetos na tabela pizza

SELECT * FROM tb_pizza; -- visualizar tabela de pizza

SELECT * FROM tb_pizza WHERE preco > 45.0; -- filtrar tabela de pizza por preco

SELECT * FROM tb_pizza WHERE preco > 29.0 and preco < 60.0; -- filtrar tabela de pizza por preco

SELECT * FROM tb_categoria WHERE sabor like "%c%"; -- filtrar tabela de categoria por nome de sabores

SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.id_categoria; -- inner join entre tabelas categoria e pizza

SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.id_categoria WHERE tb_categoria.tipo = 'Doce'; -- inner join com busca por tipo de pizza 'Doce'