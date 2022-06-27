<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, Please enter your details</h2>
<form:form action="showDetails" modelAttribute="employee">
    name <form:input path="name"/> <br>
    surname <form:input path="surname"/> <br>
    salary <form:input path="salary"/> <br>
    department <form:select path="department">
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
    </form:select> <br>

    Which car do you want? <br>
<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    Toyota <form:radiobutton path="carBrand" value="Toyota"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>

    <input type="submit" value="Ok">
</form:form>
</body>
</html>
