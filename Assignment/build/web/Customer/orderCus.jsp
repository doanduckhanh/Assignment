<%-- 
    Document   : orderCus
    Created on : Mar 13, 2022, 10:26:23 AM
    Author     : khanh doan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Customer</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container px-5">
                <a href="#" class="navbar-brand has-logo">
                    <span class="logo d-inline">
                        <img src="https://cdn.discordapp.com/attachments/387267441245552642/942414648764944424/unknown.png" height="40" width="110" alt="reading">
                    </span>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">                 
                        <li class="nav-item"><a class="nav-link active" href="updateCustomer?id=${cus.cusID}">${requestScope.cus.name}</a></li>
                        <li class="nav-item"><a class="nav-link active" href="ordercus?id=${requestScope.cus.cusID}">Your Order</a></li>  
                        <li class="nav-item"><a class="nav-link active" href="index.jsp">Logout</a></li>                      
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Search Box -->
        <div id="search-box" class="s130">
            <form action="search" method="post">
                <div class="inner-form">
                    <div class="input-field first-wrap">
                        <div class="svg-wrapper">
                            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                                <path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z"></path>
                            </svg>
                        </div>
                        <input name="search" type="text" value="">
                    </div>
                    <div class="input-field second-wrap">
                        <button class="btn-search" type="submit">SEARCH</button>
                    </div>
                </div>
            </form>
        </div>
        <!-- List Order -->
        <div class="container">
            <h3>Your Order</h3>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Order ID</th>
                                <th>Customer ID</th>
                                <th>Book ID</th>
                                <th>Start Date</th>
                                <th>End Date</th>
                                <th>Status</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listor}" var="x">
                                <tr>
                                    <td>${x.orid}</td>
                                    <td>${x.cus}</td>
                                    <td>${x.book}</td>
                                    <td>${x.start}</td>
                                    <td>${x.end}</td>
                                    <td>
                                        <c:if test="${x.status==true}">
                                            <h4 style="color: green">Done</h4>
                                        </c:if>
                                        <c:if test="${x.status==false}">
                                            <h4 style="color: red">No</h4>
                                        </c:if>
                                    </td>
                                </tr>                               
                            </c:forEach>
                        </tbody>
                    </table>
        </div>
    </body>
</html>
