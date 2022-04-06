-- 1
select pedidos.id_pedido, descripcion, fecha_compra, fecha_entrega, codigo_producto from pedidos inner join detallespedidos on pedidos.id_pedido = detallespedidos.id_pedido where id_cliente = 1;

-- 2
select clientes.id_cliente, nombre, apellido, id_pedido, descripcion from pedidos inner join clientes on clientes.id_cliente = pedidos.id_cliente;

-- 3
select clientes.id_cliente, nombre, apellido, pedidos.id_pedido, descripcion, cantidad, codigo_producto from detallespedidos inner join pedidos on pedidos.id_pedido = detallespedidos.id_pedido inner join clientes on clientes.id_cliente = pedidos.id_cliente;

-- 4
select * from clientes where id_cliente not in (select id_cliente from pedidos group by id_cliente);

-- 6
select * from detallespedidos inner join pedidos on pedidos.id_pedido = detallespedidos.id_pedido where descuento = 5;

-- 7
select * from pedidos where descuento = (select max(descuento) from pedidos);

-- 8
select * from pedidos where descuento = (select min(descuento) from pedidos);

-- 9 
select * from clientes where id_cliente in (select id_cliente from pedidos group by id_cliente);

-- 10
select count(codigo_producto), id_pedido from detallespedidos group by id_pedido;

-- 11
SELECT *, (SELECT COUNT(*) FROM detallespedidos WHERE detallespedidos.id_pedido = pedidos.id_pedido) AS cantidad FROM pedidos WHERE (SELECT COUNT(*) FROM detallespedidos WHERE detallespedidos.id_pedido = pedidos.id_pedido) > 3;

-- 12
select DATEDIFF(fecha_entrega, fecha_compra) from pedidos group by id_pedido;

-- 13
select * from clientes where DATEDIFF(current_date(), fecha_alta) > 3650;

-- 14
select descuento*(sum(precio_venta*cantidad))/100 as precio_final, pedidos.id_pedido from pedidos inner join detallespedidos on pedidos.id_pedido = detallespedidos.id_pedido group by pedidos.id_pedido;

-- 15
select pedidos.*, descuento*(sum(precio_venta*cantidad))/100 as precio_final from pedidos inner join detallespedidos on pedidos.id_pedido = detallespedidos.id_pedido group by pedidos.id_pedido having descuento*(sum(detallespedidos.precio_venta*detallespedidos.cantidad))/100 > 3500;

-- 16
select sum(cantidad), codigo_producto from detallespedidos group by codigo_producto;

-- 17
select codigo_producto from detallespedidos where precio_venta = (select max(precio_venta) from detallespedidos);

-- 18a
select max(cantidad), min(cantidad), avg(cantidad) from detallespedidos group by id_pedido;

-- 18b
select max(codigo_producto), min(codigo_producto), avg(codigo_producto) from detallespedidos group by id_pedido;

-- 19
select nombre, apellido, descuento, descuento*(sum(precio_venta*cantidad))/100 as precio_final from clientes
 inner join pedidos on clientes.id_cliente = pedidos.id_cliente
 inner join detallespedidos on pedidos.id_pedido = detallespedidos.id_pedido 
 group by pedidos.id_pedido
 having descuento*(sum(detallespedidos.precio_venta*detallespedidos.cantidad))/100 > 3000;