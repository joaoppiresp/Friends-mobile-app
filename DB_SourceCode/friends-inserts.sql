insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('jpl@gmail.com','901234567','Joaquim Pires Lopes','M',to_date('1995.01.01','YYYY.MM.DD'),'Lisboa');  
insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('amf@gmail.com','912345678','Ana Maria Fonseca','F',to_date('1997.03.03','YYYY.MM.DD'),'Setúbal');  
insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('pa@gmail.com','923456789','Paula Antunes','F',to_date('1996.07.06','YYYY.MM.DD'),'Lisboa');  
insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('jrs@mac.com','934567890','Joana Ramalho Silva','F',to_date('1984.09.23','YYYY.MM.DD'),'Costa da Caparica');  
insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('rms@gmail.com','945678901','Rui Manuel Silva','M',to_date('1994.08.15','YYYY.MM.DD'),'Cascais');  
insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('jps@gmail.com','956789012','João Paulo Santos','M',to_date('1991.11.16','YYYY.MM.DD'),'Lisboa');  
insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('cfl@gmail.com','967890123','Cristina Fernandes Lopes','F',to_date('1996.01.07','YYYY.MM.DD'),'Cascais');  
insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('mpl@gmail.com','978901234','Miguel Pinto Leite','M',to_date('1994.01.07','YYYY.MM.DD'),'Cascais');  
insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('fcr@gmail.com','989012345','Francisco Costa Rosa','M',to_date('1998.02.16','YYYY.MM.DD'),'Costa da Caparica');  
insert into users (user_email, user_phone_number, user_nm, gender, user_bday, user_place) values ('efp@gmail.com','990123456','Elsa Fialho Pinto','F',to_date('1999.10.29','YYYY.MM.DD'),'Costa da Caparica');  

insert into transptype(trnsp_type, schedual) values('Metro', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Autocarro', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Barco', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Comboio', to_date('2021.11.10','YYYY.MM.DD'));

insert into tspuserspot(price) values(1.50);
insert into tspuserspot(price) values(2);
insert into tspuserspot(price) values(3);
insert into tspuserspot(price) values(2.50);

insert into spottype(spot_type) values('Restaurante');
insert into spottype(spot_type) values('Bar');
insert into spottype(spot_type) values('Casa Noturna');

insert into pricetype(prc_type) values('Entrada');
insert into pricetype(prc_type) values('Bebidas');
insert into pricetype(prc_type) values('Comidas');

insert into interests(int_name) values('Futebol');
insert into interests(int_name) values('Música');
insert into interests(int_name) values('Dança');
insert into interests(int_name) values('Vinho');
insert into interests(int_name) values('Karaoke');

insert into infospotprctype(price) values(50);
insert into infospotprctype(price) values(5);
insert into infospotprctype(price) values(10);

insert into friends (friendship_status) values('Pedido Aceite');
insert into friends (friendship_status) values('Aguarde');
insert into friends (friendship_status) values('Pedido Recusado');

insert into friendgroup (group_name) values('Bairro Alto');
insert into friendgroup (group_name) values('Santos');
insert into friendgroup (group_name) values('Ana Aniversário');

insert into eventtype(evnt_type) values('Música ao Vivo');
insert into eventtype(evnt_type) values('Jantar');
insert into eventtype(evnt_type) values('Degustação de Vinho');
insert into eventtype(evnt_type) values('futebol + Bebidas');
insert into eventtype(evnt_type) values('Dança + Jantar');

insert into crowd(crwd_date) values( to_date('2021.11.10','YYYY.MM.DD'));

insert into infospot(spot_name, contact_info, spot_address) values ('Misc by Tartar-ia', '918515254', 'Rua da Boavista 14, 1200-067 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values ('Bohemio da Ribeira', '912932007', 'Tv. do Carvalho 27, 1200-097 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values ('SUBA Restaurante', '211573055','R. de Santa Catarina nº 1, 1200-401 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values ('Epur','213460519','Largo da Academia Nacional de Belas Artes 14, 1200-289 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values ('Bono Lisboa','937141859', 'Calçada Ferragial 9, 1200-182 Lisboa');
