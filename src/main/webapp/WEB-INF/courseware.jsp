<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath %>" />
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>上传课件</title>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto:400,700" />
    <link rel="stylesheet" href="css/fontawesome.min.css" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/templatemo-style.css">
    <style type="text/css">
        .button {
            background-color: #455c71;
            border: none;
            color: white;
            height: 48px;
            border-radius: 12px;
            width: 97px;
            text-decoration: none;
            display: inline-block;
            font-size: 12px;
        }
    </style>
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>

<div class="container" align="center">
    <div>
    <div style="height: 30px;"></div>
        <c:if test="${sessionScope.user.uLevel eq 1}">
    <form action="pdfupload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" >
        <button type="submit" class="button">上传</button>
    </form>
        </c:if>
    </div>
    <div style="height: 15px;"></div>
    <div class="col-12 tm-block-col">
        <div class="tm-bg-primary-dark tm-block tm-block-taller tm-block-scroll">
            <table class="table">
                <thead>
                <tr align="center">
                    <th scope="col">教师编号</th>
                    <th scope="col">课件提题目</th>
                    <th scope="col">上传时间</th>
                    <th scope="col"> 操 作 </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${sessionScope.pdfs}" var="pdf">
                    <tr align="center">
                        <th scope="row"><b>${pdf.pdfAuthor}</b></th>
                        <td>${pdf.pdfName}</td>
                        <td>${pdf.pdfTime}</td>
                        <c:choose>
                            <c:when test="${sessionScope.user.uLevel eq 1}">
                                <td><a href="pdfdownload/${pdf.pdfId}" style="color: #bee5eb">下载</a>&nbsp;&nbsp;&nbsp;
                                <c:if test="${sessionScope.user.uId eq pdf.pdfAuthor}">
                                <a href="pdfdelete/${pdf.pdfId}" style="color: #bee5eb">删除</a>
                                </c:if>
                                </td>
                            </c:when>
                            <c:otherwise>
                                <td><a href="pdfdownload/${pdf.pdfId}" style="color: #bee5eb">下载</a></td>
                            </c:otherwise>
                        </c:choose>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            </br>
        </div>
    </div>
</div>

</body>
</html>
