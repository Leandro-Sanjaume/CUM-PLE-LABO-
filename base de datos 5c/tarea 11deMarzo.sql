create database colegio;
use colegio;
-- 1:
delete from alumnos where DNI = 42845014;

-- 2:
update notas set prim_trim = 2 where id_alumno = 25 and id_materia = 8;

-- 3:
select nombre, cant_horas, aula from materias where curso = "3c" order by nombre desc;

-- 4:
delete from alumnos where curso = "6c";

-- 5:
update alumnos set curso = "5c" where curso = "4c";

-- 6:
select nombre, dni, fecha_nasc from alumnos where curso = "4c" order by fecha_nasc desc;

-- 7:
drop table notas;

-- 8:
select max(prim_trim) from notas where id_materia = 2;

-- 9:
select avg(diciembre) from notas where id_materia = 3;

-- 10:
insert into alumnos(dni, nombre, direccion, telefono, curso, fecha_nasc) values
	(42124, "Lucas Audisio", "CalleFalsa123", 214323, "5c", "2004-08-24");