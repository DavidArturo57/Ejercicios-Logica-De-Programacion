// EL usuario ingresa 3 números solicitados
let num1 = parseInt(prompt("Introduce el primer número:"));
let num2 = parseInt(prompt("Introduce el segundo número:"));
let num3 = parseInt(prompt("Introduce el tercer número:"));

//array almacena los tres números introducidos
let numeros = [num1, num2, num3];

// Realiza ciclo if else para saber  si los números son todos iguales
if (num1 === num2 && num2 === num3) {
    document.body.innerHTML = `<p>Todos los números son iguales: ${numeros.join(", ")}</p>`;
} else {
    // Muestran de menor a mayor
    let menorAMayor = [...numeros].sort((a, b) => a - b);

    // Muestran de mayor a menor
    let mayorAMenor = [...numeros].sort((a, b) => b - a);

    // Imprime el resultado
    document.body.innerHTML = `
        <p>Ordenados de Mayor a Menor: ${mayorAMenor.join(", ")}</p>
        <p>Ordenados de Menor a Mayor: ${menorAMayor.join(", ")}</p>
    `;
}
