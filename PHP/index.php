<?php

require_once("car.php");
require_once("UberX.php");
require_once("UberPool.php");
require_once("account.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Checrolet", "Spark");
$uberX->PrintDataCar();

$uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "AND456"), "Dodge", "Attitude");
$uberPool->printDataCar();
?>