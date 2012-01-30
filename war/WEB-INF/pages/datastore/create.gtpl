<% include '/WEB-INF/includes/header.gtpl' %>

<h1>Criar nova conta</h1>

<%
	def status = request.getAttribute('status')
	
	if(status){
		println "${status}"
	}
%>
<div>
	<p>os campos com <span style="color:#c00;">*</span> precisam ser preenchidos</p>
</div>
<form id="form" name="formConta" action="/conta/save" method="post">
	<input type="hidden" id="action" name="action" value="add">
	
	<div>
		<label for="titulo">Titulo*</label>
		<input type="text" name="titulo" id="titulo" value="">
	</div>
	<div>
		<label for="valor">Valor*</label>
		<input type="text" name="valor" id="valor" value="">
	</div>
	
	<div >
		<input type="submit" name="enviar" value="add">	
	</div>
	
</form>


<% include '/WEB-INF/includes/footer.gtpl' %>

