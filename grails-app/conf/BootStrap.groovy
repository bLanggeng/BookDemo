import com.bLanggeng.BookDemo.Book

class BootStrap {

    def init = { servletContext ->
		new Book(author:"Stephen King",title:"The Shining").save()
		new Book(author:"James Petterson",title:"Along Came a Spider").save()
    }
    def destroy = {
    }
}
