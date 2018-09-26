CREATE TABLE INSTRUMENT_PRICE_MODIFIER (
  id bigint PRIMARY KEY,
  name VARCHAR(256) not null unique,
  multiplier DECIMAL(10,2) not null
);
