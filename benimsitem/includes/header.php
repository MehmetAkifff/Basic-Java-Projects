<?php 
include "./yonetim/config/baglan.php";
$menuSor=$db->prepare("select * from menu order by menu_sira asc");
$menuSor->execute();

include "./yonetim/config/baglan.php";
$ayarSor=$db->prepare("select * from ayarlar");
$ayarSor->execute();
$ayarGetir=$ayarSor->fetch(PDO::FETCH_ASSOC)
?><!--
Author: W3layouts
Author URL: http://w3layouts.com
-->
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Benim Sitem</title>

    <link href="//fonts.googleapis.com/css?family=Spartan:400,500,600,700,900&display=swap" rel="stylesheet">

    <!-- Template CSS -->
    <link rel="stylesheet" href="assets/css/style-starter.css">
  </head>
  <body>
<!--w3l-header-->

<header class="w3l-header-nav">
	<!--/nav-->
	<nav class="navbar navbar-expand-lg navbar-light fill px-lg-0 py-0 px-3">
		<div class="container">
			<a class="navbar-brand" href="index.php">
				<img src="<?php echo$ayarGetir['ayarlar_logo']?>" alt="Your logo" style="height:35px;" /> Hotels</a>
			<!-- if logo is image enable this   
						<a class="navbar-brand" href="#index.php">
							<img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
						</a> -->
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto">
					<?php
						while($menuGetir=$menuSor->fetch(PDO::FETCH_ASSOC)){
							if($menuGetir['menu_durum']==1){
							?>
							<li class="nav-item <?php echo basename($_SERVER['PHP_SELF']) == $menuGetir['menu_url'] ? "active":"null" ?>">
								<a class="nav-link" href="<?php echo $menuGetir['menu_url']?>">
									<?php echo $menuGetir['menu_ad'];?></a>
							</li>
					<?php		
					}	
						}
					?>
					</ul>
					
					</li>
				</ul>
				<a href="#booking" class="ml-3 book btn btn-secondary btn-style">REZERVASYON</a>
			</div>
		</div>
	</nav>
	<!--//nav-->
</header>
