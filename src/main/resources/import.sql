INSERT INTO tb_saint_list (name) VALUES ('Holy Man');
INSERT INTO tb_saint_list (name) VALUES ('Holy Women');

INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (1182, 'Fundador de Ordem Religiosa', 'url_sao_francisco.jpg', 'Renunciou à riqueza para viver em pobreza e servir a Deus.', 'Assis, Itália', 'Amante da natureza e dos animais.', 'São Francisco de Assis');
INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (1515, 'Doutora da Igreja', 'url_santa_teresa.jpg', 'Experimentou visões e escreveu obras espirituais profundas.', 'Ávila, Espanha', 'Mística e reformadora da Ordem Carmelita.', 'Santa Teresa de Ávila');
INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (1195, 'Doutor da Igreja', 'url_santo_antonio.jpg', 'Pregador talentoso e padroeiro dos pobres.', 'Lisboa, Portugal', 'Conhecido por encontrar objetos perdidos.', 'Santo Antônio de Pádua');
INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (1381, 'Padroeira das causas impossíveis', 'url_santa_rita.jpg', 'Sofreu muito em sua vida, mas manteve a fé inabalável.', 'Roccaporena, Itália', 'Esposa, mãe e religiosa exemplar.', 'Santa Rita de Cássia');
INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (480, 'Pai do monaquismo ocidental', 'url_sao_bento.jpg', 'Sua regra monástica influenciou a vida religiosa por séculos.', 'Núrsia, Itália', 'Fundador da Ordem dos Beneditinos.', 'São Bento de Núrsia');
INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (1194, 'Fundadora da Ordem das Clarissas', 'url_santa_clara.jpg', 'Dedicou sua vida à oração e ao serviço dos pobres.', 'Assis, Itália', 'Seguidora de São Francisco e defensora da pobreza.', 'Santa Clara de Assis');
INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (-4, 'Primeiro Papa', 'url_sao_pedro.jpg', 'Negou Jesus três vezes, mas se arrependeu e se tornou um líder da Igreja.', 'Betsaida, Israel', 'Pescador e líder dos apóstolos de Jesus.', 'São Pedro Apóstolo');
INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (1412, 'Padroeira da França', 'url_santa_joana.jpg', 'Guiou o exército francês em batalhas contra os ingleses.', 'Domrémy, França', 'Guerreira e líder militar.', 'Santa Joana d''Arc');
INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (-5, 'Apóstolo dos gentios', 'url_sao_paulo.jpg', 'Viajou pelo mundo pregando o Evangelho e escreveu muitas cartas do Novo Testamento.', 'Tarso, Turquia', 'Perseguidor dos cristãos convertido por Jesus.', 'São Paulo Apóstolo');
INSERT INTO tb_saints (saint_year, genre, img_url, long_description, platform, short_description, title) VALUES (-3, 'Discípula de Jesus', 'url_maria_madalena.jpg', 'Foi a primeira pessoa a ver Jesus ressuscitado.', 'Magdala, Israel', 'Testemunha da ressurreição de Jesus.', 'Santa Maria Madalena');

INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (1, 3, 1);
INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (1, 5, 2);
INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (1, 7, 3);
INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (1, 9, 4);

INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (2, 2, 0);
INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (2, 4, 1);
INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (2, 6, 2);
INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (2, 8, 3);
INSERT INTO tb_belonging (list_id, saint_id, position) VALUES (2, 10, 4);