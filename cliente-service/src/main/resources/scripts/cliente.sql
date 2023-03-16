CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    rua VARCHAR(100),
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    estado VARCHAR(2),
    cep VARCHAR(8),
    referencia VARCHAR(100),
    observacao TEXT,
    ativo BOOLEAN NOT NULL DEFAULT true,
    data_alteracao TIMESTAMP NOT NULL DEFAULT now()
);

