CREATE TABLE person
(
    id uuid NOT NULL,
    document character varying(20) NOT NULL,
    name character varying(255) NOT NULL,
    created_at timestamp with time zone NOT NULL,
    PRIMARY KEY (id)
);