

insert into users (user_email, user_phone_number, user_nm, frnds, gender, user_bday, user_interest_id, f_group_id, trnsp, at_spot_id, user_place) values ( 'jpl@gmail.com', '901234567', 'Joaquim Pires Lopes', 1, 'M', to_date('1995.01.01','YYYY.MM.DD'), 1, 1, 1, 1, 'Lisboa');  
insert into users (user_email, user_phone_number, user_nm, frnds, gender, user_bday, user_interest_id, f_group_id, trnsp, at_spot_id, user_place) values ( 'amf@gmail.com', '912345678', 'Ana Maria Fonseca', 1, 'F', to_date('1997.03.03','YYYY.MM.DD'), 2, 1, 1, 1, 'Setúbal');  
insert into users (user_email, user_phone_number, user_nm, frnds, gender, user_bday, user_interest_id, f_group_id, trnsp, at_spot_id, user_place) values ( 'pa@gmail.com', '923456789', 'Paula Antunes', 'F', 1, to_date('1996.07.06','YYYY.MM.DD'), 3, 1, 1, 1, 'Lisboa');  
insert into users (user_email, user_phone_number, user_nm, frnds, gender, user_bday, user_interest_id, f_group_id, trnsp, at_spot_id, user_place) values ( 'jrs@mac.com', '934567890', 'Joana Ramalho Silva', 1, 'F', to_date('1984.09.23','YYYY.MM.DD'), 4, 1, 1, 1, 'Costa da Caparica');  
insert into users (user_email, user_phone_number, user_nm, frnds, gender, user_bday, user_interest_id, f_group_id, trnsp, at_spot_id, user_place) values ( 'rms@gmail.com', '945678901', 'Rui Manuel Silva', 1, 'M', to_date('1994.08.15','YYYY.MM.DD'), 5, 1, 1, 1, 'Cascais');  


insert into userinterest(int_id, user_int_id) values(1, 5);
insert into userinterest(int_id, user_int_id) values(2, 4);
insert into userinterest(int_id, user_int_id) values(3, 3);
insert into userinterest(int_id, user_int_id) values(4, 2);
insert into userinterest(int_id, user_int_id) values(5, 1);


insert into transptype(trnsp_type, schedual, type_spt_id) values('Metro', to_date('2021.11.10','YYYY.MM.DD'),1);
insert into transptype(trnsp_type, schedual, type_spt_id) values('Autocarro', to_date('2021.11.10','YYYY.MM.DD'),2);
insert into transptype(trnsp_type, schedual, type_spt_id) values('Barco', to_date('2021.11.10','YYYY.MM.DD'),3);
insert into transptype(trnsp_type, schedual, type_spt_id) values('Comboio', to_date('2021.11.10','YYYY.MM.DD'),1);
insert into transptype(trnsp_type, schedual, type_spt_id) values('Eletrico', to_date('2021.11.10','YYYY.MM.DD'),1);


insert into tspuserspot(price, prc_type, spot_id, tsp_type_id, tsp_spot_id) values(1.50, 1, 1);
insert into tspuserspot(price, prc_type, spot_id, tsp_type_id, tsp_spot_id) values(2, 1, 1);
insert into tspuserspot(price, prc_type, spot_id, tsp_type_id, tsp_spot_id) values(3, 1, 1);
insert into tspuserspot(price, prc_type, spot_id, tsp_type_id, tsp_spot_id) values(2.50, 1, 1);
insert into tspuserspot(price, prc_type, spot_id, tsp_type_id, tsp_spot_id) values(1, 1, 1);

insert into spottype(spot_type) values('Restaurante');
insert into spottype(spot_type) values('Bar');
insert into spottype(spot_type) values('Casa Noturna');
insert into spottype(spot_type) values('Clube');
insert into spottype(spot_type) values('Discoteca');


insert into pricetype(prc_type, prc_type_id) values('Entrada', 1);
insert into pricetype(prc_type, prc_type_id) values('Bebidas', 1);
insert into pricetype(prc_type, prc_type_id) values('Comidas', 1);
insert into pricetype(prc_type, prc_type_id) values('Shisha', 1);
insert into pricetype(prc_type, prc_type_id) values('Sobremesas', 1);


insert into interests(int_name) values('Futebol');
insert into interests(int_name) values('Música');
insert into interests(int_name) values('Dança');
insert into interests(int_name) values('Vinho');
insert into interests(int_name) values('Karaoke');


insert into infospotprctype(price, prc_type, spot_id) values(50, 1, 1);
insert into infospotprctype(price, prc_type, spot_id) values(30, 1, 1);
insert into infospotprctype(price, prc_type, spot_id) values(10, 1, 1);
insert into infospotprctype(price, prc_type, spot_id) values(20, 1, 1);
insert into infospotprctype(price, prc_type, spot_id) values(100, 1, 1);


insert into spotevents(evnt_date, spot_id, evnttype_id) values(to_date('2021.11.15','YYYY.MM.DD'), 1, 1);
insert into spotevents(evnt_date, spot_id, evnttype_id) values(to_date('2021.11.14','YYYY.MM.DD'), 2, 2);
insert into spotevents(evnt_date, spot_id, evnttype_id) values(to_date('2021.11.13','YYYY.MM.DD'), 3, 3);
insert into spotevents(evnt_date, spot_id, evnttype_id) values(to_date('2021.11.12','YYYY.MM.DD'), 4, 4);
insert into spotevents(evnt_date, spot_id, evnttype_id) values(to_date('2021.11.11','YYYY.MM.DD'), 4, 4);


insert into infospot(spot_name, contact_info, spot_address, spt_type, spt_info_prc_id, evnt_id, crowd_spot_id) values('Misc by Tartar-ia', '918515254', 'Rua da Boavista 14, 1200-067 Lisboa', 1, 1, 1, 1);
insert into infospot(spot_name, contact_info, spot_address, spt_type, spt_info_prc_id, evnt_id, crowd_spot_id) values('Bohemio da Ribeira', '912932007', 'Tv. do Carvalho 27, 1200-097 Lisboa', 2, 3, 2, 1);
insert into infospot(spot_name, contact_info, spot_address, spt_type, spt_info_prc_id, evnt_id, crowd_spot_id) values('SUBA Restaurante', '211573055','R. de Santa Catarina 1, 1200-401 Lisboa', 1, 1, 3, 1);
insert into infospot(spot_name, contact_info, spot_address, spt_type, spt_info_prc_id, evnt_id, crowd_spot_id) values('Epur','213460519','Largo da Academia Nacional de Belas Artes 14, 1200-289 Lisboa', 3, 2, 4, 1);
insert into infospot(spot_name, contact_info, spot_address, spt_type, spt_info_prc_id, evnt_id, crowd_spot_id) values('Bono Lisboa','937141859', 'Calçada Ferragial 9, 1200-182 Lisboa', 3, 2, 5, 1);


insert into friends(mainuser_id, friendship_status, grp_id) values(1, 'Pedido Aceite', 1);
insert into friends(mainuser_id, friendship_status, grp_id) values(2, 'Aguarde', 2);
insert into friends(mainuser_id, friendship_status, grp_id) values(3, 'Pedido Recusado', 3);


insert into friendgroup(group_name, friends_id, gp_owner_id) values('Bairro Alto', 5, 4);
insert into friendgroup(group_name, friends_id, gp_owner_id) values('Santos', 3, 2);
insert into friendgroup(group_name, friends_id, gp_owner_id) values('Ana Aniversário', 1, 2);


insert into eventtype(evnt_type) values('Música ao Vivo');
insert into eventtype(evnt_type) values('Jantar');
insert into eventtype(evnt_type) values('Degustação de Vinho');
insert into eventtype(evnt_type) values('futebol + Bebidas');
insert into eventtype(evnt_type) values('Dança + Jantar');


insert into crowd(crwd_date, user_ids, spt_id) values(to_date('2021.06.01','YYYY.MM.DD'), 1, 2);
insert into crowd(crwd_date, user_ids, spt_id) values(to_date('2021.07.02','YYYY.MM.DD'), 2, 3);
insert into crowd(crwd_date, user_ids, spt_id) values(to_date('2021.08.03','YYYY.MM.DD'), 3, 4);
insert into crowd(crwd_date, user_ids, spt_id) values(to_date('2021.09.04','YYYY.MM.DD'), 4, 5);
insert into crowd(crwd_date, user_ids, spt_id) values(to_date('2021.10.05','YYYY.MM.DD'), 5, 4);

