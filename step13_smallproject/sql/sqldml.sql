-- furniture chair
insert into furniture values(1001,'의자A', 89900, '40*60*90', 'red',1);
insert into furniture values(1002,'의자B', 39800, '40*60*90', 'blue',2);
insert into furniture values(1003,'의자C', 54900, '40*60*90', 'violet',3);
-- furniture desk
insert into furniture values(1011,'책상A', 119000, '80*60*90', 'purple',1);
insert into furniture values(1012,'책상B', 126000, '80*60*90', 'blue',2);
insert into furniture values(1013,'책상C', 99900, '80*60*90', 'brown',3);
--furniture wardrobe
insert into furniture values(1021,'옷장A', 289000, '240*120*220', 'green',1);
insert into furniture values(1022,'옷장B', 259000, '300*130*220', 'brown',2);
insert into furniture values(1023,'옷장C', 198000, '240*100*210', 'light brown',3);
--furniture bed
insert into furniture values(1031,'침대A', 325000, '230*220*70', 'purple',1);
insert into furniture values(1032,'침대B', 298000, '240*200*70', 'blue',2);
insert into furniture values(1033,'침대C', 199000, '220*120*60', 'red',3);

-- electronics refrigerator
insert into electronics values(2001, '냉장고', 339000, '50*45*45', 'white', 1);
insert into electronics values(2002, '냉장고', 109000, '100*40*60',  'black', 2);
insert into electronics values(2003, '냉장고', 159000,  '80*95*95', 'red', 3);

-- electronics vaccum
insert into electronics values(2011,'청소기', 99000, '23*4*97', 'white', 1);
insert into electronics values(2012, '청소기', 84900, '43*8*91', 'black', 2);
insert into electronics values(2013, '청소기', 37000,'22*5*107', 'pink', 3);

-- electronics tv
insert into electronics values(2021, 'TV', 259000, '97*61*17', 'black', 1);
insert into electronics values(2022, 'TV', 129000, '90*81*10', 'black', 2);
insert into electronics values(2023, 'TV', 200000, '100*59*19', 'black', 3);

-- electronics computer
insert into electronics values(2031, '컴퓨터', 369000, '77*68*19', 'black', 1);
insert into electronics values(2032, '컴퓨터', 253000, '100*65*13', 'black', 2);
insert into electronics values(2033, '컴퓨터', 175000, '97*90*30', 'black', 3);

--seasonality 에어컨
insert into seasonality values(3001, '에어컨', 100000, '30*60*15', 'white', 1);
insert into seasonality values(3002, '에어컨A', 100500, '40*60*20', 'red', 2);
insert into seasonality values(3003, '에어컨B', 100200, '45*60*25', 'dark', 3);

--seasonality 선풍기
insert into seasonality values(3011, '선풍기', 100000, '30*60*10', 'white', 1);
insert into seasonality values(3012, '선풍기A', 100000, '40*60*15', 'dark', 2);
insert into seasonality values(3013, '선풍기B', 100000, '40*50*10', 'blue', 3);

--seasonality 전기장판
insert into seasonality values(3021, '전기장판', 50500, '40*40*3', 'blue',   1);
insert into seasonality values(3022, '전기장판A', 50100, '50*50*3', 'ocean', 2);
insert into seasonality values(3023, '전기장판B', 50400, '60*60*3', 'green', 3);

--seasonality 난로
insert into seasonality values(3031, '난로', 20000, '8*10*5*', 'red', 1);
insert into seasonality values(3032, '난로A', 23000, '7*6*6', 'purple', 2);
insert into seasonality values(3033, '난로B', 33500, '8*10*6', 'blue', 3);

--decoration 조명
insert into seasonality values(4001, '조명', 100000, '30*60*15', 'white', 1);
insert into seasonality values(4002, '조명A', 100500, '40*60*20', 'red', 2);
insert into seasonality values(4003, '조명B', 100200, '45*60*25', 'dark grey', 3);


--decoration 카펫
insert into decoration values(4011, '카펫', 100000, '30*60*15', 'white', 1);
insert into decoration values(4012, '카펫A', 300000, '40*60*20', 'red', 2);
insert into decoration values(4013, '카펫B', 1000000, '45*60*25', 'dark red', 3);


--decoration 커튼
insert into decoration values(4021, '커튼', 100300, '30*60*15', 'white', 1);
insert into decoration values(4022, '커튼A', 100500, '40*60*20', 'red', 2);
insert into decoration values(4023, '커튼B', 100200, '45*60*25', 'dark blue', 3);


--decoration 쿠션
insert into decoration values(4031, '쿠션', 80000, '30*60*15', 'white', 1);
insert into decoration values(4032, '쿠션A', 40000, '40*70*20', 'red', 2);
insert into decoration values(4033, '쿠션B', 70000, '45*45*25', 'dark', 3);

commit;
