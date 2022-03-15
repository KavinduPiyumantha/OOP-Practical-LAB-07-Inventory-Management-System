create DATABASE InventorySystem;

create table ItemsTable(
Item_No int not null unique auto_increment,
Name varchar(255) not null,
Quantity int not null,
Price double not null,
primary key(Item_No)
);



drop table ItemsTable;

Insert into ItemsTable(Name,Quantity,Price) 
Value("fref",10,20);


ALTER TABLE ItemsTable AUTO_INCREMENT = 1;






drop table itemstable;