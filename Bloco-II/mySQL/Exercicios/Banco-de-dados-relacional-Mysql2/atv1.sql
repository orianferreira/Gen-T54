CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes (
	id BIGINT auto_increment,
    classe VARCHAR(255),
    dano INT,
    
    PRIMARY KEY (id)
);

CREATE TABLE tb_personagens (
	id BIGINT auto_increment,
    nome VARCHAR(255),
    raca VARCHAR(255),
    arma VARCHAR(255),
    fk_classe_id BIGINT,
    fk_dano_id BIGINT,
    
    PRIMARY KEY (id),
    
    FOREIGN KEY (fk_classe_id) REFERENCES tb_classes(id),
    FOREIGN KEY (fk_dano_id) REFERENCES tb_classes(id)
);

INSERT INTO tb_classes(classe, dano) VALUES ("Guerreiro", 1234);
INSERT INTO tb_classes(classe, dano) VALUES ("Paladino", 1124);
INSERT INTO tb_classes(classe, dano) VALUES ("Caçador", 1900);
INSERT INTO tb_classes(classe, dano) VALUES ("Ladino", 2340);
INSERT INTO tb_classes(classe, dano) VALUES ("Sacerdote", 787);
INSERT INTO tb_classes(classe, dano) VALUES ("Xamã", 856);
INSERT INTO tb_classes(classe, dano) VALUES ("Mago", 1739);
INSERT INTO tb_classes(classe, dano) VALUES ("Bruxo", 2450);
INSERT INTO tb_classes(classe, dano) VALUES ("Monge", 1134);
INSERT INTO tb_classes(classe, dano) VALUES ("Druida", 944);
INSERT INTO tb_classes(classe, dano) VALUES ("Caçador de Demônios", 1349);
INSERT INTO tb_classes(classe, dano) VALUES ("Cavaleiro da Morte", 1583);

SELECT * FROM tb_classes;

INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Ragnar", "Orc", "Machado e Escudo", 1, 1);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Vilgaks", "Draenei", "Machado Magico", 2, 2);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Bellatrix", "Elfa Noturna", "Arco e flecha", 3, 3);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Warrick", "Worgen", "Adagas", 4, 4);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Sheila", "Humana", "Cajado Magico", 5, 5);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Berrick", "Anão", "Machado", 6, 6);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Charlotte", "Humana", "Magia", 7, 7);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Storm", "Morta Viva", "Adagas", 8, 8);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Kongu", "Pandaren", "Cajado", 9, 9);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Dori", "Tauren", "Arma de Punho", 10, 10);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Brakyn", "Elfo Sangrento", "Laminas Duplas", 11, 11);
INSERT INTO tb_personagens(nome, raca, arma, fk_classe_id, fk_dano_id) VALUES ("Karen", "Morta viva", "Espada Pesada", 12, 12);

SELECT * FROM tb_personagens;

SELECT * FROM tb_classes WHERE dano > 2000;

SELECT * FROM tb_classes WHERE dano >= 1000 && dano <= 2000;

SELECT * FROM tb_personagens WHERE nome LIKE "%C%";

SELECT * FROM tb_personagens INNER JOIN tb_classes;

SELECT * FROM tb_personagens INNER JOIN tb_classes
ON classe LIKE "%Caçador%";