CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_estoque (
	id BIGINT auto_increment,
    nome VARCHAR(100) not null,
    ativo BOOLEAN,
    ano INT,
    cor VARCHAR(100),
    modelo VARCHAR(100),
    armazenamento VARCHAR(10),
    preco DECIMAL(9,2),
    
    primary key (id)
    
);

INSERT INTO tb_estoque(nome,ativo,ano,cor,modelo, armazenamento, preco) VALUES ("Playstation 4", false, "2013", "Preto", "FAT", "500GB", 1250.00);
INSERT INTO tb_estoque(nome,ativo,ano,cor,modelo, armazenamento, preco) VALUES ("Playstation 4", true, "2020", "Preto", "Slim", "500GB", 2500.00);
INSERT INTO tb_estoque(nome,ativo,ano,cor,modelo, armazenamento, preco) VALUES ("Playstation 4", false, "2017", "Preto", "PRO", "500GB", 3000.00);
INSERT INTO tb_estoque(nome,ativo,ano,cor,modelo, armazenamento, preco) VALUES ("Xbox One", false, "2013", "Preto", "FAT", "500GB", 1250.00);
INSERT INTO tb_estoque(nome,ativo,ano,cor,modelo, armazenamento, preco) VALUES ("Xbox One", true, "2020", "Branco", "S", "500GB", 2500.00);
INSERT INTO tb_estoque(nome,ativo,ano,cor,modelo, armazenamento, preco) VALUES ("Xbox One", false, "2017", "Preto", "X", "500GB", 3000.00);
INSERT INTO tb_estoque(nome,ativo,ano,cor,modelo, armazenamento, preco) VALUES ("Nintendo Switch", false, "2020", "Vermelho e Azul", "Padrão", "32GB", 2000.00);
INSERT INTO tb_estoque(nome,ativo,ano,cor,modelo, armazenamento, preco) VALUES ("Nintendo Switch", true, "2021", "Turquesa", "Lite", "32GB", 1500.00);
INSERT INTO tb_estoque(nome,ativo,ano,cor,modelo, armazenamento, preco) VALUES ("Nintendo Switch", true, "2022", "Branco", "Oled", "64GB", 2500.00);

-- DELETE FROM tb_estoque WHERE id = ...

-- SELECT * FROM tb_estoque WHERE nome LIKE "%Play%" 
-- SELECT * FROM tb_estoque WHERE nome LIKE "%Xbox%"
-- SELECT * FROM tb_estoque WHERE nome LIKE "%Nintendo%"

-- SELECT * FROM tb_estoque WHERE ativo = true

-- SELECT * FROM tb_estoque WHERE preco > 500;

-- SELECT * FROM tb_estoque WHERE preco < 500;

/*
UPDATE tb_estoque
SET armazenamento = "1TB"
WHERE id = 6;
**/

SELECT * FROM tb_estoque;