CREATE TABLE produtos (
    id          integer,
    descricao   varchar(200) NOT NULL,
    codigo      integer NOT NULL,
    valor       decimal NOT NULL,
    marca       varchar(60),
    PRIMARY KEY(id)
);

INSERT INTO produtos(id, descricao, codigo, valor, marca)
VALUES (1, 'Tesoura de jardinagem', 001212, 34.60, 'Brand'),
(2, 'Cola comum', 002312, 10.30, 'Brand2'),
(3, 'Lixa de parede', 003452, 24.10, 'Brand3'),
(4, 'Mesa estudo', 004672, 354.00, 'Brand4'),
(5, 'Cadeira', 005892, 130.80, 'Brand5');