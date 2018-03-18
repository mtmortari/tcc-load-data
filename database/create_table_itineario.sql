  CREATE TABLE itinerario (   
    itinerario_id bigint  CONSTRAINT itinerario_key PRIMARY KEY ,
    sequence 	integer,
    bus_id	integer not null,
    bus_stop_id	bigint not null
);