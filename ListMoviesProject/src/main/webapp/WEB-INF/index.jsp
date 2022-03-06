<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page
	isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script type="text/javascript">
function myFunction() {
	  // Declare variables
	  var input, filter, table, tr, td, i, txtValue;
	  input = document.getElementById("keyword");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("movieTable");
	  tr = table.getElementsByTagName("tr");

	  // Loop through all table rows, and hide those who don't match the search query
	  for (i = 0; i < tr.length; i++) {
	    td = tr[i].getElementsByTagName("td")[1];
	    if (td) {
	      txtValue = td.textContent || td.innerText;
	      if (txtValue.toUpperCase().indexOf(filter) > -1) {
	        tr[i].style.display = "";
	      } else {
	        tr[i].style.display = "none";
	      }
	    }
	  }
	}
</script>
<style>
body{background-color:white;}
h1{
color:black;
text-align:center;
background-color:#264d73;
}

input{
float:right;
width:150px;
height:30px;
}

td {
  padding: 10px;
  text-align: center;
  color:black;
}
table{
border-collapse: collapse;
}
table.center {
  margin-left: auto; 
  margin-right: auto;
}

tr:hover {background-color: #242333; }

tr:hover, td:active{color:white;}
</style>
<h1>Movies</h1>

<input type="text" id="keyword" onkeyup="myFunction()" placeholder="Search for movie names.." title="Type in a name">
<br/>
<table id="movieTable" class="center">
	
	<c:forEach var="ShowMovie" items="${movieslist}">
	<tr>
		<td><img src="data:image/jpg;base64,${ShowMovie.base64Image}" width="240" height="300"/></td>
		<td>${ShowMovie.name}</td>
		<td>${ShowMovie.language}</td>
		<td>${ShowMovie.duration}</td>		
		<td>${ShowMovie.cast_names}</td>		
		<td><form action="/book"><input type="button" value="Book now"></form></td>
		</tr>
	</c:forEach>
</table>