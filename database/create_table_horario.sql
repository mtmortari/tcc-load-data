CREATE TABLE horario_partida_origem (
    id        	integer CONSTRAINT horario_key PRIMARY KEY,
    bus_id		integer not null,
    start_time	time  not null,
    
);
