<!DOCTYPE html>
<html>
<head>
    <title>Registro de Entrada</title>
</head>
<body>
    <h1>Registro de Entrada de Veh�culo</h1>
    <form action="registrarEntrada" method="post">
        <label for="placa">Placa del Veh�culo:</label>
        <input type="text" id="placa" name="placa" required maxlength="6"><br>
        <label for="horaEntrada">Hora de Entrada:</label>
        <input type="text" id="horaEntrada" name="horaEntrada" required><br>
        <label for="ubicacion">Ubicaci�n:</label>
        <input type="text" id="ubicacion" name="ubicacion" required><br>
        <label for="tipoVehiculo">Tipo de Veh�culo:</label>
        <select id="tipoVehiculo" name="tipoVehiculo">
            <option value="carro">Carro</option>
            <option value="motocicleta">Motocicleta</option>
            <option value="cicla">Cicla</option>
        </select><br>
        <input type="submit" value="Registrar Entrada">
    </form>
</body>
</html>
