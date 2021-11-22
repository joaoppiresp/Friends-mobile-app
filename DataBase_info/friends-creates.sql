CREATE TABLE users(
                    user_email VARCHAR(60),                           --user email account
                    user_phone_number VARCHAR(20),                    --user phone number
                    user_public_id SERIAL UNIQUE NOT NULL,            --user Id for searching up
                    user_id SERIAL NOT NULL,                          --db Id
                    user_nm VARCHAR(60) not null,                     --username                      
                    user_place VARCHAR(40) not null,                  -- main city
                    PRIMARY KEY (user_id)
);

CREATE TABLE userinterest(
                    int_fk INTEGER,                                   --foreign key to interests         
                    users_fk INTEGER,                                 --foreign key to users
);
CREATE TABLE transptype(
                    trnsp_type text,                                  --type of transportation available
                    schedual date,                                    --schedual
                    trnsp_id SERIAL NOT NULL,                         --db internal Id
                    PRIMARY KEY (trnsp_id)
);

CREATE TABLE transportation(
                    price money,                                      --price for the transportation used by the user (acording to distance)
                    tsptype_fk INTEGER,                               --foreign key to transptype
                    crowd_fk INTEGER,                                 --foreign key to crowd
                    tsp_id SERIAL NOT NULL,
                    PRIMARY KEY (tsp_id)
);

CREATE TABLE spottype(
                    spot_type text,                                   --type of spot (bar, club, etc)
                    spt_id SERIAL NOT NULL,                         
                    PRIMARY KEY (spt_id)
);

CREATE TABLE pricetype(
                    prc_type text,                                    --type of price(menu, entry-fee, drink, etc)
                    prc_id SERIAL NOT NULL,
                    PRIMARY KEY (prc_id)
);

CREATE TABLE interests(
                    int_type text,                                    --interest available for the user to pick
                    interest_id SERIAL NOT NULL,
                    PRIMARY KEY (interest_id)
);

CREATE TABLE pricing(
                    price money,                                      --amount to pay (varying value)
                    prctype_fk INTEGER,                               --foreign key to pricetype
                    spot_fk INTEGER,                                  --foreign key to infospot
);



CREATE TABLE spotevents(
                    evnt_date TIMESTAMP,                              --date of the event
                    event_name VARCHAR(70),                           --Name of the event        
                    spot_fk INTEGER,                                  --foreign key to infospot
                    evnttype_fk INTEGER,                              --foreign key to eventtype
);

CREATE TABLE infospot(
                    spot_name VARCHAR(50) NOT NULL,                   --name of the spot
                    spot_id SERIAL NOT NULL,                       --db internal Id
                    contact_info VARCHAR(30),                         --contact information for the spot
                    spot_address VARCHAR(70),                         --address information for the spot
                    spttype_fk INTEGER,                               --foreign key to spottype
                    PRIMARY KEY (spot_id) 
);

CREATE TABLE friends(
                    mainuser_fk INTEGER,                              --foreign key to users (main user)                         
                    friendship_status text,                           --status of friendship (accept, pending, etc)
                    frnds_fk SERIAL INTEGER,                          --foreign key to users (friends)
                    grp_fk INTEGER,                                   --foreign key to friendgroup        
);

CREATE TABLE friendgroup(
                    group_name text,                                  --friend group's name (user defined)
                    group_id SERIAL NOT NULL,
                    owner_id INTEGER,                                 --foreign key to users
                    PRIMARY KEY (group_id)
);

CREATE TABLE eventtype(
                    evnt_type text,                                   --type of event happening (live music, etc)
                    evnt_id SERIAL UNIQUE NOT NULL,                  
                    PRIMARY KEY (evnt_id)
);

CREATE TABLE crowd(
                    crwd_date TIMESTAMP NOT NULL,                     --date of user presence 
                    crowd_id SERIAL NOT NULL,
                    user_fk INTEGER,                                 --foreign key to users
                    spt_fk INTEGER,                                   --foreign key to infospot
                    PRIMARY KEY (crowd_id)
);  

--foreign keys

ALTER TABLE friendgroup
add constraint friendgroup_fk_users
foreign key (owner_id) references users(user_id) 
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE userinterest
add constraint userinterest_fk_users
foreign key (users_fk) references users(user_id) 
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE userinterest
add constraint userinterest_fk_interests
foreign key (int_fk) references interests(interest_id) 
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE friends
add constraint friends_fk_users
foreign key (mainuser_fk) references users(user_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE friends
add constraint friends_fk_friendgroup
foreign key (grp_fk) references friendgroup(group_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE friends
add constraint friends_fk_users
foreign key (frnds_fk) references users(user_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE transportation
add constraint transportation_fk_transptype
foreign key (tsptype_fk) references transptype(trnsp_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE transportation
add constraint transportation_fk_crowd
foreign key (crowd_fk) references crowd(crowd_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE pricing
add constraint pricing_fk_pricetype
foreign key (prctype_fk) references pricetype(prc_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE pricing
add constraint pricing_fk_infospot
foreign key (spot_fk) references infospot(spot_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE infospot
add constraint infospot_fk_spottype
foreign key (spttype_fk) references spottype(spt_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE infospot
add constraint infospot_fk_crowd
foreign key (crowd_spot_id) references crowd(crowd_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE spotevents
add constraint spotevents_fk_infospot
foreign key (spot_fk) references infospot(spot_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE spotevents
add constraint spotevents_fk_eventtype
foreign key (evnttype_fk) references eventtype(evnt_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE crowd
add constraint crowd_fk_users
foreign key (user_fk) references users(user_db_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 

ALTER TABLE crowd
add constraint crowd_fk_infospot
foreign key (spt_fk) references infospot(spot_id)
ON DELETE NO ACTION ON UPDATE NO ACTION; 
 
