insert into users (user_email, user_nm, user_place)                    values ( 'jpl@gmail.com', 'Joaquim Pires Lopes', 'Lisboa');  
insert into users (user_email, user_phone_number, user_nm)             values ( 'amf@mac.com', '912345678', 'Ana Maria Fonseca');  
insert into users (user_email, user_nm, user_place)                    values ( 'pa@hotmail.com', 'Paula Antunes', 'lisboa');  
insert into users (user_email, user_phone_number, user_nm)             values ( 'jrs@mac.com', '934567890', 'Joana Ramalho Silva');  
insert into users (user_email, user_nm, user_place)                    values ( 'rms@gmail.com', 'Rui Manuel Silva', 'Cascais');  
insert into users (user_email, user_phone_number, user_nm)             values ( 'ms@hotmail.com', '945678901', 'Manuel Silva');  
insert into users (user_email, user_phone_number, user_nm, user_place) values ( 'lam@hotmail.com', '956789012', 'Lionel Andres Messi', 'cascais');  
insert into users (user_email, user_phone_number, user_nm, user_place) values ( 'njr@hotmail.com', '967890123', 'Neymar JR', 'Amadora');  
insert into users (user_email, user_phone_number, user_nm, user_place) values ( 'kbl@mac.com', '978901234', 'Kylian Mabppé Lottin', 'amadora');  
insert into users (user_email, user_phone_number, user_nm, user_place) values ( 'cr7@mac.com', '989012345', 'Cristiano Ronaldo', 'Odivelas');


insert into transptype(trnsp_type, schedual) values('Metro', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Autocarro', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Barco', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Comboio', to_date('2021.11.10','YYYY.MM.DD'));
insert into transptype(trnsp_type, schedual) values('Eletrico', to_date('2021.11.10','YYYY.MM.DD'));


insert into transportation(price) values(1.50);
insert into transportation(price) values(2);
insert into transportation(price) values(3);
insert into transportation(price) values(2.50);
insert into transportation(price) values(1);


insert into spottype(spot_type) values('Restaurante');
insert into spottype(spot_type) values('Bar');
insert into spottype(spot_type) values('Casa Noturna');
insert into spottype(spot_type) values('Clube');
insert into spottype(spot_type) values('Discoteca');
insert into spottype(spot_type) values('lounge');
insert into spottype(spot_type) values('sports bars');


insert into pricetype(prc_type) values('Entrada');
insert into pricetype(prc_type) values('Bebidas');
insert into pricetype(prc_type) values('Comida');
insert into pricetype(prc_type) values('Shisha');
insert into pricetype(prc_type) values('Sobremesas');
insert into pricetype(prc_type) values('consumo minimo');


insert into interests(int_type) values('Futebol');
insert into interests(int_type) values('Música');
insert into interests(int_type) values('Dança');
insert into interests(int_type) values('Vinho');
insert into interests(int_type) values('Karaoke');
insert into interests(int_type) values('desportos aquaticos');
insert into interests(int_type) values('corrida');
insert into interests(int_type) values('equitação');
insert into interests(int_type) values('snowboarding');
insert into interests(int_type) values('artes marcias');
insert into interests(int_type) values('netflix');
insert into interests(int_type) values('sunsets');
insert into interests(int_type) values('convivios');
insert into interests(int_type) values('blind dates');


insert into pricing(price) values(50);
insert into pricing(price) values(30);
insert into pricing(price) values(10);
insert into pricing(price) values(20);
insert into pricing(price) values(100);
insert into pricing(price) values(6.5);
insert into pricing(price) values(12);
insert into pricing(price) values(15.5);
insert into pricing(price) values(25);
insert into pricing(price) values(3);
insert into pricing(price) values(55);
insert into pricing(price) values(37);


insert into spotevents(evnt_date, event_name) values('2021-11-23 17:45:00', 'Noite de Champions League');
insert into spotevents(evnt_date, event_name) values('2021-11-25 20:30:00', 'Andrea Bocelli ao Vivo');
insert into spotevents(evnt_date, event_name) values('2021-09-26 19:00:00', 'Noite de Kizomba');
insert into spotevents(evnt_date, event_name) values('2021-08-21 21:00:00', 'Picanhas e os Melhores Vinhos');
insert into spotevents(evnt_date, event_name) values('2021-07-03 21:30:00', 'Noite de Karaoke');
insert into spotevents(evnt_date, event_name) values('2021-11-24 18:45:00', 'Noite de Porto vs Benfica');
insert into spotevents(evnt_date, event_name) values('2021-10-27 18:30:00', 'Roberta Miranada ao Vivo');
insert into spotevents(evnt_date, event_name) values('2021-09-30 22:10:10', 'Noite de Samba');
insert into spotevents(evnt_date, event_name) values('2021-08-29 15:45:00', 'Vitelas e os Melhores Vinhos');
insert into spotevents(evnt_date, event_name) values('2021-07-28 15:30:00', 'Tarde de Karaoke');


insert into infospot(spot_name, spot_address) values('Misc by Tartar-ia', 'Rua da Boavista 14, 1200-067 Lisboa');
insert into infospot(spot_name, contact_info) values('Bohemio da Ribeira', '912932007');
insert into infospot(spot_name, spot_address) values('SUBA Restaurante','R. de Santa Catarina 1, 1200-401 Lisboa');
insert into infospot(spot_name, contact_info) values('Epur','213460519');
insert into infospot(spot_name, contact_info) values('Bono Lisboa','937141859');
insert into infospot(spot_name,spot_address) values('Restaurante Sinal Verde','Calçada Do Combro 40/44 1200-115 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values('Restaurante Pedra De Sal', '912932007', 'R.do Diário de Notícias 43 1200-365 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values('ALMEIDA & HERRERA LDA', '214600659','TRAVESSA DO ALECRIM 4 1200-019 LISBOA');
insert into infospot(spot_name, contact_info, spot_address) values('Restaurante Farta Brutos','213426756','Travessa da Espera 16 1200 Lisboa');
insert into infospot(spot_name, contact_info, spot_address) values('Restaurante Brutos Farta','234267567','Rua da raespa 10 1200 Lisboa');


insert into friends( friendship_status) values('Pedido Aceite');
insert into friends( friendship_status) values('Aguarde');
insert into friends( friendship_status) values('Pedido Recusado');
insert into friends( friendship_status) values('Pedido Aceite');
insert into friends( friendship_status) values('Aguarde');
insert into friends( friendship_status) values('Pedido Recusado');
insert into friends( friendship_status) values('Pedido Aceite');
insert into friends( friendship_status) values('Aguarde');
insert into friends( friendship_status) values('Pedido Recusado');
insert into friends( friendship_status) values('Pedido Aceite');


insert into friendgroup(group_name) values('Nigthhhhhhhhhh');
insert into friendgroup(group_name) values('Mexer as madeiras');
insert into friendgroup(group_name) values('Ana Aniversário');
insert into friendgroup(group_name) values('Bocelli Goooo');
insert into friendgroup(group_name) values('Cantar ate cair no Karaoke');
insert into friendgroup(group_name) values('Vamos ao Noite de Champions');


insert into eventtype(evnt_type) values('Música ao Vivo');
insert into eventtype(evnt_type) values('Jantar');
insert into eventtype(evnt_type) values('Degustação de Vinho');
insert into eventtype(evnt_type) values('Futebol + Bebidas');
insert into eventtype(evnt_type) values('Dança + Jantar');
insert into eventtype(evnt_type) values('rock night');


insert into crowd(crwd_date) values(to_date('2021.11.23','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.11.25','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.09.26','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.08.21','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.07.03','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.11.24','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.10.27','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.09.30','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.08.29','YYYY.MM.DD'));
insert into crowd(crwd_date) values(to_date('2021.07.28','YYYY.MM.DD'));


insert into userinterest(int_fk, users_fk) values(1, 1);
insert into userinterest(int_fk, users_fk) values(2, 2);
insert into userinterest(int_fk, users_fk) values(3, 3);
insert into userinterest(int_fk, users_fk) values(4, 4);
insert into userinterest(int_fk, users_fk) values(5, 5);
insert into userinterest(int_fk, users_fk) values(5, 6);
insert into userinterest(int_fk, users_fk) values(3, 7);
insert into userinterest(int_fk, users_fk) values(1, 8);
insert into userinterest(int_fk, users_fk) values(2, 9);
insert into userinterest(int_fk, users_fk) values(4, 9);


UPDATE transportation SET tsptype_fk = 1, crowd_fk = 9 WHERE tsp_id = 1; 
UPDATE transportation SET tsptype_fk = 2, crowd_fk = 7 WHERE tsp_id = 2;
UPDATE transportation SET tsptype_fk = 3, crowd_fk = 5 WHERE tsp_id = 4;
UPDATE transportation SET tsptype_fk = 4, crowd_fk = 3 WHERE tsp_id = 3;
UPDATE transportation SET tsptype_fk = 5, crowd_fk = 1 WHERE tsp_id = 5;
UPDATE transportation SET tsptype_fk = 1, crowd_fk = 2 WHERE tsp_id = 1; 
UPDATE transportation SET tsptype_fk = 2, crowd_fk = 4 WHERE tsp_id = 2;
UPDATE transportation SET tsptype_fk = 3, crowd_fk = 6 WHERE tsp_id = 4;
UPDATE transportation SET tsptype_fk = 4, crowd_fk = 8 WHERE tsp_id = 3;
UPDATE transportation SET tsptype_fk = 5, crowd_fk = 10 WHERE tsp_id = 5;


UPDATE pricing SET prctype_fk = 2, spot_fk = 1 WHERE pri_id = 1;          
UPDATE pricing SET prctype_fk = 4, spot_fk = 2 WHERE pri_id = 2;         
UPDATE pricing SET prctype_fk = 1, spot_fk = 3 WHERE pri_id = 3;           
UPDATE pricing SET prctype_fk = 5, spot_fk = 4 WHERE pri_id = 4;          
UPDATE pricing SET prctype_fk = 3, spot_fk = 5 WHERE pri_id = 5;          
UPDATE pricing SET prctype_fk = 6, spot_fk = 6 WHERE pri_id = 6;          
UPDATE pricing SET prctype_fk = 4, spot_fk = 7 WHERE pri_id = 7;         
UPDATE pricing SET prctype_fk = 1, spot_fk = 8 WHERE pri_id = 8;           
UPDATE pricing SET prctype_fk = 5, spot_fk = 9 WHERE pri_id = 9;          
UPDATE pricing SET prctype_fk = 6, spot_fk = 10 WHERE pri_id = 10; 
UPDATE pricing SET prctype_fk = 5, spot_fk = 9 WHERE pri_id = 11;          
UPDATE pricing SET prctype_fk = 3, spot_fk = 10 WHERE pri_id = 12;


UPDATE spotevents SET spot_fk = 1, evnttype_fk = 1 WHERE spot_evnt_id = 1; 
UPDATE spotevents SET spot_fk = 2, evnttype_fk = 2 WHERE spot_evnt_id = 2; 
UPDATE spotevents SET spot_fk = 3, evnttype_fk = 3 WHERE spot_evnt_id = 3; 
UPDATE spotevents SET spot_fk = 4, evnttype_fk = 4 WHERE spot_evnt_id = 4; 
UPDATE spotevents SET spot_fk = 5, evnttype_fk = 5 WHERE spot_evnt_id = 5; 
UPDATE spotevents SET spot_fk = 6, evnttype_fk = 6 WHERE spot_evnt_id = 6; 
UPDATE spotevents SET spot_fk = 7, evnttype_fk = 1 WHERE spot_evnt_id = 7; 
UPDATE spotevents SET spot_fk = 8, evnttype_fk = 4 WHERE spot_evnt_id = 8; 
UPDATE spotevents SET spot_fk = 9                  WHERE spot_evnt_id = 9; 
UPDATE spotevents SET spot_fk = 10                 WHERE spot_evnt_id = 10; 


UPDATE infospot SET spttype_fk = 2 WHERE spot_id = 1; 
UPDATE infospot SET spttype_fk = 1 WHERE spot_id = 2;
UPDATE infospot SET spttype_fk = 4 WHERE spot_id = 3;
UPDATE infospot SET spttype_fk = 1 WHERE spot_id = 4;
UPDATE infospot SET spttype_fk = 3 WHERE spot_id = 5;
UPDATE infospot SET spttype_fk = 2 WHERE spot_id = 6; 
UPDATE infospot SET spttype_fk = 5 WHERE spot_id = 7;
UPDATE infospot SET spttype_fk = 4 WHERE spot_id = 8;
UPDATE infospot SET spttype_fk = 1 WHERE spot_id = 9;
UPDATE infospot SET spttype_fk = 2 WHERE spot_id = 10;


UPDATE friends SET mainuser_fk = 1 WHERE friend_id = 1; 
UPDATE friends SET mainuser_fk = 2 WHERE friend_id = 2;
UPDATE friends SET mainuser_fk = 3 WHERE friend_id = 3;
UPDATE friends SET mainuser_fk = 4 WHERE friend_id = 4; 
UPDATE friends SET mainuser_fk = 5 WHERE friend_id = 5;
UPDATE friends SET mainuser_fk = 6 WHERE friend_id = 6;
UPDATE friends SET mainuser_fk = 7 WHERE friend_id = 7; 
UPDATE friends SET mainuser_fk = 8 WHERE friend_id = 8;
UPDATE friends SET mainuser_fk = 9 WHERE friend_id = 9;
UPDATE friends SET mainuser_fk = 10 WHERE friend_id = 10;


UPDATE friendgroup SET owner_id = 2, friend_fk = 1 WHERE group_id = 1;
UPDATE friendgroup SET owner_id = 2, friend_fk = 4 WHERE group_id = 1;
UPDATE friendgroup SET owner_id = 2, friend_fk = 7 WHERE group_id = 1;
UPDATE friendgroup SET owner_id = 2, friend_fk = 10 WHERE group_id = 1;


UPDATE friendgroup SET owner_id = 3, friend_fk = 1 WHERE group_id = 2;
UPDATE friendgroup SET owner_id = 3, friend_fk = 4 WHERE group_id = 2;
UPDATE friendgroup SET owner_id = 3, friend_fk = 7 WHERE group_id = 2;
UPDATE friendgroup SET owner_id = 3, friend_fk = 10 WHERE group_id = 2;


UPDATE friendgroup SET owner_id = 5, friend_fk = 1 WHERE group_id = 3;
UPDATE friendgroup SET owner_id = 5, friend_fk = 4 WHERE group_id = 3;
UPDATE friendgroup SET owner_id = 5, friend_fk = 7 WHERE group_id = 3;
UPDATE friendgroup SET owner_id = 5, friend_fk = 10 WHERE group_id = 3;


UPDATE friendgroup SET owner_id = 6, friend_fk = 1 WHERE group_id = 4;
UPDATE friendgroup SET owner_id = 6, friend_fk = 4 WHERE group_id = 4;
UPDATE friendgroup SET owner_id = 6, friend_fk = 7 WHERE group_id = 4;
UPDATE friendgroup SET owner_id = 6, friend_fk = 10 WHERE group_id = 4;


UPDATE friendgroup SET owner_id = 8, friend_fk = 1 WHERE group_id = 5;
UPDATE friendgroup SET owner_id = 8, friend_fk = 4 WHERE group_id = 5;
UPDATE friendgroup SET owner_id = 8, friend_fk = 7 WHERE group_id = 5;
UPDATE friendgroup SET owner_id = 8, friend_fk = 10 WHERE group_id = 5;


UPDATE crowd SET user_fk = 1, spt_fk = 1 WHERE crowd_id =1;
UPDATE crowd SET user_fk = 2, spt_fk = 1 WHERE crowd_id =1;
UPDATE crowd SET user_fk = 3, spt_fk = 2 WHERE crowd_id =2;
UPDATE crowd SET user_fk = 4, spt_fk = 2 WHERE crowd_id =2;
UPDATE crowd SET user_fk = 5, spt_fk = 3 WHERE crowd_id =5;
UPDATE crowd SET user_fk = 6, spt_fk = 4 WHERE crowd_id =6;
UPDATE crowd SET user_fk = 7, spt_fk = 5 WHERE crowd_id =7;
UPDATE crowd SET user_fk = 8, spt_fk = 6 WHERE crowd_id =8;
UPDATE crowd SET user_fk = 9, spt_fk = 7 WHERE crowd_id =9;
UPDATE crowd SET user_fk = 10, spt_fk = 8 WHERE crowd_id =10;

