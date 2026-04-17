--V2: migrations para criar a tabela de cadastro e adicionar a coluna de rank

ALTER TABLE TB_CADASTRO
ADD COLUMN rank VARCHAR(255);