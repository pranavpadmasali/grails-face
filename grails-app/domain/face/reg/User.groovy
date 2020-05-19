package face.reg
import grails.rest.*
import grails.rest.render.json.*

@Resource(uri='/users')
class User {
    String username
    Password password
}

class Password {
    String type
    String data
    String faceData
    static constraints = {
        faceData type: 'text'
    }
}
