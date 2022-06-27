<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, you are WELCOME!!!</h2>
<%--    <p>Your name: ${param.employeeName}</p>--%>
<p>
    Your name: ${employee.name}<br>
    Your surname: ${employee.surname}<br>
    Your salary: ${employee.salary}<br>
    Your department: ${employee.department}<br>
    Your car: ${employee.carBrand} <br>
    Your languages:
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
</p>
</body>
</html>
