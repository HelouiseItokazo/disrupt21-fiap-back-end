/*
DELETE FROM T_BTTF_PERSONAGEM_EVENTO;

DELETE FROM T_BTTF_PERSONAGEM;

DELETE FROM T_BTTF_ARTISTA;

DELETE FROM T_BTTF_EVENTO;
*/


INSERT INTO T_BTTF_ARTISTA (  
    ID_ARTISTA, 
    NM_ARTISTA, 
    DT_NASCIMENTO
    )
VALUES (
    SQ_BTTF_ARTISTA.nextval, 
    'Michael J. Fox', 
    TO_DATE('09/06/1961','DD/MM/YYYY')
);
    
INSERT INTO T_BTTF_ARTISTA (
    ID_ARTISTA, 
    NM_ARTISTA, 
    DT_NASCIMENTO
    )
VALUES (
    SQ_BTTF_ARTISTA.nextval,
    'Christopher Lloyd', 
    TO_DATE ('22/10/1938', 'DD/MM/YYYY')
);
    
INSERT INTO T_BTTF_ARTISTA (
    ID_ARTISTA, 
    NM_ARTISTA, 
    DT_NASCIMENTO
    )
VALUES (
    SQ_BTTF_ARTISTA.nextval,
    'Lea Thompson', 
    TO_DATE ('31/05/1961','DD/MM/YYYY')
);
    
INSERT INTO T_BTTF_ARTISTA (
    ID_ARTISTA, 
    NM_ARTISTA, 
    DT_NASCIMENTO
    )
VALUES (
    SQ_BTTF_ARTISTA.nextval,
    'Crispin Glover', 
    TO_DATE ('20/04/1964','DD/MM/YYYY')
);

INSERT INTO T_BTTF_ARTISTA (
    ID_ARTISTA, 
    NM_ARTISTA, 
    DT_NASCIMENTO
    )
VALUES (
    SQ_BTTF_ARTISTA.nextval,
    'Thomas F. Wilson', 
    TO_DATE  ('15/04/1959', 'DD/MM/YYYY')
);

COMMIT;

INSERT INTO T_BTTF_PERSONAGEM (
    ID_PERSONAGEM,
    ID_ARTISTA,
    NM_PERSONAGEM,
    DT_NASCIMENTO,
    DS_PERSONAGEM
    )
VALUES (
    SQ_BTTF_PERSONAGEM.nextval,
    1,
    'Marty McFly', 
    TO_DATE('12/06/1968', 'dd/MM/yyyy'), 
    'É um adolescente vivendo com uma família sem vida e sem ambição na cidade de Hill Valley, Califórnia, e que por conta de um acidente envolvendo seu amigo Doc acaba viajando no tempo, onde nessa viajem o jovem tenta concertar o paradoxo temporal envolvendo seus pais.'
);
    
INSERT INTO T_BTTF_PERSONAGEM (
    ID_PERSONAGEM,
    ID_ARTISTA,
    NM_PERSONAGEM,
    DT_NASCIMENTO,
    DS_PERSONAGEM
    )
VALUES (
    SQ_BTTF_PERSONAGEM.nextval,
    2,
    'Dr. Emmett Lathrop "Doc" Brown',
    TO_DATE('1908', 'YYYY'),
    'Doc é um Cientista estudioso apaixonado por tecnologias, invensões e sobre o tempo, Doc com sua mente brilhante inventou uma máquina do tempo improvisada em um DeLorean DMC-12, que ao atingir a velocidade de 140km/h teletransporta quem estiver dentro para o passado ou futuro,  Doc e Marty formam uma dupla que liga passado e futuro em uma aventura maluca.'
);

INSERT INTO T_BTTF_PERSONAGEM (
    ID_PERSONAGEM,
    ID_ARTISTA,
    NM_PERSONAGEM,
    DT_NASCIMENTO,
    DS_PERSONAGEM
    )
VALUES (
    SQ_BTTF_PERSONAGEM.nextval,
    3,
    'Lorraine Baines McFly',
    TO_DATE('1938', 'YYYY'), 
    'Mãe  de Marty, que no passado por  conta de um acidente inusitado envolvendo seu pai e Marty, acaba se apaixonando pelo seu filho sem imaginar o risco que isso poderia ocorrer no futuro, fato esse que causa ainda mais adrenalina a história. '
); 
    
INSERT INTO T_BTTF_PERSONAGEM (
    ID_PERSONAGEM, 
    ID_ARTISTA,
    NM_PERSONAGEM,
    DT_NASCIMENTO,
    DS_PERSONAGEM
    )
VALUES (
    SQ_BTTF_PERSONAGEM.nextval,
    4,
    'George McFly',
    TO_DATE('01/04/1938', 'DD/MM/YYYY'), 
    'Pai de Marty, antigo estudante atrapalhado que sofre constantes intimidações por Biff, e não tem segurança nenhuma, mas que possui um bom coração e gosta muito de Lorraine, com a viagem de Marty e o reecontro inesperado, Marty se encaminha de ajudar seu próprio pai sem que ele saiba ou o reconheça.'
);  
    
INSERT INTO T_BTTF_PERSONAGEM (
    ID_PERSONAGEM,
    ID_ARTISTA,
    NM_PERSONAGEM,
    DT_NASCIMENTO,
    DS_PERSONAGEM
    )
VALUES (
    SQ_BTTF_PERSONAGEM.nextval,
    5,
    'Biff Tannen',
    TO_DATE('27/03/1937', 'DD/MM/YYYY'), 
    'Biff, vizinho de bairro de George e Lorraine, e que odeia ser intimidado ou contrariado, porém ao decorrer da história no passado se encontra com Marty, ao qual os dois entram em uma discussão que pode mudar o rumo do futuro.'
);

COMMIT;

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:01', 'YYYY HH24:MI:SS'),
    'O Doutor engana um grupo de terroristas líbios para conseguir plutônio, que será utilizado como combústivel de sua maior invenção.',
    'Território dos terroristas', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:02', 'YYYY HH24:MI:SS'),
    'Cria um aparato chamado de Capacitor de Fluxo, que exige 1,21 gigawatts providenciados por fissão nuclear, tornando possíveis as viagens no tempo.',
    'Laboratório', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:03', 'YYYY HH24:MI:SS'),
    'Finaliza a invenção de uma máquina do tempo em um DeLorean DCM-12 (carro desportivo) capaz de atingir uma velocidade superior a 140 km/h.',
    'Laboratório', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:04', 'YYYY HH24:MI:SS'),
    'Marty encontra seu amigo, o cientista Dr. Emmett Brown, no Shopping Pinheiros Gêmeos à 1h15min. a pedido do Doutor.',
    'Estacionamento Shopping', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:05', 'YYYY HH24:MI:SS'),
    'Doc apresenta uma invenção a Marty que registra via gravação de vídeo os primeiros experimentos com a DeLorean DCM-12 modificado para tornar-se uma máquina do tempo, durante a madrugada de 26 de outubro de 1985, no Shopping Pinheiros Gêmeos à 1h15min.',
    'Estacionamento Shopping', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:06', 'YYYY HH24:MI:SS'),
    'Realiza o primeiro experimento de viagem no tempo, enviando cachorro dele, um Pastor-catalão chamado Einstein, ao futuro, controlando o DeLorean através de um controle remoto.',
    'Estacionamento Shopping', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:07', 'YYYY HH24:MI:SS'),
    'Doc e Marty são surpreendidos pelo grupo de terroristas líbios, que na tentantiva de vingança e de reaver uma parte do plutônio subtraído por Doc, atiram em Doc com uma metralhadora e perseguem Marty na tentativa de mata-lo.',
    'Estacionamento Shopping', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:09', 'YYYY HH24:MI:SS'),
    'Teve a ideia do capacitor de fluxo, que é um equipamento que tornava possível a viagem no tempo. A ideia veio a ele em uma visão depois de ser nocauteado, após escorregar de seu vaso sanitário enquanto ficava em cima dele para pendurar um relógio.',
    'Casa Doutor', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:10', 'YYYY HH24:MI:SS'),
    'Marty encontra o Doutor Brown de 1955 e convence o incrédulo Emmett de que ele é realmente um viajante do tempo, contando a ele sobre o capacitor de fluxo e pede sua ajuda para voltar a 1985.',
    'Casa Doutor', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:11', 'YYYY HH24:MI:SS'),
    'O Doutor explica que a única fonte de energia capaz de gerar 1,21 Gigawatts é um raio.',
    'Casa Doutor', 
    0
);


INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:12', 'YYYY HH24:MI:SS'),
    'Marty então mostra a ele um panfleto que ele havia recebido no dia anterior na praça do relógio da Torre sobre um raio que havia atingido a Torre do Relógio da cidade, desativando-o desde então no sábado seguinte às 22h04min',
    'Casa Doutor', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:13', 'YYYY HH24:MI:SS'),
    'O Doutor cria um plano para fazer a energia do raio ser direcionada para o Capacitor de Fluxo do DeLorean.',
    'Casa Doutor', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:14', 'YYYY HH24:MI:SS'),
    'Observa uma complicação ao ver a imagem dos irmãos de Marty desaparecendo em uma foto: Marty impediu o encontro de Lorraine e George comprometendo a existência dele e de sua família.',
    'Casa Doutor', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:22', 'YYYY HH24:MI:SS'),
    'Marty chega na cena do antecipado raio na torre do relógio onde o Doutor está fazendo os preparativos finais.',
    'Praça Torre do Relógio', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:23', 'YYYY HH24:MI:SS'),
    'Marty tenta avisar o Doutor sobre o assassinato dele em 1985 com uma carta, porém ele a rasga sem ler, com medo de alterar o futuro.',
    'Praça Torre do Relógio', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:24', 'YYYY HH24:MI:SS'),
    'Um enorme galho de árvore acidentalmente desconecta o arranjo de fios do Doutor para capturar a energia do raio, porém os dois consertam as conexões a tempo de enviar Marty e o DeLorean de volta para 1985.',
    'Praça Torre do Relógio', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:25', 'YYYY HH24:MI:SS'),
    'Marty volta a 1985, 11 minutos antes de sua viagem ao passado, para salvar o Doc, mas vê o Doutor sendo morto de novo.',
    'Estacionamento Shopping', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:26', 'YYYY HH24:MI:SS'),
    'O Doutor revela que ele juntou os pedaços da carta, descobrindo sobre o iminente assassinato. Assim sendo, muniu-se previamente com um colete à prova de balas.',
    'Estacionamento Shopping', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:27', 'YYYY HH24:MI:SS'),
    'O Doutor leva Marty para casa e depois disso viaja para o futuro.',
    'Em frente casa Marty', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:28', 'YYYY HH24:MI:SS'),
    'Decide viajar 30 anos no futuro e descobre fatos supreendentes envolvendo os futuros filhos de Marty McFly.',
    'Em frente casa Marty', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:30', 'YYYY HH24:MI:SS'),
    'Doc retorna para 1985 e decide chamar reforços Marty e Jennifer Parker(namorada de Marty) para iniciar uma nova Aventura.',
    'Em frente casa Marty', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:00', 'YYYY HH24:MI:SS'),
    'Marty McFly é um adolescente vivendo com uma família sem vida e sem ambição na cidade de Hill Valley, Califórnia.',
    'Casa Marty', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:08', 'YYYY HH24:MI:SS'),
    'Marty entra no DeLorean na tentativa de sobreviver ao ataque dos terroristas e acidentalmente na fuga acaba viajando para o passando, retornando para 5 de novembro de 1955.',
    'Estacionamento Shopping', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:09:50', 'YYYY HH24:MI:SS'),
    'Marty é transportado para o Rancho Dois Pinheiros, um rancho de dois pinheiros em que no futuro se tornará o Shopping Pinheiros Gêmeos, comandado pelo velho fazendeiro Peabody.',
    'Rancho Dois Pinheiros', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:09:51', 'YYYY HH24:MI:SS'),
    'Sem plutônio, o carro eventualmente se desliga sozinho e Marty agora encontra-se preso em 1955.',
    'Rua em frente a Lyon Estates', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:09:52', 'YYYY HH24:MI:SS'),
    'Marty acidentalmente encontra seu pai, George, como um adolescente que é intimidado por Biff, durante a exploração na cidade de Hill Valley daquela década.',
    'Lou"s Café', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:09:53', 'YYYY HH24:MI:SS'),
    'Marty vê George espiando Lorraine trocar de roupa em cima de uma árvore.',
    'Rua em frente a Casa de Lorraine', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:09:54', 'YYYY HH24:MI:SS'),
    'Quando George está prestes a ser atropelado pelo carro do pai de Lorraine, Marty o empurra salvando-o e recebendo o impacto em seu lugar. E, Lorraine se apaixona por Marty.',
    'Rua em frente a Casa de Lorraine', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:15', 'YYYY HH24:MI:SS'),
    'Marty tenta consertar o paradoxo temporal e salvar seu futuro com seus pais, porém ele só consegue que o interesse de Lorraine por ele vá gradativamente aumentando.',
    'Lou"s Café / Colégio / Casa Doutor Doc / Hill Valley', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:16', 'YYYY HH24:MI:SS'),
    'Marty faz a fuga por um skate enquanto é perseguido por Biff e seus comparsas em um Ford Super Deluxe 1946 que acaba por bater em um caminhão de esterco.',
    'Hill Valley', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:17', 'YYYY HH24:MI:SS'),
    'Marty planeja fazer George "resgatar" Lorraine dos avanços sexuais encenados por ele na noite do baile "Encantamento do Fundo-do-Mar".',
    'Estacionamento Colégio', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:18', 'YYYY HH24:MI:SS'),
    'Biff surge embriagado inesperadamente, tirando Marty do carro e abusando de Lorraine.',
    'Estacionamento Colégio', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:19', 'YYYY HH24:MI:SS'),
    'George aparece para Lorraine como planejado por Marty, porém acaba encontrando Biff.',
    'Estacionamento Colégio', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:20', 'YYYY HH24:MI:SS'),
    'Apesar das ameaças de Biff, George abandona sua costumeira submissão e o enfrenta pela primeira vez, lhe dando um forte soco no rosto, deixando-o inconsciente. E Lorrayne fica admirada. Marty assiste a cena de longe.',
    'Estacionamento Colégio', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1955 00:10:21', 'YYYY hh24:mi:ss'),
    'Lorraine e George vão para o baile onde eles se beijam pela primeira vez, enquanto Marty atua como músico no baile dando um show e assegura a sua existência de seus irmãos.',
    'Colégio', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:10:29', 'YYYY HH24:MI:SS'),
    'Marty acorda na manhã seguinte e descobre que sua família melhorou significativamente. Lorraine é magra e jovial, e um autoconfiante George é um autor de ficção científica de sucesso. Mais notavelmente, George e Lorraine tem uma relação íntima que eles nunca tiveram.',
    'Casa Marty', 
    0
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:08:00', 'YYYY HH24:MI:SS'),
    'George McFly (pai de Marty) é constantemente intimidado por seu supervisor de trabalho, Biff Tannen, e Lorraine Baines McFly (mãe de Marty), está acima do peso e tem um problema com bebida.',
    'Casa Marty', 
    1
);

INSERT INTO T_BTTF_EVENTO (
    ID_EVENTO,
    DT_EVENTO,
    DS_EVENTO,
    DS_LOCAL_EVENTO,
    FL_VIAGEM_TEMPO
    )
VALUES (
    SQ_BTTF_EVENTO.NEXTVAL,
    TO_DATE('1985 00:12:00', 'YYYY HH24:MI:SS'),
    'Biff se tornou dono de uma oficina, além de agora ser submisso a George.',
    'Quintal Casa Marty', 
    0
);

COMMIT;

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             1, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             2, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             3, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             4, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             5, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             6, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             7, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             8, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             9, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             10, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             11, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             12, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             13, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             14, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             15, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             16, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             17, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             18, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             19, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             20, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             21, 
             2 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             22, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             4, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             5, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             7, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             23, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             24, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             25, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             26, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             27, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             28, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             9, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             10, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             11, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             12, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             13, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             29, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             30, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             31, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             32, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             33, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             34, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             35, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             14, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             15, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             16, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             17, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             18, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             19, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             36, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             21, 
             1 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             37, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             27, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             28, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             29, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             31, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             32, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             33, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             34, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             35, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             36, 
             3 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             37, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             26, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             27, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             28, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             29, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             31, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             33, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             34, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             35, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             36, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             38, 
             4 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             37, 
             5 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             26, 
             5 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             30, 
             5 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             32, 
             5 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             33, 
             5 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             34, 
             5 ); 

INSERT INTO T_BTTF_PERSONAGEM_EVENTO 
            (ID_PERSONAGEM_EVENTO, 
             ID_EVENTO, 
             ID_PERSONAGEM) 
VALUES      ( SQ_BTTF_PERSONAGEM_EVENTO.NEXTVAL, 
             38, 
             5 ); 

COMMIT;

