<?php 
include "./yonetim/config/baglan.php";
$slidersor=$db->prepare("select * from slider where slider_durum=1 order by slider_sira asc");
$slidersor->execute();
?>

<section class="w3l-main-slider" id="home">
     <div class="companies20-content">
         <div class="owl-one owl-carousel owl-theme">

            <?php while($sliderGetir=$slidersor->fetch(PDO::FETCH_ASSOC)){ ?>
             <div class="item">
                 <li>
                     <div class="slider-info banner-view bg bg2" style="background-image: url(<?php echo $sliderGetir['slider_img'] ?> );">
                         <div class="banner-info">
                             <div class="container">
                                 <div class="banner-info-bg">
                                     <h5><?php echo$sliderGetir['slider_text'] ?>
                                     </h5>
                                     <a class="btn btn-style transparent-btn mt-sm-5 mt-4" href="<<?php echo $sliderGetir['slider_button'] ?>"> <?php echo $sliderGetir['slider_text'] ?></a>
                                 </div>
                             </div>
                         </div>
                     </div>
                 </li>
             </div>

         <?php } ?>
         </div>
     </div>
 </section>