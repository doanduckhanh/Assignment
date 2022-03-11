    <%-- 
    Document   : admin.jsp
    Created on : Mar 6, 2022, 9:38:45 PM
    Author     : khanh doan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Custom Css -->
        <link rel="stylesheet" href="css/admin.css">
        <!-- Boostrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <!-- Responsive navbar-->
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
                            <a class="nav-link active" aria-current="page" href="index.jsp">Log Out</a>
                        </li>
                    </ul>                  
                </div>
                <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </nav>
        <!-- Content -->
       <div class="container">
            <ul class="nav nav-pills">
                <li class="active"><a data-toggle="pill" href="#order">Order</a></li>
                <li><a data-toggle="pill" href="#book">Book</a></li>
                <li><a data-toggle="pill" href="#categories">Categories</a></li>
            </ul>
  
            <div class="tab-content">
                <!-- Order Content -->
                <div id="order" class="tab-pane fade in active">
                    <h3>Order</h3>
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
                                        <c:if test="${x.status==1}">
                                            Done
                                        </c:if>
                                        <c:if test="${x.status==0}">
                                            No
                                        </c:if>
                                    </td>
                                </tr>                               
                            </c:forEach>
                        </tbody>
                    </table>
                    <div class="pagination">
                        <a href="admin?pageor=${1}" style="color: black">First</a>
                        <c:forEach begin="${1}" end="${requestScope.numor}" var="i">
                            <a href="admin?pageor=${i}" style="color: black">${i}</a>
                        </c:forEach>
                        <a href="admin?pageor=${requestScope.numor}" style="color: black">Last</a>
                    </div>
                </div>
                <!-- Book Content -->
                <div id="book" class="tab-pane fade">
                    <h3>Book</h3>
                    <button class="btn btn-primary"><a href="addBook">Add Book</a></button>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Book ID</th>
                                <th>Book Name</th>
                                <th>Author</th>
                                <th>Category</th>
                                <th>Number of Book</th>
                                <th>Entry Date</th>
                                <th>Price</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listb}" var="b">
                                <tr>
                                    <td>${b.ID}</td>
                                    <td>${b.name}</td>
                                    <td>${b.author}</td>
                                    <td>${b.category.name}</td>
                                    <td>${b.number}</td>
                                    <td>${b.entryDate}</td>
                                    <td>${b.price}</td>
                                    <td>
                                        <button class="btn btn-primary"><a href="updateBook?id=${b.ID}">Update</a></button>
                                        <button class="btn btn-primary" ><a href="#" onclick="showMess1(${b.ID})">Delete</a></button>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <div class="pagination">
                        <a href="admin?pageb=${1}" style="color: black">First</a>
                        <c:forEach begin="${1}" end="${requestScope.numb}" var="i">
                            <a href="admin?pageb=${i}" style="color: black">${i}</a>
                        </c:forEach>
                        <a href="admin?pageb=${requestScope.numb}" style="color: black">Last</a>
                    </div>
                </div>
                <!-- Categories Content -->
                <div id="categories" class="tab-pane fade">
                    <h3>Categories</h3>
                    <button class="btn btn-primary" onclick="openForm()">Create Category</button>
                                        <div class="form-popup" id="myForm">
                                            <h1>Add Category</h1>
                                            <form action="addCate" method="post" class="form-container">
                                                <input type="text" id="form3Example8" class="form-control form-control-lg" name="cateid"/>
                                                <label class="form-label" for="form3Example8">Cate ID</label>  
                                                <input type="text" id="form3Example8" class="form-control form-control-lg" name="catename"/>
                                                <label class="form-label" for="form3Example8">Category Name</label>  
                                                <button type="submit" class="btn">Create</button>
                                                <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
                                            </form>
                                        </div>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Category ID</th>
                                <th>Category Name</th>
                                <th>Number of Book</th>                                
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${list1}" var="x">
                                <tr>
                                    <td>${x.ID}</td>
                                    <td>${x.name}</td>
                                    <td>${x.numB}</td>
                                    <td>
                                        <button class="btn btn-primary" onclick="openForm1()">Update Category</button>
                                        <div class="form-popup" id="myForm1">
                                            <h1>Update Category</h1>
                                            <form action="updateCate" method="post" class="form-container">           
                                                <input type="text" id="form3Example8" class="form-control form-control-lg" name="cateid" value="${x.ID}" readonly/>
                                                <label class="form-label" for="form3Example8">Category Name</label>  
                                                <input type="text" id="form3Example8" class="form-control form-control-lg" name="catename"/>
                                                <label class="form-label" for="form3Example8">Category Name</label>  
                                                <button type="submit" class="btn">Update</button>
                                                <button type="button" class="btn cancel" onclick="closeForm1()">Close</button>
                                            </form>
                                        </div>
                                        <button class="btn btn-primary"><a href="#" onclick="showMess(${x.ID})">Delete Category</a></button>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <div class="pagination">
                        <a href="admin?pagecate=${1}" style="color: black">First</a>
                        <c:forEach begin="${1}" end="${requestScope.numcate}" var="i">
                            <a href="admin?pagecate=${i}" style="color: black">${i}</a>
                        </c:forEach>
                        <a href="admin?pagecate=${requestScope.numcate}" style="color: black">Last</a>
                    </div>
                </div>
            </div>
        </div>
      

        
        <script>
            function showMess(id){
                var option = confirm("Are you sure to delete ?");
                if(option===true){
                    window.location.href='deleteCate?id='+id;
                }
            }
            function showMess1(id){
                var option = confirm("Are you sure to delete ?");
                if(option===true){
                    window.location.href='deleteBook?id='+id;
                }
            }
            function showMess2(id){
                var option = confirm("Are you sure to delete ?");
                if(option===true){
                    window.location.href='deleteOrder?id='+id;
                }
            }
            function openForm() {
                document.getElementById("myForm").style.display = "block";
            }
            function closeForm() {
                document.getElementById("myForm").style.display = "none";
            }
            function openForm1() {
                document.getElementById("myForm1").style.display = "block";
            }
            function closeForm1() {
                document.getElementById("myForm1").style.display = "none";
            }
        </script>
    </body>
</html>
