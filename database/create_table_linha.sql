CREATE TABLE linha (
    bus_id bigint CONSTRAINT bus_key PRIMARY KEY,
    name       	varchar(255),
    origin        bigint,
    destination	bigint,
    origin_name varchar(255),
    destination_name varchar(255),
    duration	time,
    number_id integer,
    operator	varchar(255)
);