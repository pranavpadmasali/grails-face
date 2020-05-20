package face.reg

class Password {
    String type
    String data
    String faceData
    static constraints = {
        faceData type: 'text'
    }
}
