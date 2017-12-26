create database db_library
use db_library
--CARD     借书卡。   CNO 卡号，NAME  姓名，CLASS 班级
create table tb_CARD(
CNO nvarchar(32) primary key,
NAME nvarchar(16) not null,
CLASS nvarchar(16)
)
--BOOKS    图书。     BNO 书号，BNAME 书名,AUTHOR 作者，PRICE 单价，QUANTITY 库存册数 
create table tb_BOOKS(
BNO nvarchar(32) primary key,
BNAME nvarchar(16) not null,
AUTHOR nvarchar(16) not null,
PRICE decimal(8,4),
QUANTITY int
)
--BORROW   借书记录。 CNO 借书卡号，BNO 书号，RDATE 还书日期
create table tb_BORROW(
id int identity(1,1)primary key,
CNO nvarchar(32),
BNO nvarchar(32),
foreign key(CNO) references tb_CARD,
foreign key(BNO) references tb_BOOKS,
RDATE date
)
---插入借书卡信息
insert into tb_CARD(CNO,NAME,CLASS)
values ('001','jackie','01'),
('002','tom','02'),
('003','Jerry','01'),
('004','mary','03'),
('005','Lucy','03'),
('006','Lily','02'),
('007','Jane','02')
SELECT * from tb_CARD
--插入图书信息
insert into tb_BOOKS(BNO,BNAME,AUTHOR,PRICE,QUANTITY)
VALUES('00001','水浒','施耐庵',45.56,6),
('00002','万历十五年','黄仁宇',37.56,12),
('00003','大明王朝1566','刘和平',25.56,67),
('00004','世间的盐','风行水上',24.56,61),
('00005','汪曾祺小说集','汪曾祺',45.56,65),
('00006','组合数学','华罗庚',52.22,75),
('00007','计算方法','谭浩强',20.78,69),
('00008','网络的奥秘','JackieYan',45.78,89),
('00009','月亮与六便士','毛姆',35.78,29),
('00010','计算方法习题集','谭浩强',20.78,69)
SELECT * FROM tb_BOOKS

--插入借阅信息
insert into tb_BORROW(CNO,BNO,RDATE)
values('002','00009','2017-8-5'),
('007','00010','2017-10-5'),
('001','00001','2017-3-5'),
('001','00002','2017-3-5'),
('001','00003','2017-3-5'),
('001','00004','2017-3-5'),
('002','00004','2017-3-5'),
('003','00003','2017-3-5'),
('007','00005','2016-3-5'),
('005','00001','2017-3-5'),
('001','00007','2017-3-5'),
('003','00006','2017-3-5'),
('003','00007','2017-3-5')
select * from tb_BORROW
--1. 写出建立BORROW表的SQL语句，
--要求定义主码完整性约束和引用完整性约束
--2. 找出借书超过4本的读者,输出借书卡号及所借图书册数
select BOR.CNO as 借书卡号,count(CNO) as 数量
from tb_BORROW BOR
group by CNO
having count(CNO)>4
--3. 查询借阅了"水浒"一书的读者，输出姓名及班级

--一
SELECT CA.NAME as 姓名,CA.CLASS as 班级  
from tb_CARD CA,tb_BOOKS BO,tb_BORROW BOR
where BO.BNAME='水浒'
AND BO.BNO = BOR.BNO
AND BOR.CNO = CA.CNO

--二
select CA.NAME as 姓名,CA.CLASS as 班级
from tb_CARD CA where CA.CNO IN(
SELECT BOR.CNO from tb_BORROW BOR 
WHERE  BOR.BNO=(select BO.BNO from tb_BOOKS BO 
where BO.BNAME='水浒')  
)

--4. 查询过期未还图书，输出借阅者（卡号）、书号及还书日期
select BOR.CNO as 卡号,BOR.BNO as 书号,BOR.RDATE 还书日期 
from tb_BORROW BOR
where BOR.RDATE<GETDATE()

--5. 查询书名包括"网络"关键词的图书，输出书号、书名、作者
select BO.BNO as 书号,BO.BNAME as 书名,BO.AUTHOR as 作者  
from tb_BOOKS BO where BO.BNAME LIKE '%网络%'
 
--6. 查询现有图书中价格最高的图书，输出书名及作者
select BO.BNAME as 书名,BO.AUTHOR as 作者,BO.PRICE as 价格
from tb_BOOKS BO 
where BO.PRICE=(SELECT MAX(PRICE) from tb_BOOKS )

--7. 查询当前借了"计算方法"但没有借"计算方法习题集"的读者，
--输出其借书卡号，并按卡号降序排序输出
select BOR.CNO as 卡号 from tb_BOOKS BO,tb_BORROW BOR
WHERE  BO.BNAME='计算方法'
AND BO.BNO=BOR.BNO 
AND NOT EXISTS(
SELECT BBOR.CNO from tb_BOOKS BBO,tb_BORROW BBOR
WHERE  BBO.BNAME='计算方法习题集'
AND BBO.BNO=BBOR.BNO 
AND BBOR.CNO=BOR.CNO )
ORDER BY  CNO desc
--8. 将"01"班同学所借图书的还期都延长一周
update BOR set BOR.RDATE=DATEADD(DAY,7,BOR.RDATE)
from  tb_CARD CA, tb_BORROW BOR
where CA.CLASS='01'
AND CA.CNO=BOR.CNO
--9． 从BOOKS表中删除当前无人借阅的图书记录。
DELETE FROM tb_BOOKS 
WHERE tb_BOOKS.BNO  NOT IN(
SELECT BOR.BNO FROM tb_BORROW BOR,tb_BOOKS BO
WHERE BOR.BNO= BO.BNO)
--10.查询当前同时借有"计算方法"和"组合数学"两本书的读者，
--输出其借书卡号，并按卡号升序排序输出
select BOR.CNO as 卡号 from tb_BOOKS BO,tb_BORROW BOR
WHERE  BO.BNAME='计算方法'
AND BO.BNO=BOR.BNO 
AND  EXISTS(
SELECT BBOR.CNO from tb_BOOKS BBO,tb_BORROW BBOR
WHERE  BBO.BNAME='组合数学'
AND BBO.BNO=BBOR.BNO 
AND BBOR.CNO=BOR.CNO )
ORDER BY  CNO ASC

