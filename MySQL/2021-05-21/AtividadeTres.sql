CREATE DATABASE db_farmacia_do_bem; -- criando novo banco de dados

USE db_farmacia_do_bem;
CREATE TABLE tb_categoria(
	id BIGINT NOT NULL AUTO_INCREMENT,
	descricao VARCHAR(255),
    utilidade VARCHAR(255),
    tipo VARCHAR(255),
    PRIMARY KEY(id)
);

USE db_farmacia_do_bem;
CREATE TABLE tb_produtos(
	id BIGINT NOT NULL AUTO_INCREMENT,
    id_categoria BIGINT NOT NULL,
    quantidade INT NOT NULL,
    observacao VARCHAR(255),
	nome_cliente VARCHAR(255),
    preco FLOAT NOT NULL,
	nome_produto VARCHAR(255),
    PRIMARY KEY(id),
    FOREIGN KEY(id_categoria) references tb_categoria(id)
);

INSERT INTO tb_categoria(descricao, utilidade, tipo) VALUES('Remédio fornecido por X', 'Dor de cabeça', 'Remédio'), ('Remédio fornecido por Y', 'Febre e dores', 'Remédio'), ('Produto fornecido por Z', 'Shampoo', 'Cosmético'), ('Produto fornecido por W', 'Esmalte', 'Cosmético'), ('Remédio fornecido por K', 'Antibiótico', 'Remédio'); -- inserindo novos objetos na tabela categoria

SELECT * FROM tb_categoria; -- visualizar tabela de categoria

INSERT INTO tb_produtos(id_categoria, quantidade, observacao, nome_cliente, preco, nome_produto) 
	VALUES(1, 2, 'Venda paga no cartão', 'Catarina', 70.0, 'Dipirona'), (2, 3, 'Venda paga no dinheiro', 'Carlos', 80.0, 'Ibuprofeno'), (3, 6, 'Venda paga por PIX', 'Luiz', 40.0, 'Shampoo marca X'), (4, 1, 'Venda paga por cartão', 'Fabrício', 60.0, 'Esmalte vermelho marca Y'), (5, 8, 'Venda paga no dinheiro', 'Julia', 90.0, 'Amoxicilina'), (1, 1, 'Venda paga no cartão', 'Karina', 70.0, 'Dipirona'), (2, 2, 'Venda paga no dinheiro', 'Amélia', 80.0, 'Ibuprofeno'), (4, 2, 'Venda paga por PIX', 'Bianca', 90.0, 'Esmalte preto marca W'); -- inserindo novos objetos na tabela produtos

SELECT * FROM tb_produtos; -- visualizar tabela de produtos

SELECT * FROM tb_produtos WHERE preco > 50.0; -- filtrar tabela de pizza por preco

SELECT * FROM tb_produtos WHERE preco BETWEEN 3.0 AND 60.0; -- filtrar tabela de produtos por preco

SELECT * FROM tb_produtos WHERE nome_produto like "%b%"; -- filtrar tabela de produtos por nome

SELECT * FROM tb_produtos
	INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.id_categoria; -- inner join entre tabelas categoria e produtos

SELECT * FROM tb_produtos
	INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.id_categoria WHERE tb_categoria.tipo = 'Cosmético'; -- inner join com busca por tipo de produto 'Cosmético'