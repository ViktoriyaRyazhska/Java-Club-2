<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/includes/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Редагування</title>
</head>
<body>
	<%@include file="/WEB-INF/views/includes/header.jsp"%>

	<div class="container">
		<div class="p-3 border bg-light">
			<form:form method="POST" action="/book/edit?bookId=${bookModel.id}"
				modelAttribute="bookModel">
				
				<div class="input-group mb-3">
				<span class="input-group-text" id="inputGroup-sizing-small">Назва</span>
					<form:input type="text" placeholder="Назва" path="title" />
				</div>
				<br>
				<div class="input-group mb-3">
				<span class="input-group-text" id="inputGroup-sizing-small">Опис</span>
					<form:textarea type="text" placeholder="Опис" path="description" />
				</div>
				<br>
				<div class="input-group mb-3">
				<span class="input-group-text" id="inputGroup-sizing-small">Дата публікації</span>
					<form:input type="date" placeholder="Дата" path="publicationDate" />
				</div>

				<div class="input-group mb-3">
				<span class="input-group-text" id="inputGroup-sizing-small">Автор</span>
					<form:select path="authorId">
						<c:forEach items="${authors}" var="author">
							<form:option value="${author.id}">${author.firstName} ${author.lastName}</form:option>
						</c:forEach>
					</form:select>
				</div>
			
					<div class="input-group mb-3">
					<span class="input-group-text" id="inputGroup-sizing-small">Жанр</span>
					<form:select path="genreId">
						<c:forEach items="${genres}" var="genre">
							<form:option value="${genre.id}">${genre.title}</form:option>
						</c:forEach>
					</form:select>
				</div>

				<button class="btn btn-outline-success">Зберегти</button>
			</form:form>
			
			
			
			
		</div>
		
		 Додати копії
		<div class="p-3 border bg-light">
		<form:form method="POST" action="/book/createcopy?bookId=${bookModel.id}"
				modelAttribute="createCopyModel">
				<div class="input-group mb-3">
				<span class="input-group-text" id="inputGroup-sizing-small">Кількість копій</span>
					<form:input type="number"  path="count" />
				</div>
				<button class="btn btn-outline-success">Створити</button>
		</form:form>
		</div>
		
		Додати со автора 
		<div class="p-3 border bg-light">
		<form:form method="POST" action="/book/addcoauthor?id=${bookModel.id}"
				modelAttribute="coauthorModel">
				<div class="input-group mb-3">
				
				<form:select path="id">
						<c:forEach items="${coauthors}" var="coauthor">
							<form:option value="${coauthor.id}">${coauthor.firstName} ${coauthor.lastName}</form:option>
						</c:forEach>
					</form:select>
				</div>
			
				<button class="btn btn-outline-success">Додати со автора</button>
		</form:form>
		</div>
	</div>
</body>
</html>