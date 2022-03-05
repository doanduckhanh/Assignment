
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Signup Page</title>
    <!--Bootstrap 4 CDN-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!-- Custom Stylesheet -->
    <link rel="stylesheet" type="text/css" href="css/Signup-style.css">
    <!--Fontawesome CDN-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <!-- Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <!-- State/City -->   
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js'></script>
    <script src='https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js'></script>
</head>
<body>
	<!-- Responsive navbar-->
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
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="index.jsp">Trang chủ</a></li>
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="login.jsp">Đăng nhập</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    <!-- Signup Form -->
    <section class="h-100 bg-dark">
    <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-4">
          <div class="row g-0">
            <div class="col-xl-6 d-none d-xl-block">
              <img
                src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
                alt="Sample photo"
                class="img-fluid"
                style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;"
              />
            </div>
              <!-- Form -->
            <div class="col-xl-6">
              <form action="signup" method="post">
              <div class="card-body p-md-5 text-black">
                                  
                <div class="form-outline mb-4">
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="username"/>
                    <label class="form-label" for="form3Example8">Tên đăng nhập (có từ 6 ký tự trở lên)</label>
                </div>
                
                <div class="form-outline mb-4">
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="password"/>
                    <label class="form-label" for="form3Example8">Mật khẩu (có từ 8 đến 12 ký tự)</label>
                </div>
                  
                <div class="form-outline mb-4">
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="fullname"/>
                    <label class="form-label" for="form3Example8">Họ và tên</label>
                </div>
                  
                <div class="form-outline mb-4">
                    <input type="text" id="form3Example8" class="form-control form-control-lg" name="address"/>
                    <label class="form-label" for="form3Example8">Địa chỉ</label>
                </div>

                <select name="calc_shipping_provinces" required="">
                <option value="">Provinces</option>
                </select>
                <select name="calc_shipping_district" required="">
                <option value="">District</option>
                </select>
                <input class="billing_address_1" name="city" type="hidden" value="">
                <input class="billing_address_2" name="state" type="hidden" value="">
                <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">

                  <h6 class="mb-0 me-4">Giới tính </h6>
                  <br> 
                  <div class="form-check form-check-inline mb-0 me-4">
                    <input
                      class="form-check-input"
                      type="radio"
                      name="gender"
                      id="femaleGender"
                      value="1"
                    />
                    <label class="form-check-label" for="femaleGender">Nam</label>
                  </div>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <input
                      class="form-check-input"
                      type="radio"
                      name="gender"
                      id="maleGender"
                      value="0"
                    />
                    <label class="form-check-label" for="maleGender">Nữ</label>
                  </div>
                </div>

                <div class="form-outline mb-4">
                    <input type="text" id="form3Example9" class="form-control form-control-lg" name="dob"/>
                    <label class="form-label" for="form3Example9">Ngày sinh</label>
                </div>

                <div class="form-outline mb-4">
                    <input type="text" id="form3Example90" class="form-control form-control-lg" name="phone"/>
                  <label class="form-label" for="form3Example90">SDT</label>
                </div>

                <div class="form-outline mb-4">
                    <input type="text" id="form3Example99" class="form-control form-control-lg" name="cid"/>
                    <label class="form-label" for="form3Example99">CMND</label>
                </div>

                <div class="form-outline mb-4">
                    <input type="text" id="form3Example97" class="form-control form-control-lg" name="email"/>
                    <label class="form-label" for="form3Example97">Email</label>
                </div>
                <div class="d-flex justify-content-end pt-3">
                  <button type="submit" class="btn btn-warning btn-lg ms-2">Submit</button>
                </div>
              </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
    </div>
</section>

<script>//<![CDATA[
if (address_2 = localStorage.getItem('address_2_saved')) {
  $('select[name="calc_shipping_district"] option').each(function() {
    if ($(this).text() == address_2) {
      $(this).attr('selected', '')
    }
  })
  $('input.billing_address_2').attr('value', address_2)
}
if (district = localStorage.getItem('district')) {
  $('select[name="calc_shipping_district"]').html(district)
  $('select[name="calc_shipping_district"]').on('change', function() {
    var target = $(this).children('option:selected')
    target.attr('selected', '')
    $('select[name="calc_shipping_district"] option').not(target).removeAttr('selected')
    address_2 = target.text()
    $('input.billing_address_2').attr('value', address_2)
    district = $('select[name="calc_shipping_district"]').html()
    localStorage.setItem('district', district)
    localStorage.setItem('address_2_saved', address_2)
  })
}
$('select[name="calc_shipping_provinces"]').each(function() {
  var $this = $(this),
    stc = ''
  c.forEach(function(i, e) {
    e += +1
    stc += '<option value=' + e + '>' + i + '</option>'
    $this.html('<option value="">Tỉnh / Thành phố</option>' + stc)
    if (address_1 = localStorage.getItem('address_1_saved')) {
      $('select[name="calc_shipping_provinces"] option').each(function() {
        if ($(this).text() == address_1) {
          $(this).attr('selected', '')
        }
      })
      $('input.billing_address_1').attr('value', address_1)
    }
    $this.on('change', function(i) {
      i = $this.children('option:selected').index() - 1
      var str = '',
        r = $this.val()
      if (r != '') {
        arr[i].forEach(function(el) {
          str += '<option value="' + el + '">' + el + '</option>'
          $('select[name="calc_shipping_district"]').html('<option value="">Quận / Huyện</option>' + str)
        })
        var address_1 = $this.children('option:selected').text()
        var district = $('select[name="calc_shipping_district"]').html()
        localStorage.setItem('address_1_saved', address_1)
        localStorage.setItem('district', district)
        $('select[name="calc_shipping_district"]').on('change', function() {
          var target = $(this).children('option:selected')
          target.attr('selected', '')
          $('select[name="calc_shipping_district"] option').not(target).removeAttr('selected')
          var address_2 = target.text()
          $('input.billing_address_2').attr('value', address_2)
          district = $('select[name="calc_shipping_district"]').html()
          localStorage.setItem('district', district)
          localStorage.setItem('address_2_saved', address_2)
        })
      } else {
        $('select[name="calc_shipping_district"]').html('<option value="">Quận / Huyện</option>')
        district = $('select[name="calc_shipping_district"]').html()
        localStorage.setItem('district', district)
        localStorage.removeItem('address_1_saved', address_1)
      }
    })
  })
})
//]]></script>
<!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
</body>
</html>
