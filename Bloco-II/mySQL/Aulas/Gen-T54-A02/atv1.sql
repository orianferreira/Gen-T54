CREATE DATABASE db_rhgeneration;

USE db_rhgeneration;

CREATE TABLE tb_setor (
id BIGINT auto_increment,
nome_setor VARCHAR(255),

PRIMARY KEY (id)

);

CREATE TABLE tb_funcionarios (
    id BIGINT auto_increment,
    nome VARCHAR(255),
	salario DECIMAL(9,2),
    matricula INT,
    setor_id BIGINT,
    
    PRIMARY KEY (id),
    
    FOREIGN KEY (setor_id) REFERENCES tb_setor(id)
);

-- SELECT * FROM tb_setor;
-- SELECT * FROM tb_funcionarios;

INSERT INTO tb_setor(nome_setor) VALUES ("Administração");
INSERT INTO tb_setor(nome_setor) VALUES ("Tecnologia");
INSERT INTO tb_setor(nome_setor) VALUES ("Financeiro");

INSERT INTO tb_funcionarios(nome, salario, matricula, fk_setor_id) VALUES ("Yuri Nobre", 15000, 1, 1);
INSERT INTO tb_funcionarios(nome, salario, matricula, fk_setor_id) VALUES ("Rian De A. Ferreira", 20000, 2, 2);
INSERT INTO tb_funcionarios(nome, salario, matricula, fk_setor_id) VALUES ("Speddy", 10000, 3, 3);

SELECT * FROM tb_funcionarios INNER JOIN tb_setor
ON tb_setor.id = tb_funcionarios.fk_setor_id;

ALTER TABLE tb_funcionarios
CHANGE setor_id fk_setor_id BIGINT;

/*
SELECT * FROM tb_funcionarios;

INSERT INTO tb_funcionarios(nome, salario, setor, matricula)VALUES("Jeff", 10000.0, "Tecnologia", 02);

SELECT MAX(salario) AS MaiorSalario FROM tb_funcionarios;

SELECT * FROM tb_funcionarios WHERE salario < 2000;

UPDATE tb_funcionarios
SET nome = "Rian"
WHERE id = 2;

DELETE FROM tb_funcionarios WHERE id = 3;
**/
