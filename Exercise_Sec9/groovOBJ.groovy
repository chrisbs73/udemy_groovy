@groovy.transform.Canonical
class soMeta {

    def prop1 = 'scare'
    def prop2 = 'me'
    String prop3

    def invokeMethod(String name, Object args) {
        println "invokeMethod was called with $name $args"
    }

    def getProperty(String name) {
        println "getProperty was called..."
        metaClass.getProperty(this, name)
    }

    void setProperty(String name, Object value) {
        println "setProperty was called with $name $value"
        metaClass.setProperty(this, name, value)
    }

}

def iMeta = new soMeta()

iMeta.iDontExist('ha','boo')

iMeta.prop1
iMeta.prop2
iMeta.prop3 = 'BOO'