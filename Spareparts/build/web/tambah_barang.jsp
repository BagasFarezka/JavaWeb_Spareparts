<%-- 
    Document   : tambah_barang
    Created on : Oct 30, 2018, 11:15:52 PM
    Author     : Bagas Farezka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Penjualan Sparepart</title>
    </head>
    <body>
        <body bgcolor="maroon">
             <style type="text/css">
        
           h1 {
                font-family: Arial;
                text-align: center;
                color: #fff;
                font-size: 40px;
                
           }
</style>
    <center><h1>Tambah Barang </h1></center>
    <form action="barangcontroller?data=barang&proses=input-barang" method="post">
        <table style="margin:20px auto;">

            <tr>
                <td>Kode Barang</td>
                <td><input type="text" name="kd_brg"></td>
            </tr>
            <tr>
                <td>Nama Barang</td>
                <td><input type="text" name="nama_brg"></td>
            </tr>
            <tr>
                <td>Stok</td>
                <td><input type="text" name="stok"></td>
            </tr>
            <tr>
                <td>Harga Jual</td>
                <td><input type="text" name="harga_jual"></td>
            </tr>
            <tr>
                <td>Harga Beli</td>
                <td><input type="text" name="harga_beli"></td>
            </tr>
            <tr>
                <td>Satuan</td>
                <td><input type="text" name="satuan"></td>
            </tr>
            <tr>
                <td>Kategori</td>
                <td><input type="text" name="kategori"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Tambah"></td>
            </tr>

<!--            <center>
                <a class="tambah" href="barangcontroller?proses=input-barang">Tambah</a>
            </center>-->
        </table>
    </form> 

</body>
</html>
</body>
</html>
