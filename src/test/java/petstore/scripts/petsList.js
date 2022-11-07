/* Creates a new json with the pets id and name information
 * and returns it as a string
 */
function fn(pets){
    let json = {};
    let array = [];
    for (var pet of pets) {
        array.push({"id": pet.id, "name": (pet.name != null ? pet.name : "")});
    }
    json.pets = array;
    return JSON.stringify(json);
}