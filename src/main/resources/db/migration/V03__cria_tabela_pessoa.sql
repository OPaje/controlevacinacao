CREATE TABLE public.pessoa
(
    codigo bigserial NOT NULL,
    nome text,
    cpf text,
    dataNascimento Date,
    profissao text,
    status text DEFAULT 'ATIVO',
    PRIMARY KEY (codigo)
);