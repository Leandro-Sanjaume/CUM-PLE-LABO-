create database empresa;
use empresa;

-- 1:
select id_pedido, descripcion, id_cliente, fecha_compra, descuento from pedidos where fecha_entrega between "2017-06-30" and "2017-08-01" order by id_cliente, fecha_compra desc;

-- 2:
select count(codigo_producto) from detallespedidos group by id_pedido;

-- 3:
select descuento from pedidos where descuento > 10;

-- 4:
select sum(cantidad), codigo_producto from detallespedidos group by codigo_producto;

-- 5:
 update clientes set telefono = 45224556, email = "juan@gmail.com" where id_cliente = 1;

-- 6:
select id_pedido, cantidad from detallespedidos where 3 < (select count(codigo_producto) from detallespedidos) ;

-- 7:
select id_pedido, id_cliente, descripcion from pedidos where descuento in (5, 10, 15);

-- 8:
 delete from clientes where fecha_alta = "1999-01-23";

-- 9:
 insert into clientes(nombre, apellido, direccion, telefono, email, fecha_alta) values
	("Tomas", "Toledo", "CalleFalsa124", 3232523, "TomasToledo@hotmail.com", "2017-12-23");
    
-- 10:
 select descuento*precio_venta/100 from pedidos  inner join detallespedidos on pedidos.id_pedido = detallespedidos.id_pedido where pedidos.id_pedido = 1;