<%@ page import="java.util.*,com.todo.dao.TaskDao,com.todo.model.Task" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>All Tasks</h2>
    <%
        TaskDao dao = new TaskDao();
        List<Task> tasks = dao.selectAllTasks();
        for(Task t : tasks) {
    %>
        <p><b><%=t.getTitle()%></b> - <%=t.getDescription()%> [Completed: <%=t.isCompleted()%>]</p>
    <% } %>

</body>
</html>