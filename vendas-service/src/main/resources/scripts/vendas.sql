CREATE TABLE venda (
  id SERIAL PRIMARY KEY,
  id_cliente INTEGER NOT NULL,
  qtd_itens INTEGER NOT NULL,
  valor_total NUMERIC(10, 2) NOT NULL
);
CREATE TABLE itemvenda (
  id SERIAL PRIMARY KEY,
  id_produto INTEGER NOT NULL,
  valor_unitario NUMERIC(10, 2) NOT NULL,
  valor_total NUMERIC(10, 2) NOT NULL,
  quantidade INTEGER NOT NULL,
  id_venda INTEGER NOT NULL,
  CONSTRAINT fk_venda_itemvenda
    FOREIGN KEY (id_venda)
    REFERENCES venda(id)
);
