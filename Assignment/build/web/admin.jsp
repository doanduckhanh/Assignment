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
                <div class="navbar-header">
                <a href="#" class="navbar-brand has-logo">
                    <img src="https://cdn.discordapp.com/attachments/387267441245552642/942414648764944424/unknown.png" height="40" width="110" alt="reading">
                </a>   
                </div>
            </div>
        </nav>
        <!-- Content -->
       <div class="container">
            <ul class="nav nav-pills">
                <li class="active"><a data-toggle="pill" href="#order">Order</a></li>
                <li><a data-toggle="pill" href="#book">Book</a></li>
                <li><a data-toggle="pill" href="#categories">Categories</a></li>
                <li><a data-toggle="pill" href="#author">Categories</a></li>
            </ul>
  
            <div class="tab-content">
                <div id="order" class="tab-pane fade in active">
                    <h3>Order</h3>
                    <button class="btn btn-primary"><a href="Order_admin/addOrder.jsp">Create Order</a></button>
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
                            <c:forEach items="${list}" var="x">
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
                                    <td>
                                        <a href="">Update</a>
                                    </td>
                                </tr>                               
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div id="book" class="tab-pane fade">
                    <h3>Book</h3>
                    <button class="btn btn-primary"><a href="Book_admin/addBook.jsp">Add Book</a></button>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Book ID</th>
                                <th>Customer ID</th>
                                <th>Book ID</th>
                                <th>Start Date</th>
                                <th>End Date</th>
                                <th>Status</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${list}" var="x">
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
                                    <td>
                                        <a href=""></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div id="categories" class="tab-pane fade">
                    <h3>Categories</h3>
                    <button class="btn btn-primary" onclick="openForm()">Create Category</button>
                                        <div class="form-popup" id="myForm">
                                            <h1>Add Category</h1>
                                            <form action="Categories_admin/addCate" method="post" class="form-container">
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
                                        <button class="btn btn-primary" onclick="openForm()">Update Category</button>
                                        <div class="form-popup" id="myForm">
                                            <h1>Update Category</h1>
                                            <form action="Categories_admin/updateCate" method="post" class="form-container">
                                                <input type="text" id="form3Example8" class="form-control form-control-lg" name="cateid"/>
                                                <label class="form-label" for="form3Example8">Cate ID</label>  
                                                <input type="text" id="form3Example8" class="form-control form-control-lg" name="catename"/>
                                                <label class="form-label" for="form3Example8">Category Name</label>  
                                                <button type="submit" class="btn">Update</button>
                                                <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
                                            </form>
                                        </div>
                                        <button class="btn btn-primary"><a href="#" onclick="showMess(${x.ID})">Delete Category</a></button>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
      

        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container px-4 px-lg-5"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2021</p></div>
        </footer>
        <script>
            function showMess(id){
                var option = confirm("Are you sure to delete ?");
                if(option===true){
                    window.location.href='deleteCate?id='+id;
                }
            }
            function openForm() {
                document.getElementById("myForm").style.display = "block";
            }
            function closeForm() {
                document.getElementById("myForm").style.display = "none";
            }
        </script>
    </body>
</html>
