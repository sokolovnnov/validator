<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.6.0/dist/leaflet.css"/>
    <script src="https://unpkg.com/leaflet@1.6.0/dist/leaflet.js"></script>
    <style>
        #mapid {
            position: absolute;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
        }
    </style>
    <title>Validator</title>
</head>
<body>
<a href="connectivity.jsp">Connectivity test</a>
<div id="mapid"></div>
<input type="hidden" name="lat123">
<input type="hidden" name="lon123">
<script>
     var mymap = L.map('mapid').setView([45, 45], 13);
    L.tileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png').addTo(mymap);

    var latlngs = [
        [56.2359333, 44.0616644],
        [56.2360274, 44.0615783]
    ];
     // document.write(latlngs+ "<br>");
    var polyline = L.polyline(latlngs, {color: 'red'}).addTo(mymap);
    mymap.fitBounds(polyline.getBounds());

    L.marker([56.2359333, 44.0616644]).addTo(mymap);
    L.circle([${lat123}, ${lon123}], {radius: 100, color: "blue"}).addTo(mymap);

    <c:forEach items="${ways}" var="w">
    <%--var latl = ${w.wayId};--%>
    var a = [];
        <c:forEach items="${w.nodes}" var = "n">
            a.push([${n.lat}, ${n.lon}]);
        </c:forEach>
    var polyline1 = L.polyline(a, {color: 'red'}).addTo(mymap);
    // alert(a);
    // document.write(a+ "<br>");
    </c:forEach>

</script>
</body>
</html>