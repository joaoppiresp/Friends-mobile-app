
CREATE TABLE users(
                    user_email VARCHAR(60),                           --user email account
                    user_phone_number VARCHAR(20),                    --user phone number
                    user_public_id SERIAL UNIQUE NOT NULL,            --user Id for searching up
                    user_db_id SERIAL NOT NULL,                       --db Id
                    user_nm VARCHAR(60) not null,                     --username                      
                    frnds INTEGER,                                    --foreign key to friends
                    gender CHAR(1) NOT NULL,                          --'M' male, 'F' female or 'O' other
                    user_bday date NOT NULL,                          --birthday (age verification)
                    user_interest_id INTEGER,                         --foreign key userinterests
                    f_group_id INTEGER,                               --foreign key friendgroup
                    trnsp INTEGER,                                    --foreign key to tsp_user_spot
                    at_spot_id INTEGER,                               --foreign key to crowd
                    user_place VARCHAR(40) not null,
                    PRIMARY KEY (user_db_id)
);

CREATE TABLE userinterest(
                    int_id INTEGER,                                   --foreign key to interests  
                    interest_user_id SERIAL NOT NULL,                 
                    user_int_id INTEGER,                              --foreign key to users
                    PRIMARY KEY (interest_user_id)
);
CREATE TABLE transptype(
                    trnsp_type text,                                  --type of transportation available
                    schedual date,                                    --schedual
                    trnsp_id SERIAL NOT NULL,                         --db internal Id
                    type_spt_id INTEGER,                              --foreign key to tspuserspot
                    PRIMARY KEY (trnsp_id)
);

CREATE TABLE tspuserspot(
                    price money,                                      --price for the transportation used by the user (acording to distance)
                    tsp_type_id INTEGER,                              --foreign key to transptype
                    tsp_spot_id INTEGER,                              --foreign key to infospot
                    tsp_id SERIAL NOT NULL,
                    PRIMARY KEY (tsp_id)
);

CREATE TABLE spottype(
                    spot_type text,                                   --type of spot (bar, club, etc)
                    spt_type_id SERIAL NOT NULL,                         
                    PRIMARY KEY (spt_type_id)
);

CREATE TABLE pricetype(
                    prc_type text,                                    --type of price(menu, entry-fee, drink, etc)
                    prc_type_id SERIAL NOT NULL,
                    PRIMARY KEY (prc_type_id)
);

CREATE TABLE interests(
                    int_name text,                                    --interest available for the user to pick
                    interest_id SERIAL NOT NULL,
                    PRIMARY KEY (interest_id)
);

CREATE TABLE infospotprctype(
                    price money,                                      --amount to pay (varying value)
                    price_id SERIAL NOT NULL,
                    prc_type INTEGER,                                 --foreign key to pricetype
                    spot_id INTEGER,                                  --foreign key to infospot
                    PRIMARY KEY (price_id)
);



CREATE TABLE spotevents(
                    evnt_date time with time zone NOT NULL,           --date of the event
                    event_type_id SERIAL NOT NULL,
                    spot_id INTEGER,                                  --foreign key to infospot
                    evnttype_id INTEGER,                              --foreign key to eventtype
                    PRIMARY KEY(event_type_id)
);

CREATE TABLE infospot(
                    spot_name VARCHAR(50) NOT NULL,                   --name of the spot
                    spot_db_id SERIAL NOT NULL,                       --db internal Id
                    contact_info VARCHAR(30),                         --contact information for the spot
                    spot_address VARCHAR(70),                         --address information for the spot
                    spt_type INTEGER,                                  --foreign key to spottype
                    spt_info_prc_id INTEGER,                          --foreign key to infospotprctype
                    evnt_id INTEGER,                                  --foreign key to spotevents
                    crowd_spot_id INTEGER,
                    PRIMARY KEY (spot_db_id) 
);

CREATE TABLE friends(
                    mainuser_id INTEGER,                              --foreign key to users                         
                    friendship_status text,                           --status of friendship (accept, pending, etc)
                    frnd_user_id SERIAL NOT NULL,
                    grp_id INTEGER,                                   --foreign key to friend_group        
                    PRIMARY KEY (frnd_user_id)
);

CREATE TABLE friendgroup(
                    group_name text,                                  --friend group's name (user defined)
                    group_id SERIAL NOT NULL,
                    friends_id INTEGER,                               --foreign key to friends
                    gp_owner_id INTEGER,                              --foreign key to users
                    PRIMARY KEY (group_id)
);

CREATE TABLE eventtype(
                    evnt_type text,                                   --type of event happening (live music, etc)
                    evnt_type_id SERIAL UNIQUE NOT NULL,                  
                    PRIMARY KEY (evnt_type_id)
);

CREATE TABLE crowd(
                    crwd_date date,                                   --date of user presence 
                    crowd_id SERIAL NOT NULL,
                    user_ids INTEGER,                                 --foreign key to users
                    spt_id INTEGER,                                   --foreign key to infospot
                    PRIMARY KEY (crowd_id)
);  

--foreign keys

ALTER TABLE users
add constraint users_fk_friendgroup
foreign key (f_group_id) references friendgroup(group_id) 
ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE users
add constraint users_fk_userinterest
foreign key (user_interest_id) references userinterest(interest_user_id) 
ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE users
add constraint users_fk_friends
foreign key (frnds) references friends(frnd_user_id) 
ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE users
add constraint users_fk_crowd
foreign key (at_spot_id) references crowd(crowd_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE users
add constraint users_fk_tspuserspot
foreign key (trnsp) references tspuserspot(tsp_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE userinterest
add constraint userinterest_fk_users
foreign key (user_int_id) references users(user_db_id) 
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE userinterest
add constraint userinterest_fk_interests
foreign key (int_id) references interests(interest_id) 
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE friends
add constraint friends_fk_users
foreign key (mainuser_id) references users(user_db_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE friends
add constraint friends_fk_friendgroup
foreign key (grp_id) references friendgroup(group_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE transptype
add constraint transptype_fk_tspuserspot
foreign key (type_spt_id) references tspuserspot(tsp_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE tspuserspot
add constraint tspuserspot_fk_transptype
foreign key (tsp_type_id) references transptype(trnsp_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE tspuserspot
add constraint tspuserspot_fk_infospot
foreign key (tsp_spot_id) references infospot(spot_db_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE infospotprctype
add constraint infospotprctype_fk_pricetype
foreign key (prc_type) references pricetype(prc_type_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE infospotprctype
add constraint infospotprctype_fk_infospot
foreign key (spot_id) references infospot(spot_db_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE infospot
add constraint infospot_fk_spottype
foreign key (spt_type) references spottype(spt_type_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE infospot
add constraint infospot_fk_infospotprctype
foreign key (spt_info_prc_id) references infospotprctype(price_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE infospot
add constraint infospot_fk_spotevents
foreign key (evnt_id) references spotevents(event_type_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE infospot
add constraint infospot_fk_crowd
foreign key (crowd_spot_id) references crowd(crowd_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE spotevents
add constraint spotevents_fk_infospot
foreign key (spot_id) references infospot(spot_db_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE spotevents
add constraint spotevents_fk_eventtype
foreign key (evnttype_id) references eventtype(evnt_type_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE crowd
add constraint crowd_fk_users
foreign key (user_ids) references users(user_db_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE crowd
add constraint crowd_fk_infospot
foreign key (spt_id) references infospot(spot_db_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 
 
