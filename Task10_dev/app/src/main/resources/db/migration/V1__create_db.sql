CREATE TABLE IF NOT EXISTS client (
    id IDENTITY PRIMARY KEY,
    name VARCHAR(200)
);

CREATE TABLE IF NOT EXISTS planet (
    id IDENTITY PRIMARY KEY,
    name VARCHAR(500)
);

CREATE TABLE IF NOT EXISTS ticket(
	id IDENTITY PRIMARY KEY,
	created_at TIMESTAMP,
	client_id BIGINT,
	from_planet_id BIGINT,
	to_planet_id BIGINT

);