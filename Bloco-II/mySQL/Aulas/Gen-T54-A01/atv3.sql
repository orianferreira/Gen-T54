CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_estudantes (
	id BIGINT(8) auto_increment,
    nome VARCHAR(100) not null,
    idade INT,
    curso VARCHAR(100),
    bloco VARCHAR(10),
    endereco VARCHAR(255),
    notaFinal FLOAT,
    
    primary key (id)
    
);

INSERT INTO tb_estudantes (nome, idade, curso, bloco, endereco, notaFinal) VALUES ("Rian De A. Ferreira", 19, "Desenvolvimento Java Web", "Bloco II", "SP - Rua da paz N°41", 10.0);
INSERT INTO tb_estudantes (nome, idade, curso, bloco, endereco, notaFinal) VALUES ("Juan Savedra", 15, "Desenvolvimento Java Web", "Bloco I", "SP - Rua do sei que la...", 8.0);
INSERT INTO tb_estudantes (nome, idade, curso, bloco, endereco, notaFinal) VALUES ("Guilherme Sampaio", 19, "Desenvolvimento Java Web", "Bloco I", "SP - Rua do sei que la...", 8.0);
INSERT INTO tb_estudantes (nome, idade, curso, bloco, endereco, notaFinal) VALUES ("Speddy", 19, "Arte Digital", "Bloco III", "SP - Rua do sei que la...", 9.0);
INSERT INTO tb_estudantes (nome, idade, curso, bloco, endereco, notaFinal) VALUES ("Yuri Nobre", 19, "Desenvolvimento de Games", "Bloco I", "SP - Rua do sei que la...", 7.0);
INSERT INTO tb_estudantes (nome, idade, curso, bloco, endereco, notaFinal) VALUES ("Tetano", 16, "Modelagem 3D", "Bloco I", "Rondonia - Rua do sei que la...", 5.0);
INSERT INTO tb_estudantes (nome, idade, curso, bloco, endereco, notaFinal) VALUES ("Connie", 17, "Instrutor de tiro", "Bloco IV", "RJ - Rua do sei que la...", 6.0);
INSERT INTO tb_estudantes (nome, idade, curso, bloco, endereco, notaFinal) VALUES ("Julie", 25, "Edição de Videos", "Bloco X", "SP - Rua sei la do que...", 10.0);

UPDATE tb_estudantes
SET endereco = "SP - Rua do sei la..."
WHERE id = 8;

SELECT * FROM tb_estudantes WHERE notaFinal > 7;

SELECT * FROM tb_estudantes WHERE notaFinal < 7;

SELECT * FROM tb_estudantes;