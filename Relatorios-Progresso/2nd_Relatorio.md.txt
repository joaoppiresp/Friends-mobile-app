![Logo Universidade](https://www.ibermagem.pt/images/eventoPhase/thumbnail_iade.jpg)

# Friend's

<p style="text-align: center;">Projeto realizado por João Miguel Pires, nº20200459 e Hélio Divaldo, nº20190928</p>

<p style="text-align: center;">IADE, Faculdade de Design, Tecnologia e Comunicação</p>

<p style="text-align: center;">Realizado no âmbito das unidades curriculares de Matemática Discreta (Rodolfo Bendoyro), Base de Dados (Miguel Boavida), Competências Comunicacionais (Alexandra Santos), Programação Orientada a Objetos (Miguel Bugalho), 
Progamação de Dispositivos Móveis (João Dias) e Projeto de Desenvolvimento Móvel (Pedro Rosa).</p>


# Relatório de Progresso

No âmbito do projeto de desenvolvimento mobile e tendo em conta os recentes desenvolvimentos na vida noturna em Lisboa, como desacatos e mudanças recorrêntes nas 
medidas de segurança impostas, propomo-nos a criar uma app que facilite aos jovens manterem-se a par de tudo á sua volta quando se aventuram pela noite.
Friend’s surgiu com a missão de auxilar os jovens quando quiserem ir para alguma zona noturna de lisboa dando acesso a dados como:

-	Mapa interativo (visualização da densidade de utilizadores numa determinada área) ;
-	Search Friends ( localizar e mandar notificações a amigos);
-	Search Bars (Pesquisa por bares e informações);
-	Informações partilhadas pelos utilizadores sobre determinadas zonas que serão verificadas pelos votos up/down;

### Ferramentas e aplicações semelhantes

Algumas das aplicações atualmente existentes no mercado, com semelhanças á nossa são:

1. **Foursquare** - é uma rede geossocial e de microblogging que permite ao utilizador indicar onde se encontra, e procurar por contatos seus que estejam próximo desse local,
os mapas utilizados pelo Foursquare são provenientes do OpenStreetMap.
<br/><br/>
Link: 
        https://pt.wikipedia.org/wiki/Foursquare
        https://www.zomato.com/pt/grande-lisboa

Foursquare é uma app similar ao nosso projecto por fornecer aos utilizadores a possibilidade de pesquisar por amigos num mapa, como a nossa funcionalidade “ Map Acess”.

2. **Zomato** - Serviço de procura por estabelecimentos de restauração, bares, cafés e restaurantes, classificados com base em reviews de utilizadores e outros aspetos. 
<br/><br/>
Link:
        https://pt.wikipedia.org/wiki/Zomato
        https://www.zomato.com/pt/grande-lisboa

O zomato assemelha-se ao nosso projeto no aspeto de procura por estabelecimentos e informações sobre os mesmos.
        
3. **Wikinight** - A Wikinight é uma plataforma de vida nocturna que reúne de forma gratuita informação sobre eventos, discotecas, 
bares e artigos com novidades e sugestões. A aplicação também permite realizar todos os pagamentos necessários ao longo do processo de forma virtual, 
desde a pré-reserva ao pagamento de consumos através de MB Way ou Multibanco.
<br/><br/>
Link :
        https://wikinight.eu/pt
        https://www.noticiasdecoimbra.pt/wikinight-ajuda-os-portugueses-a-regressar-a-vida-noturna/

A Wikinight é, dentro de todas, a app mais semelhante ao nosso projeto, incluindo várias das nossas funções mas também um aspeto comercial, como promoções, 
        pagamentos e reservas em bares, discotecas e eventos sociais.

A Friend's distinguiria-se desta última por apresentar ao utilizador a quantidade de outros utilizadores a frequentar cada área noturna, facilitando-lhe assim a escolha do melhor sitio onde ir.

### Enquadramento e objetivo

A app tem como público-alvo jovens na faixa etária dos 18 anos, que tenham uma vida social ativa e gostem de frequentar as zonas, bares e clubes mais populares. Também será uma ajuda para os jovens mais tímidos que procuram novas amizades e desejam melhorar as suas interações sociais.

Friend’s seria uma aplicação diferenciada por ter como foco a preocupação com a quantidade de pessoas presentes nas zonas noturnas de Lisboa. Possibilitaria aos utilizadores escolher segundo as suas preferências zonas mais movimentadas ou mais tranquilas.  

### Palavras-Chave

    - Mobile

    - Amigo 

    - Procurar 

    - Bares 

    - Mood

    - Vida Noturna 

    - Social

### Tipos de utilizadores e funcionalidades

1. **Registered User**

    - Registo de amigos e todas as funcionalidades que estes trazem (i.e., Localização dos amigos, 'instant ping'[^1], etc);
    - Pesquisa por estabelecimentos e acesso ás suas informações;
    - Registo de gostos, isto é, informações gerais sobre o utilizador (estas informações serão utilizadas para 'match-making';
    - 'Matching' com outros utilizadores na mesma zona com gostos iguais;
    
2. **Anonymous User**

    - Acesso ao mapa interativo;
    - Pesquisa por estabelecimentos e acesso ás suas informações;
    

[^1]: 'instant ping', isto é, a possibilidade de enviar uma notificação a um utilizador 'amigo' com uma mensagem automática (i.e., "Estou a caminho!", "Liga-me por favor", etc);

### Dados & Permissões 
    - Localização do utilizador
    
    - Conta e-mail
    
    - Lista de amigos
    
    - Gostos (registados pelo utilizador)
    
    - 'ID' do utilizador

### Descrição de Casos de Utilização

#### Use Case 1 - Map Access 
----------------------------------------------

Descrição   | Use Case destinado à apresentação do movimento de pessoas nas ‘zonas noturnas’ em Lisboa num mapa interativo para 'Non-Anonymous Users); |
-------------|--------------------------------------------------------------------
Pre-Condições | 1. O utilizador está registado na aplicação;<br/><br/>2. O utilizador tem acesso á internet (wifi ou dados móveis);| 
Cenário Princ.| 1. O utilizador abre a aplicação;<br/><br/>  1.1. O utilizador introduz as suas credênciais;<br/><br/>  1.4. O utilizador é direcionado para a interface principal da aplicação (main);<br/><br/>  2.O utilizador clica no mapa interativo;<br/><br/>  3.O utilizador observa no mapa a densidade de pessoas na zona que pretender (Lisboa);<br/><br/>  4. O utilizador clica nas opções;<br/><br/>    4.1. O menu das opções é apresentado e o utilizador faz a sua seleção;<br/><br/>      4.1.1. Use Case | 
Cenário Alternativo| 1.2. As credênciais do utilizador não se encontram registadas no sitema;<br/><br/>  A) Use Case<br/><br/>1.3. O utilizador introduz uma password incorreta;<br/><br/>  B) Use Case<br/><br/>2.2. O mapa interativo não abre;<br/><br/>  C)<br/><br/>3.1. O utilizador fecha o mapa e regressa á interfáce principal (main);|
Pós Condições|  - O utilizador regressa á interface principal (main);|
Cenários Exceção|  - O utilizador fecha a aplicação a qualquer momento;|
Pós Condições|  - N\A|


#### Use Case 1.1 - Map Access 
---------------------------------------------

Descrição| Use Case destinado à apresentação do movimento de pessoas nas ‘zonas noturnas’ em Lisboa num mapa interativo para 'Anonymous Users);|
--------------|-------------------------------------------------------------------
Pré-Condições | 1. O utilizador  não está registado na aplicação;<br/><br/>2. O utilizador tem acesso á internet (wifi ou dados móveis);| 
Cenário Princ.| 1. O utilizador abre a aplicação<br/><br/>  1.1. O utilizador é direcionado para a interface principal da aplicação (main);<br/><br/>2.   O utilizador clica no mapa interativo;<br/><br/>3.   O utilizador observa no mapa a densidade de pessoas na zona que pretender (Lisboa);<br/><br/>4. O utilizador clica nas opções;<br/><br/>  4.1. O menu das opções é apresentado e o utilizador faz a sua seleção;<br/><br/>  4.1.1. Use Case x |              
Cenário Alternativo| 2.1. O mapa interativo não abre;<br/><br/>  C)<br/><br/>3.1. O utilizador fecha o mapa e regressa á interfáce principal (main);|
Pós Condições|  - O utilizador regressa á interface principal (main);|
Cenários Exceção|  - O utilizador fecha a aplicação a qualquer momento;|
Pós Condições |  - N\A|


#### Use Case 2 - Add Friend 
-----------------------------------------------------

Descrição| Use Case destinado á adição de 'amigos' do utilizador;|
--------------|-------------------------------------------------------
Pré-Condições | 1. O utilizador está registado na aplicação;<br/><br/>2. O utilizador tem acesso á internet (wifi ou dados móveis);<br/><br/>  3. O utilizador possui o "ID" do perfil do utilizador amigo;|          
Cenário Princ.| 1. O utilizador abre a aplicação;<br/><br/>  1.1. O utilizador é direcionado para a interface principal da aplicação (main);<br/><br/>2.  O utilizador clica na tab 'Friends';<br/><br/>  2.1. O utilizador é redirecionado para a interface dos amigos (friends);<br/><br/>3. O utilizador clica no '+', para adicionar um novo amigo e insere o 'ID' do utilizador que pertender adicionar á lista de amigos;<br/><br/>  3.3. O amigo é adicionado com sucesso;<br/><br/>3.4. O utilizador regressa à interface principal;|        
Cenário Alternativo|2.2. O utilizador clica num amigo já existente;<br/><br/>  A) Use Case x <br/><br/>3.1. O utilizador 'amigo' recebe uma notificação de 'friend request' e não a aceita;<br/><br/>  B) O utilizador que fez o 'friend request' recebe uma notificação com a messagem "Amigo não adicionado";<br/><br/>  B.1) O utilizador tenta novamente;<br/><br/>3.2. O utilizador insere um 'ID' errado ou inexistente;<br/><br/>  B.1) O utilizador tenta novamente;<br/><br/>3.4. É executado o Use Case 3 (Friend Functions);| 
Pós Condições|  - O utilizador regressa á interface principal (main);|
Cenários Exceção|  - O utilizador fecha a aplicação a qualquer momento;|  
Pós Condições|  - N\A|

      
#### Use Case 3 - Friend functions
-----------------------------------------------------

Descrição| Use Case destinado á utilização das funções disponiveis na 'Friend List'|
--------------|-------------------------------------------------------
Pré-Condições| 1. O utilizador está registado na aplicação;<br/><br/>2. O utilizador tem acesso á internet (wifi ou dados móveis);<br/><br/>3. O utilizador tem amigos na lista de amigos;|            
Cenário Princ.| 1. O utilizador abre a aplicação;<br/><br/>  1.1. O utilizador é direcionado para a interface principal da aplicação (main);<br/><br/>2.  O utilizador clica na tab 'Friends';<br/><br/>  2.1. O utilizador é redirecionado para a interface dos amigos (friends);<br/><br/>3. O utilizador clica no '+', para adicionar um novo amigo e insere o 'ID' do utilizador que pertender adicionar á lista de amigos;<br/><br/>  3.3. O amigo é adicionado com sucesso e as novas funções ficam disponivéis;|         
Cenário Alternativo|2.2. O utilizador clica num amigo já existente;<br/><br/>  A) Use Case x<br/><br/>3.1. O utilizador 'amigo' recebe uma notificação de 'friend request' e não a aceita;<br/><br/>  B) O utilizador que fez o 'friend request' recebe uma notificação com a menssagem "Amigo não adicionado";<br/><br/>  B.1) O utilizador tenta novamente;<br/><br/>3.2. O utilizador insere um 'ID' errado ou inexistente;<br/><br/>  B.1) O utilizador tenta novamente;|
Pós Condições|  - O utilizador regressa á interface principal (main);|
Cenários Exceção|  - O utilizador fecha a aplicação a qualquer momento;|
Pós Condições|  - N\A|


#### Use Case 4 - Search 
------------------------------------

Descrição| Use Case destinado á procura por estabelecimentos pelo utilizador;|
--------------|-------------------------------------------------------------------
Pré-Condições | 1. O utilizador está registado na aplicação;<br/><br/>2. O utilizador tem acesso á internet (wifi ou dados móveis);<br/><br/>3. O utilizador sabe o nome do estabelecimento que procura ou, alternativamente, a sua localização relativa;|
Cenário Princ.| 1. O utilizador abre a aplicação;<br/><br/>  1.1. O utilizador é direcionado para a interface principal da aplicação (main);<br/><br/>2.   O utilizador clica no mapa interativo;<br/><br/>  2.1. O utilizador seleciona a 'search bar' e insere o nome do estabelecimento que procura;<br/><br/>2.3. O utilizador sabe a localização relativa do estabelecimento e procura manualmente no mapa;<br/><br/>3. O utilizador clica no icon do estabelecimento;<br/><br/>3.1. O utilizador é redirecionado para a interface de dados dos estabelecimentos e visualiza a informação disponível;|                 
Cenário Alternativo|2.2. O utilizador insere um nome errado ou não registado na aplicação;<br/><br/>  A) É mostrada uma mensagem de erro;<br/><br/>  A.1) O utilizador tenta procurar novamente;<br/><br/>3.1. Ainda não existem informações disponiveis para o estabelecimento procurado pelo utilizador;<br/><br/>  B) É retornada uma mensagem de erro ao utilizador (i.e., 'Info não disponivel');|
Pós Condições|  - O utilizador regressa á interface do mapa interativo (map);<br/><br/>   - O utilizador regressa á interface principal (main);|
Cenários Exceção|  - O utilizador fecha a aplicação a qualquer momento;|
Pós Condições|  - N\A|
