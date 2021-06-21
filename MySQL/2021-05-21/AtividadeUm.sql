CREATE DATABASE db_generation_game_online; -- criando novo banco de dados

USE db_generation_game_online;
CREATE TABLE tb_classe(
	id BIGINT NOT NULL AUTO_INCREMENT,
    forca INT NOT NULL,
    categoria VARCHAR(255),
    acessorio VARCHAR(255),
    PRIMARY KEY(id)
);

USE db_generation_game_online;
CREATE TABLE tb_personagem(
	id BIGINT NOT NULL AUTO_INCREMENT,
    id_classe BIGINT NOT NULL,
    nome VARCHAR(255),
    habilidade VARCHAR(255),
	sexo VARCHAR(255),
    poder_ataque INT NOT NULL,
    poder_defesa INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(id_classe) references tb_classe(id)
);

INSERT INTO tb_classe(forca, categoria, acessorio) VALUES(15, 'Arqueiro', 'Arco e flecha'), (20, 'Guerreiro', 'Espada'), (21, 'Atirador', 'Arma'), (25, 'Lutador', 'Facas'), (19, 'Corredor', 'Traje'); -- inserindo novos objetos na tabela classe

SELECT * FROM tb_classe;

INSERT INTO tb_personagem(id_classe, nome, habilidade, sexo, poder_ataque, poder_defesa) 
	VALUES(3, 'Max', 'Ágil', 'M', 2000, 180), (4, 'Adrian', 'Forte', 'M', 4000, 1000), (1, 'Cat', 'Atenta', 'F', 3000, 200), (2, 'Ju', 'Ágil', 'F', 2200, 1800), (3, 'Treena', 'Forte', 'F', 4200, 110), (5, 'Lais', 'Pensar Rápido', 'F', 250, 1400), (1, 'Carlos', 'Atento', 'M', 2000, 1800), (2, 'Cecília', 'Ágil', 'F', 2800, 3000); -- inserindo novos objetos na tabela personagem

SELECT * FROM tb_personagem; -- visualizar tabela de personagens

SELECT * FROM tb_personagem WHERE poder_ataque > 2000; -- filtrar tabela de personagens por poder de ataque

SELECT * FROM tb_personagem WHERE poder_defesa > 1000 and poder_defesa < 2000; -- filtrar tabela de personagens por poder de defesa

SELECT * FROM tb_personagem WHERE nome like "%c%"; -- filtrar tabela de personagens por nome

SELECT * FROM tb_personagem 
	INNER JOIN tb_classe ON tb_classe.id = tb_personagem.id_classe; -- inner join entre tabelas classe e personagem

SELECT tb_personagem.nome, tb_personagem.habilidade, tb_classe.categoria FROM tb_personagem 
	INNER JOIN tb_classe ON tb_classe.id = tb_personagem.id_classe WHERE tb_classe.categoria = 'Arqueiro'; -- inner join com busca por categoria de 'Arqueiro'