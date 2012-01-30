import com.google.appengine.api.datastore.*



println request.getAttribute('action')

//if(request.getAttribute('action') == 'add'|| params.action == 'add' ){
//	
//	println "Oopa!"
//}else{
//	forward "/WEB-INF/pages/datastore/create.gtpl"
//	
//}

//if(params.action == 'submit'){
//	
//	
//	println "opa"

//}else{

//	def conta = new Entity("conta")

//	conta.titulo = "pizza vegan"
//	conta.valor = "2.40"
//	conta.dataEntrada = new Date().parse("dd/MM/yyyy","29/01/2012")

//	println "--------------> ${conta}"

//	assert conta.save()

//	//response.getOutputStream().println("${conta}")

//	forward "/WEB-INF/pages/datastore/create.gtpl"
//}
