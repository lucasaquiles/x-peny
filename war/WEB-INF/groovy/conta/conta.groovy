import com.google.appengine.api.datastore.*



if(params.action){
	
	if(params.action == 'create'){
		forward "/WEB-INF/pages/datastore/create.gtlp"
	}
	
	if(params.action == 'save'){
		
		def conta = new Entity('conta')
		conta.titulo = params.titulo
		conta.valor = params.valor
		conta.dataEntrada = new Date()
		
		conta.save()
		
		request.setAttribute "status", "salved"
		forward "/WEB-INF/pages/datastore/create.gtpl"
	}
	
}else{
	
	forward "/WEB-INF/pages/datastore/create.gtlp"
}
//try{
//	if(params.action == "create"){

//		forward "/WEB-INF/pages/datastore/create.gtpl"
//	}
//	
//	if(params.action == "save"){
//		
//		def conta = new Entity('conta')
//		conta.titulo = params.titulo
//		conta.valor = Double.parseDouble(params.valor)
//		conta.dataEntrada = new Date().parse("dd/MM/yyyy", System.getcurrenttimemillis())
//		
//		println "opa"
//	}
//}catch(Exception e){
//	println "opa"
//}



