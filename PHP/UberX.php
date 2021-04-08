<?php
require_once('Car.php');
class UberX extends Car { 
    public $brand;
    public $model;

    public function __constructor($license, $driver, $brand, $model){
        parent::__constructor($license,$driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}



?>