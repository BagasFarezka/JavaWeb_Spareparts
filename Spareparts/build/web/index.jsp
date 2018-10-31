<%-- 
    Document   : index
    Created on : Oct 30, 2018, 11:00:54 PM
    Author     : Bagas Farezka
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.barangModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Penjualan Spareparts</title>
    
    </head>
    
    <body bgcolor="maroon">
        <style type="text/css">
        
           h1 {
                font-family: Arial;
                text-align: center;
                color: #fff;
                padding: 10px;
                border: darkred;
           }

           h1 {
            position: relative;
            top: 100px;
            font-size: 100px;
           }

           h3 {
                font-family: Arial;
                text-align: center;
                color: #fff;
                font-size: 40px
             
           } 

           .menu ul {
            margin: 0; padding: 0;
            float: left;
            
            }
            
            .menu ul li {
            display: inline;
            }

            .menu ul li a {
            float: left; text-decoration: none;
            color: white; 
            padding: 10.5px 11px;
            }

            .menu ul li a {
                position: relative;
                top: 70px;
                left: 550px;
            }

        </style>
        
        <center><h1>Penjualan Sparepart</h1></center>
        
    
    <div class="menu">
        <ul>
            <li><a href="barangcontroller?proses=menuutama"><h3>Data Barang</h3></a></li>
            <li><a href="penjualancontroller?proses=menupenjualan"><h3>Penjualan</h3></a></li>
        </ul>
    </div>
</body>


</html>