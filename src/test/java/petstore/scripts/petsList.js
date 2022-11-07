/* Creates a new json with the pets' id and name information
 * and returns it as a string
 */
function fn(pets){
    let json = {};
    for (var pet of pets) {
        json[pet.id] = pet.name;
    }
    return JSON.stringify(json);
}