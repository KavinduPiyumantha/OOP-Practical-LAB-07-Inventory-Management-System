create DATABASE InventorySystem;

create table ItemsTable(
Item_No int not null unique,
Name varchar(255) not null,
Quantity int not null,
Price boolean not null,
primary key(Item_No)
);



















drop table itemstable;