insert into users (user_email, user_phone_number, user_nm, user_place) values ( 'jpl@gmail.com', '901234567', 'Joaquim Pires Lopes', 'Lisboa');  
insert into users (user_email, user_phone_number, user_nm, user_place) values ( 'amf@gmail.com', '912345678', 'Ana Maria Fonseca', 'Setúbal');  
insert into users (user_email, user_phone_number, user_nm, user_place) values ( 'pa@gmail.com', '923456789', 'Paula Antunes', 'Lisboa');  
insert into users (user_email, user_phone_number, user_nm, user_place) values ( 'jrs@mac.com', '934567890', 'Joana Ramalho Silva', 'Costa da Caparica');  
insert into users (user_email, user_phone_number, user_nm, user_place) values ( 'rms@gmail.com', '945678901', 'Rui Manuel Silva', 'Cascais');  


insert into transptype(trnsp_type, schedual) values('Metro', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Autocarro', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Barco', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Comboio', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Eletrico', to_date('2021.11.10','YYYY.MM.DD'));


insert into tspuserspot(price) values(1.50);
insert into tspuserspot(price) values(2);
insert into tspuserspot(price) values(3);
insert into tspuserspot(price) values(2.50);
insert into tspuserspot(price) values(1);


insert into spottype(spot_type) values('Restaurante');
insert into spottype(spot_type) values('Bar');
insert into spottype(spot_type) values('Casa Noturna');
insert into spottype(spot_type) values('Clube');
insert into spottype(spot_type) values('Discoteca');


insert into pricetype(prc_type) values('Entrada');
insert into pricetype(prc_type) values('Bebidas');
insert into pricetype(prc_type) values('Comidas');
insert into pricetype(prc_type) values('Shisha');
insert into pricetype(prc_type) values('Sobremesas');


insert into interests(int_name) values('Futebol');
insert into interests(int_name) values('Música');
insert into interests(int_name) values('Dança');
insert into interests(int_name) values('Vinho');
insert into interests(int_name) values('Karaoke');


insert into infospotprctype(price) values(50);
insert into infospotprctype(price) values(30);
insert into infospotprctype(price) values(10);
insert into infospotprctype(price) values(20);
insert into infospotprctype(price) values(100);


insert into spotevents(evnt_date) values('2021-11-03, 23:23:23' );
insert into spotevents(evnt_date) values('2021-10-03, 10:10:10' );
insert into spotevents(evnt_date) values('2021-09-03, 02:02:22' );
insert into spotevents(evnt_date) values('2021-08-03, 03:03:33' );
insert into spotevents(evnt_date) values('2021-07-03, 04:04:44' );


insert into infospot(spot_name, contact_info, spot_address) values('Misc by Tartar-ia', '918515254', 'Rua da Boavista 14, 1200-067 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values('Bohemio da Ribeira', '912932007', 'Tv. do Carvalho 27, 1200-097 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values('SUBA Restaurante', '211573055','R. de Santa Catarina 1, 1200-401 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values('Epur','213460519','Largo da Academia Nacional de Belas Artes 14, 1200-289 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values('Bono Lisboa','937141859', 'Calçada Ferragial 9, 1200-182 Lisboa');


insert into friends( friendship_status) values('Pedido Aceite');
insert into friends( friendship_status) values('Aguarde');
insert into friends( friendship_status) values('Pedido Recusado');


insert into friendgroup(group_name) values('Bairro Alto');
insert into friendgroup(group_name) values('Santos');
insert into friendgroup(group_name) values('Ana Aniversário');


insert into eventtype(evnt_type) values('Música ao Vivo');
insert into eventtype(evnt_type) values('Jantar');
insert into eventtype(evnt_type) values('Degustação de Vinho');
insert into eventtype(evnt_type) values('futebol + Bebidas');
insert into eventtype(evnt_type) values('Dança + Jantar');


insert into crowd(crwd_date) values(to_date('2021.11.11','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.10.12','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.09.13','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.08.14','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.07.15','YYYY.MM.DD'));

------------------------------------------------------------------------------------------------------------------------------------------------------------

insert into userinterest(int_id, user_int_id) values(1, 1);
insert into userinterest(int_id, user_int_id) values(2, 2);
insert into userinterest(int_id, user_int_id) values(3, 3);
insert into userinterest(int_id, user_int_id) values(4, 4);
insert into userinterest(int_id, user_int_id) values(5, 5);

UPDATE users SET frnds = 1, user_interest_id = 1, f_group_id = 1, trnsp = 1, at_spot_id = 1 WHERE user_db_id = 1;
UPDATE users SET frnds = 1, user_interest_id = 2, f_group_id = 2, trnsp = 2, at_spot_id = 2 WHERE user_db_id = 2;
UPDATE users SET frnds = 1, user_interest_id = 3, f_group_id = 3, trnsp = 3, at_spot_id = 3 WHERE user_db_id = 3;
UPDATE users SET frnds = 1, user_interest_id = 1, f_group_id = 1, trnsp = 4, at_spot_id = 4 WHERE user_db_id = 4;
UPDATE users SET frnds = 1, user_interest_id = 2, f_group_id = 2, trnsp = 5, at_spot_id = 5 WHERE user_db_id = 5;


UPDATE transptype SET type_spt_id=1 WHERE trnsp_id = 1;
UPDATE transptype SET type_spt_id=2 WHERE trnsp_id = 2;
UPDATE transptype SET type_spt_id=4 WHERE trnsp_id = 3;
UPDATE transptype SET type_spt_id=3 WHERE trnsp_id = 4;
UPDATE transptype SET type_spt_id=5 WHERE trnsp_id = 5;

UPDATE tspuserspot SET tsp_type_id = 1, tsp_spot_id = 5 WHERE tsp_id = 1; 
UPDATE tspuserspot SET tsp_type_id = 2, tsp_spot_id = 4 WHERE tsp_id = 2;
UPDATE tspuserspot SET tsp_type_id = 3, tsp_spot_id = 3 WHERE tsp_id = 4;
UPDATE tspuserspot SET tsp_type_id = 4, tsp_spot_id = 2 WHERE tsp_id = 3;
UPDATE tspuserspot SET tsp_type_id = 5, tsp_spot_id = 1 WHERE tsp_id = 5;

UPDATE infospotprctype SET prc_type = 2, spot_id = 1 WHERE price_id = 1;          
UPDATE infospotprctype SET prc_type = 4, spot_id = 2 WHERE price_id = 2;         
UPDATE infospotprctype SET prc_type = 1, spot_id = 3 WHERE price_id = 3;           
UPDATE infospotprctype SET prc_type = 5, spot_id = 4 WHERE price_id = 4;          
UPDATE infospotprctype SET prc_type = 3, spot_id = 5 WHERE price_id = 5;          

UPDATE spotevents SET spot_id = 1, evnttype_id = 1 WHERE event_type_id = 1; 
UPDATE spotevents SET spot_id = 2, evnttype_id = 2 WHERE event_type_id = 2; 
UPDATE spotevents SET spot_id = 3, evnttype_id = 3 WHERE event_type_id = 3; 
UPDATE spotevents SET spot_id = 4, evnttype_id = 4 WHERE event_type_id = 4; 
UPDATE spotevents SET spot_id = 5, evnttype_id = 5 WHERE event_type_id = 5; 

UPDATE infospot SET spt_type = 1, spt_info_prc_id = 2, evnt_id = 1, crowd_spot_id = 1 WHERE spot_db_id = 1; 
UPDATE infospot SET spt_type = 2, spt_info_prc_id = 4, evnt_id = 2, crowd_spot_id = 2 WHERE spot_db_id = 2;
UPDATE infospot SET spt_type = 3, spt_info_prc_id = 1, evnt_id = 3, crowd_spot_id = 3 WHERE spot_db_id = 3;
UPDATE infospot SET spt_type = 4, spt_info_prc_id = 5, evnt_id = 4, crowd_spot_id = 4 WHERE spot_db_id = 4;
UPDATE infospot SET spt_type = 5, spt_info_prc_id = 3, evnt_id = 5, crowd_spot_id = 5 WHERE spot_db_id = 5;

UPDATE friends SET mainuser_id = 1, grp_id = 3 WHERE frnd_user_id = 1; 
UPDATE friends SET mainuser_id = 2, grp_id = 2 WHERE frnd_user_id = 2;
UPDATE friends SET mainuser_id = 3, grp_id = 1 WHERE frnd_user_id = 3;

UPDATE friendgroup SET friends_id = 5, gp_owner_id = 1 WHERE group_id = 1;
UPDATE friendgroup SET friends_id = 4, gp_owner_id = 2 WHERE group_id = 2;
UPDATE friendgroup SET friends_id = 2, gp_owner_id = 3 WHERE group_id = 3;

UPDATE crowd SET user_ids = 1, spt_id = 1 WHERE crowd_id =1;
UPDATE crowd SET user_ids = 2, spt_id = 2 WHERE crowd_id =2;
UPDATE crowd SET user_ids = 3, spt_id = 3 WHERE crowd_id =3;
UPDATE crowd SET user_ids = 4, spt_id = 4 WHERE crowd_id =4;
UPDATE crowd SET user_ids = 5, spt_id = 5 WHERE crowd_id =5;
