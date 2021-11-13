
CREATE TABLE users(
                    email, text,                                 --user email account
                    phone_number text,                           --user phone number
                    public_id SERIAL UNIQUE NOT NULL,            --user Id for searching up
                    internal_id SERIAL UNIQUE NOT NULL,          --db internal Id
                    user_name text,                            
                    likes text REFERENCES likes_hobbies(likes),  --likes and hobbies of the user
                    status text REFERENCES friends(status),      --friendship status
                    gender CHAR(1),                              --'M' male or 'F' female
                    bday date,                                   --birthday (age verification)
                    PRIMARY KEY (internal_id)
);

CREATE TABLE transp_type(
                    trnsp_type text,                             --type of transportation available
                    schedual date,                               --schedual
                    internal_id SERIAL UNIQUE NOT NULL,          --db internal Id
                    PRIMARY KEY (trnsp_type)
);

CREATE TABLE spot_type(
                    type text,                                   --type of spot (bar, club, etc)
                    type_id CHAR(1),                             --by char(B = bar, etc)
                    PRIMARY KEY (type)
);

CREATE TABLE price_type(
                    type text NOT NULL,                          --type of price(menu, entry fee, drink, etc)
                    PRIMARY KEY (type)
);

CREATE TABLE likes_hobbies(
                    likes CHAR(40),                              --for match-making
                    PRIMARY KEY (likes)
);

CREATE TABLE info_spot_price_type(
                    price money NOT NULL,                        --amount
                    PRIMARY KEY (price)
);

CREATE TABLE info_spot_event_type(
                    evnt_date time with time zone NOT NULL,
                    PRIMARY KEY(evnt_date)
);

CREATE TABLE info_spot(
                    spot_name text,                              --name of the spot
                    internal_id SERIAL UNIQUE NOT NULL,          --db internal Id
                    contact_info text,                           --contact information for the spots
                    address text,                                --address information for the spots
                    spt_type text REFERENCES spot_type(type),    --type of spot(foreign key)
                    price money REFERENCES info_spot_price_type(price), --amount(foreign key)
                    PRIMARY KEY (internal_id) 
);

CREATE TABLE friends(
                    public_id INTEGER REFERENCES users(internal_id),
                    status text,
                    PRIMARY KEY (status)
);

CREATE TABLE friend_group(
                    group_name text NOT NULL,                   --friend group's name (user defined)
                    PRIMARY KEY (group_name)
);

CREATE TABLE event_type(
                    evnt_type text NOT NULL,                    --type of event happening (live music, etc)
                    type_id char(1) NOT NULL,                   --'L' live music, etc
                    PRIMARY KEY (type_id)
);