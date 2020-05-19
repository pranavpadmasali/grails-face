package face.reg
import grails.rest.render.json.*
import grails.rest.*
import org.springframework.transaction.annotation.Transactional

class RegisterController extends RestfulController<User>{
    static responseFormats = ['json']
    static defaultAction = "register"

    RegisterController(){
        super(User)
    }

    def index() {

     }

     @Transactional
     def register(){
        def reqobj = request.JSON
        def regUser = new User(reqobj)
        println "=-=-=-=-=-=-=-=-=-=2020-=-=-=-=-=-=-=-=-=-=-=-=-=-="
        println regUser["password"]["data"]
        regUser.save()
        render contentType: "application/json",'{"status":"Success"}'
     }

     def getMeList() {
        def usersList = User.list()
        println usersList.size()
        respond usersList
     }

     def checkOne() {
        def usersList = User.where {
            username == "ppsNew"
            }.list()
        println usersList.size()
        respond usersList
     }

     def getMePass() {
        def passList = Password.list()
        println passList.size()
        respond passList
     }

}

