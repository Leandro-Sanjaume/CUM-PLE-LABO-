-- 1
SELECT * FROM mascotas group by edad;
-- 2
SELECT * FROM mascotas group by peso;
-- 3
SELECT COUNT(edad), edad FROM mascotas group by edad;
-- 4
SELECT COUNT(pesos), pesos FROM mascotas group by pesos;	
-- 5
SELECT SUM(pesos) FROM mascotas WHERE edad >= 5 && edad <= 10;
-- 6
SELECT AVG(pesos) FROM mascotas;

-- 7
DELIMITER // 

CREATE PROCEDURE cuantasMascotasTiene(IN id_amo INT,  OUT total INT)
BEGIN
SELECT COUNT(id_mascota) INTO total FROM dueños WHERE id_amo = id_dueño;
END //

-- 7 de otra forma
DELIMITER // 

CREATE PROCEDURE cuantasMascotasTiene(IN id_amo INT, OUT total INT)
BEGIN
SELECT COUNT(mascotas)INTO total FROM mascotas WHERE id_mascota in (SELECT id_mascota FROM dueños WHERE id_amo = id_dueño);
END //

-- 8
DELIMITER //

CREATE PROCEDURE PesaMasDe15(IN id_mascotita INT)
BEGIN
DECLARE respuesta VARCHAR(100);
IF (SELECT peso FROM mascotas WHERE id_mascota = id_mascotita > 15) THEN
SET respuesta = 'Pesa mas de 15Kg';
ELSE
SET respuesta = "Pesa menos de 15Kg";
END IF;
SELECT respuesta;
END //

-- 9
DELIMITER //

CREATE PROCEDURE infoVet(IN id_veterinario INT)
BEGIN
SELECT * FROM veterinarios WHERE id_vet = id_veterinario;
END //

-- 10
DELIMITER //

CREATE PROCEDURE PesaMasIgual(IN pesoIndice INT)
BEGIN
SELECT * FROM mascotas WHERE peso >= pesoIndice;
END //

CALL PesaMasIgual(6);

-- EXTRA
CREATE PROCEDURE DipyPary(IN llegoElDipy BOOLEAN)
BEGIN
DECLARE fiestaka VARCHAR(100);
IF (llegoElDipy == TRUE) THEN
SET respuesta = 'EL DIPY PAPAAAAAA https://www.youtube.com/watch?v=NzxCGnRbejY';
ELSE
SET respuesta = "NAAAAAAAAAAAAAOOOOOOOOO https://www.youtube.com/watch?v=7cJaZEcd9OM";
END IF;
SELECT respuesta;
END //

CALL DipyPary(TRUE);