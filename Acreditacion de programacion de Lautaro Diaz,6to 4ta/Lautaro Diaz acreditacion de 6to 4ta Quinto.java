 
Copiar

let artistas = [
    "C.R.O",
    "Homer El Mero Mero",
    "Duki",
    "YSY A",
    "Milo J",
    "Bhavi",
    "Eminem",
    "Imagine Dragons",
    "Tupac",
    "Ice cube"
];

console.log("Tercer elemento:", artistas[2]);
console.log("Cuarto elemento:", artistas[3]); 
console.log("Séptimo elemento:", artistas[6]);  

artistas[1] = "C.R.O"; 
artistas[2] = "Homer El Mero Mero";      
console.log("Array modificado:", artistas);

artistas.push("Bardero$"); 
console.log("Array actualizado:", artistas);

let longitudArray = artistas.length;
console.log("La longitud del arreglo es:", longitudArray); 

artistas.sort();
console.log("Array ordenado alfabéticamente:", artistas);

console.log("Elementos del array:");
for (let i = 0; i < artistas.length; i++) {
    console.log(artistas[i]);
}
