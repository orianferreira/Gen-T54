-- atividade1

/*
comentario por bloco
**/

-- criando banco de dados
CREATE DATABASE db_rhgeneration;

-- indica o banco de dados que vai ser usado/manipulado
USE db_rhgeneration;

-- criando tabela
CREATE TABLE tb_funcionarios(
	
    id BIGINT auto_increment,
    
    -- Maneira de referenciar Primary Key id BIGINT auto_increment key,
    nome VARCHAR(255),
    
    -- Usamos o decimal quando estamos trabalhando com dinheiro
	salario DECIMAL(9,2),
	setor VARCHAR(255),
    matricula INT,
    
    -- Segunda forma de referenciar Primary Key
    primary key (id)
    
);

-- traz todos dados da tabela de funcionarios
SELECT * FROM tb_funcionarios;

-- query de inserção de dados
INSERT INTO tb_funcionarios(nome, salario, setor, matricula)VALUES("Jeff", 10000.0, "Tecnologia", 02);

-- query de consulta que trás o maior salario da tabela
SELECT MAX(salario) AS MaiorSalario FROM tb_funcionarios;

-- query de consulta que seleciona todes os colaboradores cujo salário seja maior do que 2000
SELECT * FROM tb_funcionarios WHERE salario < 2000;

-- query de atualização de um dado na tabela
UPDATE tb_funcionarios
SET nome = "Rian"
WHERE id = 2;

-- query de deleção de um dado na tabela
DELETE FROM tb_funcionarios WHERE id = 3;