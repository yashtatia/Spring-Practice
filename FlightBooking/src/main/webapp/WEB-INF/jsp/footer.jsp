
	<footer class="row-footer">
        <div class="container">
            <div class="row row-content">             
                
                <div class="col-md-8">
                    <address>
		              Whitefield<br>
		              Bengaluru<br>
		              
                    </address>
                </div>
                <div class="col-md-4">
                    <div >
                        <a class="btn btn-social-icon btn-google-plus" href="http://google.com/+"><i class="fa fa-google-plus"></i></a>
                        <a class="btn btn-social-icon btn-facebook" href="http://www.facebook.com/profile.php?id="><i class="fa fa-facebook"></i></a>
                        <a class="btn btn-social-icon btn-linkedin" href="http://www.linkedin.com/in/"><i class="fa fa-linkedin"></i></a>
                        <a class="btn btn-social-icon btn-twitter" href="http://twitter.com/"><i class="fa fa-twitter"></i></a>
                        <a class="btn btn-social-icon btn-youtube" href="http://youtube.com/"><i class="fa fa-youtube"></i></a>
                        <a class="btn btn-social-icon" href="mailto:"><i class="fa fa-envelope-o"></i></a>
                    </div>
                </div>
             </div>
             <div class="row row-content">             
                <div class="col-md-8">                    
		              <i class="fa fa-envelope"></i>: 
                         <a href="mailto:flights@sap.net">
                         flights@sap.net</a>                    
                </div>
                <div class="col-md-4">
                    <p align=center> &copy; Copyright 2017 SAP Flights</p>
                </div>
             </div>            
        </div>
    </footer>




<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="assets/js/jquery-ui.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
<script>
        $().button('toggle');
        $(document).ready(function(){
            $("#login").click(function(){
                console.log("yo!");
                $("#loginModal").modal();
            });
        });
        
        $(document).ready(function(){
            $("#table").click(function(){
                $("#tableModal").modal();
            });
        });
</script>
<script type="text/javascript">
function cancel(id) { 
	swal({
        title: "Are you sure?",
        text: "You will not be able to revert this!",
        type: "warning",
        showCancelButton: true,
        confirmButtonClass: 'btn-danger',
        confirmButtonText: 'Yes, delete it!',
        cancelButtonText: "No, cancel plx!",
        closeOnConfirm: false,
        closeOnCancel: false
    },
    function (isConfirm) {
        if (isConfirm) {
            //swal("Deleted!", "Your booking has been deleted!", "success"),function(){
              //  console.log("ye");
				  window.location.href = 'cancelBooking.html?bookingId='+id;
			//   };
        } else {
            swal("Cancelled", "Your booking is safe :)", "error");
        }
    });
                
};
	                
	   </script>
</body>
</html>