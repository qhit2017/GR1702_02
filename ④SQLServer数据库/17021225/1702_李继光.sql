CREATE database db_library

--CARD     借书卡。   CNO 卡号，NAME  姓名，CLASS 班级
CREATE table tb_card(
cno nvarchar(32) primary key,
name nvarchar(16) not null ,
class nvarchar(16))
--BOOKS    图书。     BNO 书号，BNAME 书名,AUTHOR 作者，PRICE 单价，QUANTITY 库存册数 
CREATE table tb_books(
bno nvarchar(16) primary key,
bname nvarchar(32) not null,
author nvarchar(16),
price decimal(8,4),
quantity smallint)
--BORROW   借书记录。 CNO 借书卡号，BNO 书号，RDATE 还书日期
CREATE table tb_borrow(
id int identity(1,1) primary key,
cno nvarchar(32),
bno nvarchar(16),
foreign key(cno) references tb_card(cno),
foreign key(bno) references tb_books(bno),
rdate datetime
)

INSERT INTO tb_card (cno, name ,class) VALUES 
('001','jackie','01'),
('002','tom','02'),
('003','Jerry','01'),
('004','mary','03'),
('005','Lucy','03'),
('006','Lily','02'),
('007','Jane','02')
INSERT into tb_books (bno,bname ,author,price,quantity )VALUES 
('00001','水浒','施耐庵',45.56,6),
('00002','万历十五年','黄仁宇',37.56,12),
('00003','大明王朝1566','刘和平',25.56,67),
('00004','世间的盐','风行水上',24.56,61),
('00005','汪曾祺小说集','汪曾祺',45.56,65),
('00006','组合数学','华罗庚',52.22,75),
('00007','计算方法','谭浩强',20.78,69),
('00008','网络的奥秘','JackieYan',45.78,89),
('00009','月亮与六便士','毛姆',35.78,29),
('00010','计算方法习题集','谭浩强',20.78,69)
INSERT into tb_borrow(cno,bno,rdate)values
('002','00009','2017-8-5'),
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
--1. 写出建立BORROW表的SQL语句，要求定义主码完整性约束和引用完整性约束

--2. 找出借书超过5本的读者,输出借书卡号及所借图书册数
SELECT  bor.cno as 卡号,count(cno) as 数量 from tb_borrow bor GROUP by cno HAVING COUNT(cno)>4 
--3. 查询借阅了"水浒"一书的读者，输出姓名及班级
--连接查询
SELECT tb_card.name ,tb_card.class from tb_card ,tb_borrow ,tb_books 
where tb_books.bname ='水浒'
AND tb_card.cno=tb_borrow.cno
AND tb_books.bno = tb_borrow.bno 
--子查询
SELECT tb_card.name,tb_card.class from tb_card where tb_card.cno IN (
	select tb_borrow.cno from tb_borrow where tb_borrow.bno=(
		select tb_books.bno from tb_books where bname ='水浒'))
--EXISTS连接
SELECT * FROM tb_card where EXISTS (
	select tb_borrow.cno from tb_borrow ,tb_books 
	where tb_books.bname = '水浒'
	and tb_books.bno = tb_borrow.bno
	and tb_card.cno = tb_borrow.cno)
--内连接
SELECT tb_card.name ,tb_card.class FROM tb_card INNER JOIN tb_borrow 
on tb_card.cno = tb_borrow.cno 
INNER JOIN tb_books 
on tb_books.bno = tb_borrow.bno
WHERE tb_books.bname = '水浒' 
--4. 查询过期未还图书，输出借阅者（卡号）、书号及还书日期
SELECT * FROM tb_borrow WHERE rdate <GETDATE()  
--5. 查询书名包括"网络"关键词的图书，输出书号、书名、作者
SELECT bno ,bname,author from tb_books where bname LIKE '%网络%' 
--6. 查询现有图书中价格最高的图书，输出书名及作者
SELECT bname, author from tb_books where price=(SELECT MAX(price)from tb_books  )
--7. 查询当前借了"计算方法"但没有借"计算方法习题集"的读者，输出其借书卡号，并按卡号降序排序输出
SELECT tb_borrow.cno from tb_books ,tb_borrow 
where tb_books.bname  = '计算方法'
AND tb_books. bno =tb_borrow .bno 
AND NOT EXISTS 
(SELECT tb_borrow.cno 
from tb_books ,tb_borrow borr
where tb_books .bname = '计算方法习题集'
AND tb_books.bno =borr .bno 
AND borr.cno = tb_borrow.cno)ORDER BY cno DESC
--8. 将"01"班同学所借图书的还期都延长一周
UPDATE tb_borrow SET 
tb_borrow.rdate = DATEADD(DAY,7,tb_borrow.rdate)
FROM tb_borrow ,tb_card 
where tb_card.class ='01'
AND tb_card.cno = tb_borrow.cno 
--9． 从BOOKS表中删除当前无人借阅的图书记录。
DELETE FROM tb_books where bno not in 
(SELECT bo.bno FROM tb_borrow,tb_books bo 
WHERE tb_borrow.bno=bo.bno)
--10.查询当前同时借有"计算方法"和"组合数学"两本书的读者，输出其借书卡号，并按卡号升序排序输出
SELECT tb_borrow.cno from tb_books ,tb_borrow 
where tb_books.bname  = '计算方法'
AND tb_books. bno =tb_borrow .bno 
AND NOT EXISTS 
(SELECT tb_borrow.cno 
from tb_books ,tb_borrow borr
where tb_books .bname = '组合数学'
AND tb_books.bno =borr .bno 
AND borr.cno = tb_borrow.cno)ORDER BY cno ASC