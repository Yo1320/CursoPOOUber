<?php
require_once("Car.php");
require_once("UberX.php");
require_once("Account.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND567"), "Chevrolet", "Spark");
UberX->printDataCar();

?> 