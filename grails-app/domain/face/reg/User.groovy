package face.reg
import grails.rest.*
import grails.rest.render.json.*
import face.reg.Password

@Resource(uri='/users')
class User {
    String username
    Password password
}

