-- furniture chair
insert into furniture values(1001,'����A', 89900, '40*60*90', 'red',1);
insert into furniture values(1002,'����B', 39800, '40*60*90', 'blue',2);
insert into furniture values(1003,'����C', 54900, '40*60*90', 'violet',3);
-- furniture desk
insert into furniture values(1011,'å��A', 119000, '80*60*90', 'purple',1);
insert into furniture values(1012,'å��B', 126000, '80*60*90', 'blue',2);
insert into furniture values(1013,'å��C', 99900, '80*60*90', 'brown',3);
--furniture wardrobe
insert into furniture values(1021,'����A', 289000, '240*120*220', 'green',1);
insert into furniture values(1022,'����B', 259000, '300*130*220', 'brown',2);
insert into furniture values(1023,'����C', 198000, '240*100*210', 'light brown',3);
--furniture bed
insert into furniture values(1031,'ħ��A', 325000, '230*220*70', 'purple',1);
insert into furniture values(1032,'ħ��B', 298000, '240*200*70', 'blue',2);
insert into furniture values(1033,'ħ��C', 199000, '220*120*60', 'red',3);

-- electronics refrigerator
insert into electronics values(2001, '�����', 339000, '50*45*45', 'white', 1);
insert into electronics values(2002, '�����', 109000, '100*40*60',  'black', 2);
insert into electronics values(2003, '�����', 159000,  '80*95*95', 'red', 3);

-- electronics vaccum
insert into electronics values(2011,'û�ұ�', 99000, '23*4*97', 'white', 1);
insert into electronics values(2012, 'û�ұ�', 84900, '43*8*91', 'black', 2);
insert into electronics values(2013, 'û�ұ�', 37000,'22*5*107', 'pink', 3);

-- electronics tv
insert into electronics values(2021, 'TV', 259000, '97*61*17', 'black', 1);
insert into electronics values(2022, 'TV', 129000, '90*81*10', 'black', 2);
insert into electronics values(2023, 'TV', 200000, '100*59*19', 'black', 3);

-- electronics computer
insert into electronics values(2031, '��ǻ��', 369000, '77*68*19', 'black', 1);
insert into electronics values(2032, '��ǻ��', 253000, '100*65*13', 'black', 2);
insert into electronics values(2033, '��ǻ��', 175000, '97*90*30', 'black', 3);

--seasonality ������
insert into seasonality values(3001, '������', 100000, '30*60*15', 'white', 1);
insert into seasonality values(3002, '������A', 100500, '40*60*20', 'red', 2);
insert into seasonality values(3003, '������B', 100200, '45*60*25', 'dark', 3);

--seasonality ��ǳ��
insert into seasonality values(3011, '��ǳ��', 100000, '30*60*10', 'white', 1);
insert into seasonality values(3012, '��ǳ��A', 100000, '40*60*15', 'dark', 2);
insert into seasonality values(3013, '��ǳ��B', 100000, '40*50*10', 'blue', 3);

--seasonality ��������
insert into seasonality values(3021, '��������', 50500, '40*40*3', 'blue',   1);
insert into seasonality values(3022, '��������A', 50100, '50*50*3', 'ocean', 2);
insert into seasonality values(3023, '��������B', 50400, '60*60*3', 'green', 3);

--seasonality ����
insert into seasonality values(3031, '����', 20000, '8*10*5*', 'red', 1);
insert into seasonality values(3032, '����A', 23000, '7*6*6', 'purple', 2);
insert into seasonality values(3033, '����B', 33500, '8*10*6', 'blue', 3);

--decoration ����
insert into seasonality values(4001, '����', 100000, '30*60*15', 'white', 1);
insert into seasonality values(4002, '����A', 100500, '40*60*20', 'red', 2);
insert into seasonality values(4003, '����B', 100200, '45*60*25', 'dark grey', 3);


--decoration ī��
insert into decoration values(4011, 'ī��', 100000, '30*60*15', 'white', 1);
insert into decoration values(4012, 'ī��A', 300000, '40*60*20', 'red', 2);
insert into decoration values(4013, 'ī��B', 1000000, '45*60*25', 'dark red', 3);


--decoration Ŀư
insert into decoration values(4021, 'Ŀư', 100300, '30*60*15', 'white', 1);
insert into decoration values(4022, 'ĿưA', 100500, '40*60*20', 'red', 2);
insert into decoration values(4023, 'ĿưB', 100200, '45*60*25', 'dark blue', 3);


--decoration ���
insert into decoration values(4031, '���', 80000, '30*60*15', 'white', 1);
insert into decoration values(4032, '���A', 40000, '40*70*20', 'red', 2);
insert into decoration values(4033, '���B', 70000, '45*45*25', 'dark', 3);

commit;
