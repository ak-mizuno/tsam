CREATE TABLE public.category
(
    id character varying(2) COLLATE pg_catalog."default" NOT NULL,
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT category_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.category
    OWNER to postgres;

COMMENT ON TABLE public.category
    IS 'Car category';


CREATE TABLE public.car
(
    id character varying(4) COLLATE pg_catalog."default" NOT NULL,
    category_id character varying(2) COLLATE pg_catalog."default" NOT NULL,
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    grade character varying(10) COLLATE pg_catalog."default",
    color character varying(10) COLLATE pg_catalog."default",
    price bigint,
    fuel_cost bigint,
    CONSTRAINT car_pkey PRIMARY KEY (id),
    CONSTRAINT category_fkey FOREIGN KEY (category_id)
        REFERENCES public.category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.car
    OWNER to postgres;

COMMENT ON TABLE public.car
    IS 'Car information';
