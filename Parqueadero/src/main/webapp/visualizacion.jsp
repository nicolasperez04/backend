<!DOCTYPE html>
<html>
<head>
    <title>Visualizar Entradas</title>
</head>
<body>
    <h1>Visualizar Entradas de Veh�culo</h1>
    <table>
        <tr>
            <th>Placa</th>
            <th>Hora de Entrada</th>
            <th>Ubicaci�n</th>
            <th>Tipo de Veh�culo</th>
        </tr>
        <c:forEach var="entrada" items="${entradas}">
            <tr>
                <td>${entrada.placa}</td>
                <td>${entrada.horaEntrada}</td>
                <td>${entrada.ubicacion}</td>
                <td>${entrada.tipoVehiculo}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
