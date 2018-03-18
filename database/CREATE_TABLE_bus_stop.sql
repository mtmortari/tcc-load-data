CREATE TABLE bus_stop (
    id        	bigint CONSTRAINT bus_stop_key PRIMARY KEY,
    description       	varchar(50),
    lat			double precision,
    lon 		double precision,
    setor_cen_id	integer
);