create DATABASE InventorySystem;

create table ItemsTable(
Item_No int not null unique auto_increment,
Name varchar(255) not null,
Quantity int not null,
Price double not null,
primary key(Item_No)
);





-- drop table ItemsTable;

-- Insert into ItemsTable(Name,Quantity,Price) 
-- Value("frehff",120,202);


-- ALTER TABLE ItemsTable AUTO_INCREMENT = 1;



-- select * from ItemsTable where Item_No=2;
-- select * from ItemsTable where Name like "ewrfew%";

-- drop table itemstable;