<%--
  Created by IntelliJ IDEA.
  User: xgh
  Date: 2016/1/27
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>99乘法表</title>
  </head>
  <body>
    <%!
      String pringMultiTable(){
        StringBuilder s=new StringBuilder();
        for(int i=1;i<=9;i++){
          for(int j=1;j<=i;i++){
            s.append(i+"*"+j+"="+(i*j)+"&nbsp;&nbsp;&nbsp;&nbsp;");
          }
          s.append("\n");
        }
        return s.toString();
      }
    %>
  <h1>99乘法表</h1>s
  99乘法表：<br>
  <%=pringMultiTable()%>
  </body>
</html>
