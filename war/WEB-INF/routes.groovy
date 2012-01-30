
get "/", forward: "/WEB-INF/pages/index.gtpl"
get "/how-it-work", forward: "/WEB-INF/pages/how-it-work.gtpl"
get "/about", forward: "/WEB-INF/pages/about.gtpl"
get "/contact", forward: "/WEB-INF/pages/contact.gtpl"

get "/test/@var1/@var2", forward: "/teste.groovy?var1=@var1&var2=@var2"

get "/datetime", forward: "/datetime.groovy"

get "/datastore", forward: "/dataStoreGroovlet.groovy"

get "/conta/@action/", forward: "/conta/conta.groovy?action=@action"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"
