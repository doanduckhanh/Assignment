<%-- 
    Document   : updateBook
    Created on : Mar 10, 2022, 9:42:57 AM
    Author     : khanh doan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Book</title>
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
        <!-- Form add book -->
        <div class="container" style="margin-top: 10px">
            <form action="addBook" method="post">             
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">Book ID</label>
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="id" value="${book.id}"/>                    
                </div>
                
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">Book Name</label>
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="name" value="${book.name}"/>                   
                </div>
                  
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">Category :</label>
                    <br/>
                    <c:forEach items="${listcate}" var="x">
                        <c:choose>        
                            <c:when test = "${x.ID==book.category.ID}">
                               <input type="radio" name="category" value="${x.ID}" checked/>${x.name}
                            </c:when>       
                            <c:when test = "${x.ID!=book.category.ID}">
                               <input type="radio" name="category" value="${x.ID}"/>${x.name}
                            </c:when>
                        </c:choose>
                    </c:forEach>
                </div>
                  
                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example8">Number of Book</label>
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="number" value="${book.number}"/>
                </div>


                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example9">Entry Date</label>
                    <input type="text" id="form3Example9" class="form-control form-control-lg" name="entrydate" value="${book.entrydate}"/>
                </div>

                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example90">Price</label>
                    <input type="text" id="form3Example90" class="form-control form-control-lg" name="price" value="${book.price}"/>                 
                </div>

                <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example99">Author</label>
                    <input type="text" id="form3Example99" class="form-control form-control-lg" name="author" value="${book.author}"/>
                </div>
                 <button type="submit" class="btn btn-primary">Submit</button>
              </form>            
        </div>
    </body>
</html>
