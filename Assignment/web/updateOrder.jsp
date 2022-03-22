<%-- 
    Document   : updateOrder
    Created on : Mar 22, 2022, 3:07:31 PM
    Author     : khanh doan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <a href="#" class="navbar-brand has-logo">
                    <span class="logo d-inline">
                        <img src="https://cdn.discordapp.com/attachments/387267441245552642/942414648764944424/unknown.png" height="40" width="110" alt="reading">
                    </span>
                </a>   
                
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="admin.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="index.jsp">Log Out</a>
                        </li>
                    </ul>                  
                </div>
                <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search Book</button>
                </form>
            </div>
        </nav>
        
        <div class="container" style="margin-top: 10px">
            <form action="updateOrder" method="post">
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">Order ID</label>
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="id" value="${order.orid}" readonly/>                    
                </div>
                
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">Customer ID</label>
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="cus" value="${order.cus}" readonly/>                    
                </div>
                
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">Book ID</label>
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="book" value="${order.book}" readonly/>                    
                </div>
                
                
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">Start Date</label>
                    <input type="date" id="form3Example8" class="form-control form-control-lg" name="start" value="${order.start}" readonly/>                    
                </div>
                
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">End Date</label>
                    <input type="date" id="form3Example8" class="form-control form-control-lg" name="end" value="${order.end}"/>                    
                </div>
                
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">Status :</label>
                    <br/>
                        <c:choose>        
                            <c:when test = "${order.status==true}">
                               <input type="radio" name="status" value="1" checked/>Done
                               <input type="radio" name="status" value="0"/>No
                            </c:when>       
                            <c:when test = "${order.status==false}">
                                <input type="radio" name="status" value="1"/>Done
                                <input type="radio" name="status" value="0" checked/>No                             
                            </c:when>
                        </c:choose>
                </div>
                            
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </body>
</html>
