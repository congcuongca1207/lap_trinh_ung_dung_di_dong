<?php
function KetnoiDB()
{
    return new mysqli('localhost', 'root','','apr');
}
function themSanPhamDB($Masp, $TenSP, $DVT, $Dongia, $NCC)
{
    $con = KetnoiDB();
    $i = $con ->query('INSERT INTO sanpham VALUES (" '.$Masp.' ", " '.$TenSP.' ", " '.$DVT.' ", " '.$Dongia.' ", " '.$NCC.' ")');
    return $i;
}
function hienthiSanPham()
{
    $con = KetnoiDB();
    $result = $con->query('SELECT * FROM sanpham');
    return $result;
}
function updateSanPhamDB($Masp, $TenSP, $DVT, $Dongia, $NCC)
{
    $con = KetnoiDB();
    $i = $con->query('UPDATE sanpham SET tenSP = $TenSP, DVT = $DVT, DonGia = $Dongia, NCC = $NCC WHERE MaSP = $Masp');
    return $i;
}
