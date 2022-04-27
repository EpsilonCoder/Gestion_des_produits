<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion des Produits</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header">Gestion des produits</div>
			<div class="card-body">
				<form action="epsilon" method="get">
					<label>Mot clés</label> <input type="text" name="motCle" /> <input
						type="submit" value="Chercher" class="btn btn-success">
				</form>


				

					<table class="table table-striped">
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Désignation</th>
								<th scope="col">Prix</th>
								<th scope="col">Quantité</th>
								<th scope="col">Actions</th>
							</tr>
						</thead>
						<tbody>
							
							<c:forEach items="${model.produits}" var="p">
								<tr>
								<td>${p.id}</td>
								<td>${p.designation}</td>
								<td>${p.prix}</td>
								<td>${p.quantité}</td>
								<td>
								<a class="btn btn-light">Modifier</a>
								<a class="btn btn-danger">Supprimer</a>
								</td>
								</tr>
							</c:forEach>
							
						</tbody>
					</table>



			</div>
		</div>

	</div>

</body>
</html>