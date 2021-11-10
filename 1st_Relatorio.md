Logo Universidade
#Friend's

#Projeto realizado por João Miguel Pires, nº20200459 e Hélio Divaldo, nº20190928 #IADE, Faculdade de Design, Tecnologia e Comunicação #Realizado no âmbito das unidades curriculares de Matemática Discreta (Rodolfo Bendoyro), Base de Dados (Miguel Boavida), Competências Comunicacionais (Alexandra Santos), Programação Orientada a Objetos (Miguel Bugalho), Progamação de Dispositivos Móveis (João Dias) e Projeto de Desenvolvimento Móvel (Pedro Rosa).

##Relatório de Progresso
No âmbito do projeto de desenvolvimento mobile e tendo em conta os recentes desenvolvimentos na vida noturna em Lisboa, como desacatos e mudanças recorrêntes nas medidas de segurança impostas, propomo-nos a criar uma app que facilite aos jovens manterem-se a par de tudo á sua volta quando se aventuram pela noite. Acreditamos que a Friend's é uma ideia bastante atual, pois cada vez mais os jovens utilizam a vida noturna como meio de descontrair, renovar as energias e de fugir á realidade caótica das respondabilidades.

###Ferramentas e aplicações semelhantes
Algumas das aplicações atualmente existentes no mercado, com semelhanças á nossa são:

-*Foursquare - Rede geossocial e de microblogging que permite ao utilizador indicar onde se encontra e procurar por contatos seus que estejam próximo desse local. -*Zomato - Serviço de procura por estabelecimentos de restauração, bares, cafés e restaurantes, classificados com base em reviews de utilizadores e outros aspetos.

###Enquadramento e objetivo
A app tem como público-alvo jovens na faixa etária dos 18 anos, que tenham uma vida social ativa e gostem de frequentar as zonas, bares e clubes mais populares. Também será uma ajuda para os jovens mais tímidos que procuram novas amizades e desejam melhorar as suas interações sociais.

A app 'Friend's' tem como principal objetivo facilitar a vida social dos jovens, ajudando a manté-los seguros quando se aventuram na noite.

###Palavras-Chave
*Mobile

*Amigo

*Procurar

*Bares

*Mood

*Vida Noturna

*Social

###Tipos de utilizadores e funcionalidades
Registered User

Registo de amigos e todas as funcionalidades que estes trazem (i.e., Localização dos amigos, 'instant ping'*, etc);
Pesquisa por estabelecimentos e acesso ás suas informações;
Registo de gostos, isto é, informações gerais sobre o utilizador (estas informações serão utilizadas para 'match-making';
'Matching' com outros utilizadores na mesma zona com gostos iguais;
Anonymous User

Acesso ao mapa interativo;
Pesquisa por estabelecimentos e acesso ás suas informações;
*'instant ping', isto é, a possibilidade de enviar uma notificação a um utilizador 'amigo' com uma mensagem automática (i.e., "Estou a caminho!", "Liga-me por favor", etc);

###Dados & Permissões
Localização do utilizador
Conta e-mail
Lista de amigos
Gostos (registados pelo utilizador)
'ID' do utilizador
###Descrição de Casos de Utilização
Use Case 1 - Map Access (Registered User)
Descrição	Use Case destinado à apresentação do movimento de pessoas nas ‘zonas noturnas’ em Lisboa num mapa interativo para 'Non-Anonymous Users);
Pre-Condições	1. O utilizador está registado na aplicação;
          | 2. O utilizador tem acesso á internet (wifi ou dados móveis);
--------------|--------------------------------------------------------------
Cenário Princ.| 1. O utilizador abre a aplicação; | | 1.1. O utilizador introduz as suas credênciais; | | 1.4. O utilizador é direcionado para a interface principal da aplicação (main); |
| 2. O utilizador clica no mapa interativo; | | 3. O utilizador observa no mapa a densidade de pessoas na zona que pretender (Lisboa); | | 4. O utilizador clica nas opções; | | 4.1. O menu das opções é apresentado e o utilizador faz a sua seleção; | | 4.1.1. Use Case ** --------------|--------------------------
Cenário | Alternativo | 1.2. As credênciais do utilizador não se encontram registadas no sitema; | | A) Use Case ** | | 1.3. O utilizador introduz uma password incorreta; | | B) Use Case ** | | 2.2. O mapa interativo não abre; | | C) *** | | 3.1. O utilizador fecha o mapa e regressa á interfáce principal (main); --------------|------------------------------------------------------------------------- Pós | - O utilizador regressa á interface principal (main); Condições | --------------|------------------------------------------------------- Cenários | - O utilizador fecha a aplicação a qualquer momento; Exceção | --------------|------------------------------------------------------ Pós | - N\A Condições | --------------|--------

Use Case 2 - Map Access (Anonymous User)
Descrição	Use Case destinado à apresentação do movimento de pessoas nas ‘zonas noturnas’ em Lisboa num mapa interativo para 'Anonymous Users);
Pré-Condições	1. O utilizador não está registado na aplicação;
          | 2. O utilizador tem acesso á internet (wifi ou dados móveis);
--------------|--------------------------------------------------------------
Cenário Princ.| 1. O utilizador abre a aplicação; | | 1.1. O utilizador é direcionado para a interface principal da aplicação (main); |
| 2. O utilizador clica no mapa interativo; | | 3. O utilizador observa no mapa a densidade de pessoas na zona que pretender (Lisboa); | | 4. O utilizador clica nas opções; | | 4.1. O menu das opções é apresentado e o utilizador faz a sua seleção; | | 4.1.1. Use Case ** --------------|--------------------------
Cenário | Alternativo | 2.1. O mapa interativo não abre; | | C) *** | | 3.1. O utilizador fecha o mapa e regressa á interfáce principal (main); --------------|------------------------------------------------------------------------- Pós | - O utilizador regressa á interface principal (main); Condições | --------------|------------------------------------------------------- Cenários | - O utilizador fecha a aplicação a qualquer momento; Exceção | --------------|------------------------------------------------------ Pós | - N\A Condições | --------------|-------

Use Case 3 - Add Friend (Registered Users only)
Descrição	Use Case destinado á adição de 'amigos' do utilizador;
Pré-Condições	1. O utilizador está registado na aplicação;
          | 2. O utilizador tem acesso á internet (wifi ou dados móveis);
          | 3. O utilizador possui o "ID" do perfil do utilizador amigo;
--------------|-------------------------------------------------------------
Cenário Princ.| 1. O utilizador abre a aplicação; | | 1.1. O utilizador é direcionado para a interface principal da aplicação (main); |
| 2. O utilizador clica na tab 'Friends'; | | 2.1. O utilizador é redirecionado para a interface dos amigos (friends); | | 3. O utilizador clica no '+', para adicionar um novo amigo e insere o 'ID' do utilizador que pertender adicionar á lista de amigos; | | 3.3. O amigo é adicionado com sucesso e as novas funções ficam disponivéis; --------------|-------------------------------------------------------------------------------
Cenário | Alternativo | 2.2. O utilizador clica num amigo já existente; |
| A) Use Case ** | | 3.1. O utilizador 'amigo' recebe uma notificação de 'friend request' e não a aceita; | | B) O utilizador que fez o 'friend request' recebe uma notificação com a messagem "Amigo não adicionado"; | B.1) O utilizador tenta novamente; | | 3.2. O utilizador insere um 'ID' errado ou inexistente; | | B.1) O utilizador tenta novamente; --------------|--------------------------------------- Pós | - O utilizador regressa á interface principal (main); Condições | --------------|------------------------------------------------------- Cenários | - O utilizador fecha a aplicação a qualquer momento; Exceção |
--------------|------------------------------------------------------ Pós | - N\A Condições | --------------|-------

Use Case 4 - Search (All Users)
Descrição	Use Case destinado á procura por estabelecimentos pelo utilizador;
Pré-Condições	1. O utilizador está registado na aplicação;
          | 2. O utilizador tem acesso á internet (wifi ou dados móveis);
          | 3. O utilizador sabe o nome do estabelecimento que procura ou, alternativamente, a sua localização relativa;
--------------|-------------------------------------------------------------------------------------------------------------
Cenário Princ.| 1. O utilizador abre a aplicação; | | 1.1. O utilizador é direcionado para a interface principal da aplicação (main); |
| 2. O utilizador clica no mapa interativo; | | 2.1. O utilizador seleciona a 'search bar' e insere o nome do estabelecimento que procura; | | 2.3. O utilizador sabe a localização relativa do estabelecimento e procura manualmente no mapa; | | 3. O utilizador clica no icon do estabelecimento; | | 3.1. O utilizador é redirecionado para a interface de dados dos estabelecimentos e visualiza a informação disponível; --------------|-------------------------------------------------------------------------------------------------------------------------
Cenário | Alternativo | 2.2. O utilizador insere um nome errado ou não registado na aplicação; |
| A) É mostrada uma mensagem de erro; | A.1) O utilizador tenta procurar novamente; | | 3.1. Ainda não existem informações disponiveis para o estabelecimento procurado pelo utilizador; | | B) É retornada uma mensagem de erro ao utilizador (i.e., 'Info não disponivel'); --------------|------------------------------------------------------------------------------------- Pós | - O utilizador regressa á interface do mapa interativo (map);

Condições	- O utilizador regressa á interface principal (main);
Cenários	- O utilizador fecha a aplicação a qualquer momento;
Exceção	
--------------	------------------------------------------------------
Pós	- N\A
Condições	
--------------	-------
