<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
    <h2>Dear Employee, Please enter your details</h2>
    <form:form action="showDetails" modelAttribute="employee">
        name <form:input path="name"/> <br>
        surname <form:input path="surname"/> <br>
        salary <form:input path="salary"/> <br>
        <input type="submit" value="Ok">
    </form:form>
</body>
</html>
