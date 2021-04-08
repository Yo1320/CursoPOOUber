<?php
require_once('Car.php');
class UberBlack extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __constructor($license, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__constructor($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}
?>