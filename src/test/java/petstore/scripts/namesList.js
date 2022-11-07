/* Creates a new Names object from "Names" java class with
 * the petsList information and returns the result of the
 * method countNames
 */
function fn(data){
    var Names = Java.type('petstore.java.Names');
    var n = new Names(data);
    return n.countNames();
}