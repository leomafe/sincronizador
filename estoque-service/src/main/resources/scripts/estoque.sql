CREATE TABLE estoque (
  id SERIAL PRIMARY KEY,
  quantidade INTEGER NOT NULL,
  id_produto INTEGER NOT NULL,
  tipo_movimentacao VARCHAR(10) NOT NULL,
  data_alteracao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
