/* Creates a new Pets object from "Pets" java class with
 * the petsList information and returns the result of the
 * method countNames
 */
function fn(data){
    var Pets = Java.type('petstore.java.Pets');
    var p = new Pets(data);
    return p.countNames();
}